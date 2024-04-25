package com.coderszone.utility;

import java.util.Collection;

public class ValidationUtil {

	public static <T> boolean isValidCollection(Collection<T> obj) {
		if (obj != null && !obj.isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isValidString(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}
		return true;
	}

}
