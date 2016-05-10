package com.sunonline.web.utils;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author 武文良
 *
 */
public class TestStringEncodeUtils {

	@Test
	public void test() {
		assertEquals("80a19f669b02edfbc208a5386ab5036b", StringEncodeUtils.EncodePassword("admin"));
		System.out.println(StringEncodeUtils.EncodePassword("123456"));
	}

}
