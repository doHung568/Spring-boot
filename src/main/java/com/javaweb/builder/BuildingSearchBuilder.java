package com.javaweb.builder;

public class BuildingSearchBuilder {

	// Immutable fields - final để đảm bảo không thể thay đổi sau khi build
	private final String name;
	private final Integer floor;
	private final Long price;
	private final Double discountPercent;
	private final String address;

	/**
	 * Private constructor - chỉ Builder mới có thể tạo instance
	 * 
	 * @param builder Builder instance chứa các giá trị
	 */
	private BuildingSearchBuilder(Builder builder) {
		this.name = builder.name;
		this.floor = builder.floor;
		this.price = builder.price;
		this.discountPercent = builder.discountPercent;
		this.address = builder.address;
	}

	// Getters - chỉ đọc, không có setters (immutable)
	public String getName() {
		return name;
	}

	public Integer getFloor() {
		return floor;
	}

	public Long getPrice() {
		return price;
	}

	public Double getDiscountPercent() {
		return discountPercent;
	}

	public String getAddress() {
		return address;
	}

	/*
	 * @return new Builder instance
	 */
	public static Builder builder() {
		return new Builder();
	}

	/*
	 * Inner Builder class - chịu trách nhiệm xây dựng BuildingSearchBuilder
	 */
	public static class Builder {
		// Builder fields - có thể thay đổi trong quá trình build
		private String name;
		private Integer floor;
		private Long price;
		private Double discountPercent;
		private String address;

		/**
		 * Set building name search criteria
		 * 
		 * @param name building name (can be null)
		 * @return Builder instance for method chaining
		 */
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		/**
		 * Set floor search criteria
		 * 
		 * @param floor number of floors (can be null)
		 * @return Builder instance for method chaining
		 */
		public Builder floor(Integer floor) {
			this.floor = floor;
			return this;
		}

		/**
		 * Set minimum price search criteria
		 * 
		 * @param price minimum price (can be null)
		 * @return Builder instance for method chaining
		 */
		public Builder price(Long price) {
			this.price = price;
			return this;
		}

		/**
		 * Set discount percent search criteria
		 * 
		 * @param discountPercent discount percentage (can be null)
		 * @return Builder instance for method chaining
		 */
		public Builder discountPercent(Double discountPercent) {
			this.discountPercent = discountPercent;
			return this;
		}

		/**
		 * Set address search criteria
		 * 
		 * @param address building address (can be null)
		 * @return Builder instance for method chaining
		 */
		public Builder address(String address) {
			this.address = address;
			return this;
		}

		/**
		 * Build và trả về immutable BuildingSearchBuilder instance
		 * 
		 * @return new BuildingSearchBuilder instance
		 */
		public BuildingSearchBuilder build() {
			return new BuildingSearchBuilder(this);
		}
	}
}
