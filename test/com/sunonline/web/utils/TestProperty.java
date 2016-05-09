package com.sunonline.web.utils;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Properties;

public class TestProperty {
	
	public static void main(String[] args) {
		Properties prop = null;
		try {
			/**
			 * 相对于CLASSPATH文件
			 */
			prop = new Properties();
			prop.load(new BufferedInputStream(new FileInputStream("src/DB.properties")));
			String dirver = prop.getProperty("driver");	
			System.out.println(dirver);
		} catch (Exception e) { 
			e.printStackTrace();
			System.err.println("file not found");
		}
	}
}
