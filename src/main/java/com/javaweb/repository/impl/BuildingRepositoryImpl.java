package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.utils.ConnectionUtil;
import com.javaweb.utils.StringUtil;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

	@Override
	public List<BuildingEntity> findAll(String name) {
		String sql = "SELECT * FROM building where building_name like '%" + name + "%'";
		List<BuildingEntity> listBuildingEntities = new ArrayList<>();
		try {
			// Create connection
			Connection conn = ConnectionUtil.getConnection();

			// create query
			Statement stmt = conn.createStatement();

			// execute query
			ResultSet rs = stmt.executeQuery(sql);

			// get DB
			while (rs.next()) {
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("building_name"));
				buildingEntity.setFloor(rs.getInt("floor"));
				buildingEntity.setPrice(rs.getLong("price"));
				buildingEntity.setDiscountPercent(rs.getDouble("discount_percent"));
				buildingEntity.setAddress(rs.getString("address"));
				// add into list
				listBuildingEntities.add(buildingEntity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBuildingEntities;
	}

	@Override
	public List<BuildingEntity> search(String name, String address) {
		// sql query
		StringBuilder sql = new StringBuilder("SELECT * FROM BUILDING WHERE 1 = 1");
		if (StringUtil.isValidString(name)) {
			sql.append(" AND building_name like '%" + name + "%'");
		}

		if (StringUtil.isValidString(address)) {
			sql.append(" AND address like '%" + address + "%'");
		}
		List<BuildingEntity> listBuildingEntities = new ArrayList<>();
		try {

			// Create connection
			Connection conn = ConnectionUtil.getConnection();
			// create query
			Statement stmt = conn.createStatement();

			// execute query
			ResultSet rs = stmt.executeQuery(sql.toString());

			while (rs.next()) {
				// get DB
				BuildingEntity buildingEntity = new BuildingEntity();
				buildingEntity.setName(rs.getString("building_name"));
				buildingEntity.setFloor(rs.getInt("floor"));
				buildingEntity.setPrice(rs.getLong("price"));
				buildingEntity.setDiscountPercent(rs.getDouble("discount_percent"));
				buildingEntity.setAddress(rs.getString("address"));
				// add into list
				listBuildingEntities.add(buildingEntity);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBuildingEntities;
	}

}
