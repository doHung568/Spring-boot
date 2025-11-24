package com.javaweb.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingAPI {
	@PostMapping({ "/api/building/{id}", "/api/building/{id}/{name}" })
	public String updateBuilding(@PathVariable(required = false) String id, @PathVariable(required = false) String name,
			@RequestParam(value = "xM", required = false) String xM) {
		if (id == null) {
			id = "Missing id";
		}

		if (name == null) {
			name = "Missing name";
		}

		return id + " " + name + " " + xM;
	}
}