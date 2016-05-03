package com.sunonline.web.bean;

import java.sql.Date;
/**
 * @author 武文良
 * @date 2016.5.3
 * <p>function:高校人物风采录bean</p>
 */
public class CollegePioneerIntro {
	
	private String fclName;				//风采录新闻名称
	private String fclUrl;				//风采录新闻地址
	private Date fclUploadDate;			//风采录上传时间
	
	public String getFclName() {
		return fclName;
	}
	public void setFclName(String fclName) {
		this.fclName = fclName;
	}
	public String getFclUrl() {
		return fclUrl;
	}
	public void setFclUrl(String fclUrl) {
		this.fclUrl = fclUrl;
	}
	public Date getFclUploadDate() {
		return fclUploadDate;
	}
	public void setFclUploadDate(Date fclUploadDate) {
		this.fclUploadDate = fclUploadDate;
	}
	
}
