package com.sunonline.web.bean;
/** 
 * @author 武文良
 * @date 2016.5.3
 * <p>function:用户注册bean</p>
 */
public class UserLoginBean {

	private String userName;			//用户注册名称
	private String userMobile;			//用户注册手机
	private String userPwd; 			//用户密码
	
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	
}
