package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

	static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=DB_JAVA;encrypt=false;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASSWORD = "123456";

	@Override
	public List<BuildingEntity> findAll(String name) {
		String sql = "SELECT * FROM building where building_name like '%" + name + "%'";
		List<BuildingEntity> listBuildingEntities = new ArrayList<>();
		try {
			// Load driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Create connection
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// create query

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("building_name"));
				buildingEntity.setFloor(rs.getInt("floor"));
				buildingEntity.setPrice(rs.getLong("price"));
				buildingEntity.setDiscountPercent(rs.getDouble("discount_percent"));

				listBuildingEntities.add(buildingEntity);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy JDBC Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Lỗi kết nối SQL Server!");
			e.printStackTrace();
		}
		return listBuildingEntities;
	}

}
