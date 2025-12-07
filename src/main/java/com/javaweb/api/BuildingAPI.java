package com.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.BuildingDTO;
import com.javaweb.service.BuildingService;

@RestController
public class BuildingAPI {
	@Autowired
	private BuildingService buildingService;

	@GetMapping("/test-connection")
	public List<BuildingDTO> getBuilding(@RequestParam(value = "name") String name) {
		List<BuildingDTO> result = buildingService.findAll(name);

		return result;
	}

	// search building by name and address
	@GetMapping("/test-search")
	public List<BuildingDTO> searchBuilding(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "address", required = false) String address) {
		// go to business logic layer to handle
		List<BuildingDTO> result = buildingService.search(name, address);

		return result;
	}
}