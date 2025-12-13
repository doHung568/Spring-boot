package com.javaweb.utils;

import java.util.Map;

public class MapUtil {
	/**
	 * Lấy và convert object từ Map theo key và type
	 * 
	 * @param params Map chứa các tham số
	 * @param key    Key cần lấy
	 * @param tClass Class type mong muốn (Integer, Long, String)
	 * @return Giá trị đã convert hoặc null nếu không tồn tại hoặc empty
	 */
	public static <T> T getObject(Map<String, Object> params, String key, Class<T> tClass) {
		Object object = params.get(key);

		// Nếu object null hoặc không tồn tại trong map
		if (object == null) {
			return null;
		}

		// Convert sang String để kiểm tra empty
		String stringValue = object.toString().trim();

		// Nếu là empty string, trả về null (không phải empty string)
		if (stringValue.isEmpty()) {
			return null;
		}

		// Convert theo type
		try {
			if (tClass.getTypeName().equals("java.lang.Integer")) {
				object = Integer.valueOf(stringValue);
			} else if (tClass.getTypeName().equals("java.lang.Long")) {
				object = Long.valueOf(stringValue);
			} else if (tClass.getTypeName().equals("java.lang.String")) {
				object = stringValue; // Đã là String rồi
			}
			return tClass.cast(object);
		} catch (NumberFormatException e) {
			// Nếu không parse được số, trả về null
			return null;
		}
	}
}
