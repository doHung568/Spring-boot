package com.javaweb.converter;

import org.springframework.stereotype.Component;

import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.entity.BuildingEntity;

@Component
public class BuildingDTOConverter {
	public BuildingDTO toDTO(BuildingEntity entity) {
		BuildingDTO dto = new BuildingDTO();

		dto.setName(entity.getName());
		dto.setFloor(entity.getFloor());
		dto.setBeforePrice(entity.getPrice());
		dto.setAfterPrice((long) (entity.getPrice() * (1 - entity.getDiscountPercent())));
		dto.setAddress(entity.getAddress());

		return dto;
	}
}
