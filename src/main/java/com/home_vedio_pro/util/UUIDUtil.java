package com.home_vedio_pro.util;

import java.util.UUID;

/**
 * UUID
 * @author wangB
 */
public class UUIDUtil {
	
	/**
	 * 获取UUID
	 * @return string
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}