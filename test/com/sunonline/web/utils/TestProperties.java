package com.sunonline.web.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
/**
 * 
 * @author 武文良
 *
 */
public class TestProperties {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(DBConfig.getInstance().getProperty("db_driver"));
	}

}
