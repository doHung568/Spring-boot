package com.javaweb.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.beans.BuildingDTO;

import customException.FieldRequiredException;

@RestController
public class BuildingAPI {
	@GetMapping("/test-custom-exception")
	// return Object
	public Object getBuilding(@RequestBody BuildingDTO buildingDTO) {
		// validate buildingDTO
		isNullOrEmpty(buildingDTO);
		// else return Success
		return "Success";
	}

	// check is input null or empty
	private void isNullOrEmpty(BuildingDTO buildingDTO) {
		if (buildingDTO.getName() == null || buildingDTO.getName().equals("") || buildingDTO.getFloor() == null
				|| buildingDTO.getPrice() == null) {
			// return name of exception
			// when throw exception -> Spring MVC scan @ExceptionHanlder
			throw new FieldRequiredException("Input can not be empty");
		}
	}

	@GetMapping("/test-controllerAdvice")
	public void test() {

		System.out.println(5 / 0);

	}
}