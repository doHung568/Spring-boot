package com.javaweb.utils;

public class NumberUtil {
	public static boolean isValidFloor(Integer data) {
		return data > 0;
	}

	public static boolean isValidPrice(Long data) {
		return data > 0;
	}

	public static boolean isValidDiscount(Double data) {
		return data > 0 && data < 1;
	}
}
