package com.javaweb.service;

import java.util.List;
import java.util.Map;

import com.javaweb.model.BuildingDTO;

public interface BuildingService {

	public List<BuildingDTO> searchUsingBuilder(Map<String, String> params);
}
