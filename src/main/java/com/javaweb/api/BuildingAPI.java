package com.javaweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaweb.beans.BuildingDTO;

@Controller
public class BuildingAPI {
	@ResponseBody
	@RequestMapping(value = "/api/building", method = RequestMethod.GET)
	public List<BuildingDTO> getBuilding(@RequestBody List<BuildingDTO> buildingDTO) {
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();

		// handle logic
		for (BuildingDTO buildingDTO2 : buildingDTO) {
			if (buildingDTO2.getPrice() < 100000) {
				buildingDTO2.setPrice(88888);
			}
		}

		// add data in result
		for (BuildingDTO buildingDTO2 : buildingDTO) {
			result.add(buildingDTO2);
		}

		return result;
	}
}