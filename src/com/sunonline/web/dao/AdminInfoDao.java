package com.sunonline.web.dao;

import java.sql.SQLException;
/**
 * 管理员数据访问对象接口
 * @author SnoWalker.wwl
 * <p>2016.5.10</p>
 */
public interface AdminInfoDao {
	/*判断管理员是否在数据库中*/
	public Boolean isAdmin(String adminname, String passwd) throws SQLException;
}
