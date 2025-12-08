package com.javaweb.repository.entity;

public class BuildingEntity {
	private String name;
	private int floor;
	private long price;
	private double discountPercent;
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
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}

	/**
	 * @return the discountPrice
	 */
	public double getDiscountPercent() {
		return discountPercent;
	}

	/**
	 * @param discountPrice the discountPrice to set
	 */
	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	/**
	 * @return the adress
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
