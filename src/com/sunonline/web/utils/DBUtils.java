package com.sunonline.web.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author 武文良
 * <p>date 2016.5.9</p>
 * 数据库工具类，获取/关闭数据库连接
 */
public class DBUtils {

	private Connection connection = null;
	
	//定义数据库连接参数
	private String DB_Driver = null;
	private String DB_URL = null;
	private String DB_username = null;
	private String DB_password = null;
	/**
	 * 获取数据库连接
	 * @return connection
	 */
	public Connection getCon() {
		//从配置文件获取连接参数实际值
		DB_Driver = DBConfig.getInstance().getProperty("db_driver");
		DB_URL = DBConfig.getInstance().getProperty("db_url");
		DB_username = DBConfig.getInstance().getProperty("db_username");
		DB_password = DBConfig.getInstance().getProperty("db_password");
		try {
			//加载驱动
			Class.forName(DB_Driver);
			//建立连接
			connection = DriverManager.getConnection(DB_URL, DB_username, DB_password);
			System.out.println("connection successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	/**
	 * 关闭数据库连接
	 * @param connection
	 * @param statement
	 * @param preparedStatement
	 * @param resultSet
	 * @throws SQLException
	 */
	public void closeCon(Connection connection, Statement statement, PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {
		if (resultSet != null) {
			resultSet.close();
			System.out.println("关闭resultset");
		}
		if (preparedStatement != null) {
			preparedStatement.close();
			System.out.println("关闭preparedStatement");
		}
		if (statement != null) {
			statement.close();
			System.out.println("关闭statement");
		}
		if (connection != null) {
			connection.close();
			System.out.println("关闭connection");
		}
	}
}
