package com.javaweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.beans.BuildingDTO;
import com.javaweb.beans.ErrorResponseDTO;

@RestController
public class BuildingAPI {
	@GetMapping("/test-error")
	// return Object
	public Object getBuilding() {
		BuildingDTO buildingDTO = new BuildingDTO();

		ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
		try {
			// error
			System.out.println(5 / 0);
		} catch (Exception e) {
			errorResponseDTO.setNameOfError(e.getMessage());
			List<String> detailsList = new ArrayList<>();
			detailsList.add("Error divide by 0");
			detailsList.add("Error input < 10");
			errorResponseDTO.setDetails(detailsList);
			// return error
			return errorResponseDTO;
		}

		buildingDTO.setName("Vinhome");
		buildingDTO.setFloor(10);
		// return Object BuildingDTO
		return buildingDTO;
	}
}