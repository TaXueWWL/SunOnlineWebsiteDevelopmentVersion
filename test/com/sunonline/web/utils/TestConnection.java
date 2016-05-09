package com.sunonline.web.utils;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestConnection {

	@Test
	public void test() throws SQLException {
		DBUtils dbUtils = new DBUtils();
		System.out.println(dbUtils.getCon().getClass());
		dbUtils.closeCon(dbUtils.getCon(), null, null, null);
	}

}
