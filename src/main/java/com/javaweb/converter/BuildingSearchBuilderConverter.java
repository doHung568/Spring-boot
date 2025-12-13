package com.javaweb.converter;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.javaweb.builder.BuildingSearchBuilder;
import com.javaweb.utils.MapUtil;

@Component
public class BuildingSearchBuilderConverter {
	public BuildingSearchBuilder toBuildingSearchBuilder(Map<String, Object> params) {
		// Sử dụng MapUtil.getObject() trực tiếp để lấy giá trị và convert
		// MapUtil.getObject() đã trả về giá trị đã convert, không cần gọi thêm params.get()
		BuildingSearchBuilder buildingSearchBuilder = BuildingSearchBuilder.builder()
				.name(MapUtil.getObject(params, "name", String.class))
				.address(MapUtil.getObject(params, "address", String.class))
				.floor(MapUtil.getObject(params, "floor", Integer.class))
				.price(MapUtil.getObject(params, "price", Long.class))
				.build();

		return buildingSearchBuilder;
	}
}
