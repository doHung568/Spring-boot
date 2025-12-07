package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public List<BuildingDTO> findAll(String name) {
		List<BuildingDTO> listBuildingDTOs = new ArrayList<>();
		// go to Data Access Layer to get data
		List<BuildingEntity> listBuildingEntities = buildingRepository.findAll(name);

		for (BuildingEntity item : listBuildingEntities) {
			BuildingDTO building = new BuildingDTO();
			building.setName(item.getName());
			building.setFloor(item.getFloor());
			building.setBeforePrice(item.getPrice());
			building.setAfterPrice((long) (item.getPrice() * (1 - item.getDiscountPercent())));
			building.setAddress(item.getAdress());

			listBuildingDTOs.add(building);
		}

		return listBuildingDTOs;
	}

	@Override
	public List<BuildingDTO> search(String name, String address) {
		List<BuildingDTO> listBuildingDTOs = new ArrayList<BuildingDTO>();

		// go to Data Access layer to get data
		List<BuildingEntity> listBuildingEntities = buildingRepository.search(name, address);
		for (BuildingEntity item : listBuildingEntities) {
			BuildingDTO building = new BuildingDTO();
			building.setName(item.getName());
			building.setFloor(item.getFloor());
			building.setBeforePrice(item.getPrice());
			building.setAfterPrice((long) (item.getPrice() * (1 - item.getDiscountPercent())));
			building.setAddress(item.getAdress());
			listBuildingDTOs.add(building);
		}

		return listBuildingDTOs;
	}

}
