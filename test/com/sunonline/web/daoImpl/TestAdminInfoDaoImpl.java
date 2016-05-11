package com.sunonline.web.daoImpl;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.sunonline.web.dao.AdminInfoDao;
/**
 * 
 * @author 武文良
 *
 */
public class TestAdminInfoDaoImpl {

	@Test
	public void test() throws SQLException {
		AdminInfoDao adminInfoDao = new AdminInfoDaoImpl();
		/*
		 *登录失败测试1：用户名错误 
		 */
		assertEquals(false, adminInfoDao.isAdmin("abcde", "12345"));
		/*
		 * 登录失败测试2：用户名正确，密码错误
		 */
		assertEquals(false, adminInfoDao.isAdmin("admin", "123"));
		/*
		 * 登录成功测试
		 */
		assertEquals(true, adminInfoDao.isAdmin("admin1", "123456"));
		System.out.println(adminInfoDao.isAdmin("admin1", "123456"));
		assertEquals(true, adminInfoDao.isAdmin("snowalker", "snowalker"));
		
	}

}
