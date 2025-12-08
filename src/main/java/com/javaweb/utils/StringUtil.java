package com.javaweb.utils;

public class StringUtil {

	public static boolean isValidString(String data) {
		if (data != null && !data.equals("")) {
			return true;
		}
		return false;
	}
}
