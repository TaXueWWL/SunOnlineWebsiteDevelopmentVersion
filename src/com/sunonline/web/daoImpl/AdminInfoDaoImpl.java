package com.sunonline.web.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sunonline.web.dao.AdminInfoDao;
import com.sunonline.web.utils.DBUtils;
import com.sunonline.web.utils.StringEncodeUtils;

/**
 * 管理员数据访问对象实现类
 * 
 * @author SnoWalker.wwl
 *         <p>
 *         2016.5.10
 *         </p>
 */
public class AdminInfoDaoImpl implements AdminInfoDao {

	@Override
	public Boolean isAdmin(String adminname, String passwd) throws SQLException {

		String passwdInDB = null;
		/* 获取数据库连接 */
		DBUtils dbUtils = new DBUtils();
		
		System.out.println(dbUtils.getCon().getClass());
		
		Connection conn = dbUtils.getCon();
		/* 通过当前输入的用户名查询其密码 */
		String sql = "select admin_pwd from administrator where admin_name=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, adminname);
		/* 获取结果集 */
		ResultSet rs = pstmt.executeQuery();
		/* 查询到则遍历数据库 */
		while ((rs.next())) {
			passwdInDB = rs.getString("admin_pwd");
		}
		/* 对输入的密码进行MD5加密 */
		String encodedPasswd = StringEncodeUtils.EncodePassword(passwd);
		/* 将加密后的密码同数据库中的密文进行比对 */
		if (encodedPasswd.equals(passwdInDB)) {
			System.out.println(encodedPasswd);
			return true;
		} else {
			return false;
		}

	}

}
