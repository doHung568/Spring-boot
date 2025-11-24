package com.javaweb.beans;

public class BuildingDTO {
	private String name;
	private Integer floor;
	private Integer price;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the floor
	 */
	public Integer getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

}
