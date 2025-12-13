package com.javaweb.model;

public class BuildingDTO {
	private String name;
	private Integer floor;
	private Long beforePrice;
	private Long afterPrice;
	private String address;

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
	 * @return the beforePrice
	 */
	public Long getBeforePrice() {
		return beforePrice;
	}

	/**
	 * @param beforePrice the beforePrice to set
	 */
	public void setBeforePrice(Long beforePrice) {
		this.beforePrice = beforePrice;
	}

	/**
	 * @return the afterPrice
	 */
	public Long getAfterPrice() {
		return afterPrice;
	}

	/**
	 * @param afterPrice the afterPrice to set
	 */
	public void setAfterPrice(Long afterPrice) {
		this.afterPrice = afterPrice;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
