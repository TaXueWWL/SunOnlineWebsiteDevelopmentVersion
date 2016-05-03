package com.sunonline.web.bean;

import java.sql.Date;
/**
 * @author 武文良
 * @date 2016.5.3
 * <p>function:影视老司机bean</p>
 */
public class OldDriverVideoBean {
	
	private String lsj_video_name;					//老司机视频名称
	private String lsj_video_url;					//老司机视频链接
	private Date lsj_video_date;					//老司机视频上传时间
	private String lsj_video_pic_url;				//老司机视频图片截图链接
	private Integer lsj_video_played_number;	    //老司机视频播放次数
	
	public String getLsj_video_name() {
		return lsj_video_name;
	}
	public void setLsj_video_name(String lsj_video_name) {
		this.lsj_video_name = lsj_video_name;
	}
	public String getLsj_video_url() {
		return lsj_video_url;
	}
	public void setLsj_video_url(String lsj_video_url) {
		this.lsj_video_url = lsj_video_url;
	}
	public Date getLsj_video_date() {
		return lsj_video_date;
	}
	public void setLsj_video_date(Date lsj_video_date) {
		this.lsj_video_date = lsj_video_date;
	}
	public String getLsj_video_pic_url() {
		return lsj_video_pic_url;
	}
	public void setLsj_video_pic_url(String lsj_video_pic_url) {
		this.lsj_video_pic_url = lsj_video_pic_url;
	}
	public Integer getLsj_video_played_number() {
		return lsj_video_played_number;
	}
	public void setLsj_video_played_number(Integer lsj_video_played_number) {
		this.lsj_video_played_number = lsj_video_played_number;
	}

}
