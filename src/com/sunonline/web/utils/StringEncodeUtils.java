package com.sunonline.web.utils;

import org.apache.shiro.crypto.hash.Md5Hash;
import com.sunonline.web.global.StringGlobal;

/**
 * @author 武文良
 * @date 2016.5.9
 * <p>
 * 字符串加密工具类
 * </p>
 */
public final class StringEncodeUtils {
	/**
	 * @author 武文良
	 * @param NormalPassword 输入欲加密的字符串
	 * @return String 返回MD5加密之后的字符串
	 */
	public static String EncodePassword(String NormalPassword) {

		String md5PasswordStr = new Md5Hash(NormalPassword, StringGlobal.STRING_SALT).toString();
		return md5PasswordStr;
	}
}
