package com.javaweb.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javaweb.model.BuildingDTO;
import com.javaweb.repository.entity.BuildingEntity;

@Component
public class BuildingDTOConverter {

	@Autowired
	private ModelMapper modelMapper;

	public BuildingDTO toDTO(BuildingEntity entity) {
		BuildingDTO dto = modelMapper.map(entity, BuildingDTO.class);

		dto.setBeforePrice(entity.getPrice());
		dto.setAfterPrice((long) (entity.getPrice() * (1 - entity.getDiscountPercent())));

		return dto;
	}
}
