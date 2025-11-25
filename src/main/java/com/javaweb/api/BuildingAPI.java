package com.javaweb.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.beans.BuildingDTO;
import com.javaweb.beans.ErrorResponseDTO;

import customException.FieldRequiredException;

@RestController
public class BuildingAPI {
	@GetMapping("/test-custom-exception")
	// return Object
	public Object getBuilding(@RequestBody BuildingDTO buildingDTO) {

		// validate buildingDTO
		try {
			isNullOrEmpty(buildingDTO);
		} catch (FieldRequiredException e) {
			ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
			errorResponseDTO.setNameOfError(e.getMessage());
			List<String> detailsList = new ArrayList<>();
			// add details for exception
			detailsList.add("Requird re-check input name");
			detailsList.add("Requird re-check input floor");
			detailsList.add("Requird re-check input price");
			errorResponseDTO.setDetails(detailsList);
			// return error
			return errorResponseDTO;
		}
		// else return Success
		return "Success";
	}

	// check is input null or empty
	private void isNullOrEmpty(BuildingDTO buildingDTO) throws FieldRequiredException {
		if (buildingDTO.getName() == null || buildingDTO.getName().equals("") || buildingDTO.getFloor() == null
				|| buildingDTO.getPrice() == null) {
			// return name of exception
			throw new FieldRequiredException("Input can not be empty");
		}
	}
}