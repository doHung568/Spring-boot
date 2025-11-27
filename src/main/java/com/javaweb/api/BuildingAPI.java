package com.javaweb.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.beans.BuildingDTO;

@RestController
public class BuildingAPI {

	static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=DB_JAVA;encrypt=false;trustServerCertificate=true";
	static final String USER = "sa";
	static final String PASSWORD = "123456";

	@GetMapping("/test-connection")
	public List<BuildingDTO> getBuilding() {

		List<BuildingDTO> listBuildingDTOs = new ArrayList<>();
		try {
			// Load driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Create connection
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// create query
			String sql = "SELECT * FROM building";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				BuildingDTO buildingDTO = new BuildingDTO();
				buildingDTO.setName(rs.getString("building_name"));
				buildingDTO.setFloor(rs.getInt("floor"));
				buildingDTO.setPrice(rs.getLong("price"));

				listBuildingDTOs.add(buildingDTO);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy JDBC Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Lỗi kết nối SQL Server!");
			e.printStackTrace();
		}
		return listBuildingDTOs;
	}
}