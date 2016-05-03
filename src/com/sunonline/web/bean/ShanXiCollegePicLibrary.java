package com.sunonline.web.bean;

import java.sql.Date;

public class ShanXiCollegePicLibrary {
	
	private String pic_lib_name;				//山西高校图片库：图片名称
	private String pic_lib_url;					//图片存储路径
	private String pic_lib_school;				//图片所属学校
	private String pic_lib_uploader;  			//图片上传者
	private Date pic_lib_date;					//上传日期
	private String HDpic_lib_url;				//高清图片地址
	
	public String getPic_lib_name() {
		return pic_lib_name;
	}
	public void setPic_lib_name(String pic_lib_name) {
		this.pic_lib_name = pic_lib_name;
	}
	public String getPic_lib_url() {
		return pic_lib_url;
	}
	public void setPic_lib_url(String pic_lib_url) {
		this.pic_lib_url = pic_lib_url;
	}
	public String getPic_lib_school() {
		return pic_lib_school;
	}
	public void setPic_lib_school(String pic_lib_school) {
		this.pic_lib_school = pic_lib_school;
	}
	public String getPic_lib_uploader() {
		return pic_lib_uploader;
	}
	public void setPic_lib_uploader(String pic_lib_uploader) {
		this.pic_lib_uploader = pic_lib_uploader;
	}
	public Date getPic_lib_date() {
		return pic_lib_date;
	}
	public void setPic_lib_date(Date pic_lib_date) {
		this.pic_lib_date = pic_lib_date;
	}
	public String getHDpic_lib_url() {
		return HDpic_lib_url;
	}
	public void setHDpic_lib_url(String hDpic_lib_url) {
		HDpic_lib_url = hDpic_lib_url;
	}
	
}
