package com.javaweb.repository;

import java.util.List;

import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository {
	public List<BuildingEntity> findAll(String name);
}
