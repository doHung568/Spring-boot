package com.javaweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.beans.BuildingDTO;

@RestController
public class BuildingAPI {
	@GetMapping("/api/building")
	public List<BuildingDTO> getBuilding(@RequestBody List<BuildingDTO> buildingDTO) {
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();

		// handle logic
		for (BuildingDTO buildingDTO2 : buildingDTO) {
			if (buildingDTO2.getPrice() < 100000) {
				buildingDTO2.setPrice(12388888);
			}
		}

		// add data in result
		for (BuildingDTO buildingDTO2 : buildingDTO) {
			result.add(buildingDTO2);
		}

		return result;
	}
}