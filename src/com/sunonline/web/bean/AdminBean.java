package com.sunonline.web.bean;
/**
 * @author 武文良
 * @date 2016.5.3
 * <p>function:管理员bean</p>
 */
public class AdminBean {
	
	private String adminName;		//管理员登录名
	private String adminPasswd;		//管理员登录密码
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPasswd() {
		return adminPasswd;
	}
	public void setAdminPasswd(String adminPasswd) {
		this.adminPasswd = adminPasswd;
	}
	
	
}
