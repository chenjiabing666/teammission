package com.techwells.teammission.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {
	private static final String SALT="����";  //����
	
	/**
	 * ������ϢժҪ
	 * @param value
	 * @return
	 */
	public static String getMd5(String value){
		return DigestUtils.md5Hex(SALT+value);
	}
}
