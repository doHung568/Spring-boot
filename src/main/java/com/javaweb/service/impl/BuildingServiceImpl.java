package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.converter.BuildingDTOConverter;
import com.javaweb.converter.BuildingSearchBuilderConverter;
import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingRepository;

	@Autowired
	private BuildingDTOConverter buildingDTOConverter;

	@Autowired
	private BuildingSearchBuilderConverter builderConverter;

	@Override
	public List<BuildingDTO> searchUsingBuilder(Map<String, String> params) {
		// create list to store list building dto
		List<BuildingDTO> listBuildingDTOs = new ArrayList<BuildingDTO>();
		// create list to store list building entity
		List<BuildingEntity> listBuildingEntities = buildingRepository
				.search(builderConverter.toBuildingSearchBuilder(params));
		for (BuildingEntity buildingEntity : listBuildingEntities) {
			BuildingDTO buildingDTO = buildingDTOConverter.toDTO(buildingEntity);
			// add into list
			listBuildingDTOs.add(buildingDTO);
		}
		return listBuildingDTOs;
	}

}
