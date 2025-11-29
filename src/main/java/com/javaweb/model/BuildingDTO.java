package com.javaweb.model;

public class BuildingDTO {
	private String name;
	private int floor;
	private long beforePrice;
	private long afterPrice;

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
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * @return the beforePrice
	 */
	public long getBeforePrice() {
		return beforePrice;
	}

	/**
	 * @param beforePrice the beforePrice to set
	 */
	public void setBeforePrice(long beforePrice) {
		this.beforePrice = beforePrice;
	}

	/**
	 * @return the afterPrice
	 */
	public long getAfterPrice() {
		return afterPrice;
	}

	/**
	 * @param afterPrice the afterPrice to set
	 */
	public void setAfterPrice(long afterPrice) {
		this.afterPrice = afterPrice;
	}

}
