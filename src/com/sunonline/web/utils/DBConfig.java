package com.sunonline.web.utils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Properties;
/**
 * 
 * @author 武文良
 * <p>date 2016.5.9</p>
 * 读取配置文件，采用单例模式，保证每次获取的是同一个实例
 *
 */
public final class WebConfig extends Properties {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static WebConfig instance;
	//获取webconfig实例
	public static WebConfig getInstance() {
		if (instance != null) {
			return instance;
		} else {
			createInstance();
			return instance;
		}
	}
	//创建实例
	public static void createInstance() {
		if (instance == null) {
			instance = new WebConfig();
		}
	}
	
	public WebConfig() {
		try {
			load(new BufferedInputStream(
					new FileInputStream("src/DB.properties")));
		} catch (Exception e) {
			System.out.println("读取配置文件失败！，请确定db.properties文件存在");
		}
	}
}
