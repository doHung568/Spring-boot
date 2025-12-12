package com.javaweb.converter;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.javaweb.builder.BuildingSearchBuilder;

@Component
public class BuildingSearchBuilderConverter {
	public BuildingSearchBuilder toBuildingSearchBuilder(Map<String, String> params) {
		BuildingSearchBuilder buildingSearchBuilder = BuildingSearchBuilder.builder().name(params.get("name"))
				.address(params.get("address")).floor(Integer.parseInt(params.get("floor")))
				.price(Long.parseLong(params.get("price"))).build();

		return buildingSearchBuilder;
	}
}
