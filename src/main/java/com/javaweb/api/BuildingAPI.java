package com.javaweb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BuildingAPI {
	@RequestMapping(value = "/api/building", method = RequestMethod.GET)
	public void getBuilding(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "floor", required = false) String floor,
			@RequestParam(value = "price", required = false) Integer price) {
		System.out.println(name + " " + floor + " " + price);
	}
}