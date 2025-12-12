package com.javaweb.repository;

import java.util.List;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.repository.entity.BuildingEntity;

public interface BuildingRepository {

	public List<BuildingEntity> search(String name, String address);

	public List<BuildingEntity> search(BuildingSearchBuilder builder);
}
