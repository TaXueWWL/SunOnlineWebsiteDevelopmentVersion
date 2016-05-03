package com.sunonline.web.bean;

import java.sql.Date;
/**
 * @author 武文良
 * @date 2016.5.3
 * <p>function:高校最强音视频bean</p>
 */
public class CollegeVoiceVideoBean {
	
	private String zqy_video_name;			//高校最强音视频名称
	private String zqy_video_url;			//最强音视频链接
	private Date zqy_video_date;			//最强音视频发布日期
	private String zqy_video_pic_url;		//最强音视频截图
	private int zqy_video_played_number;	//最强音视频播放次数
	private int zqy_player_number;			//最强音选手编号
	
	public String getZqy_video_name() {
		return zqy_video_name;
	}
	public void setZqy_video_name(String zqy_video_name) {
		this.zqy_video_name = zqy_video_name;
	}
	public String getZqy_video_url() {
		return zqy_video_url;
	}
	public void setZqy_video_url(String zqy_video_url) {
		this.zqy_video_url = zqy_video_url;
	}
	public Date getZqy_video_date() {
		return zqy_video_date;
	}
	public void setZqy_video_date(Date zqy_video_date) {
		this.zqy_video_date = zqy_video_date;
	}
	public String getZqy_video_pic_url() {
		return zqy_video_pic_url;
	}
	public void setZqy_video_pic_url(String zqy_video_pic_url) {
		this.zqy_video_pic_url = zqy_video_pic_url;
	}
	public int getZqy_video_played_number() {
		return zqy_video_played_number;
	}
	public void setZqy_video_played_number(int zqy_video_played_number) {
		this.zqy_video_played_number = zqy_video_played_number;
	}
	public int getZqy_player_number() {
		return zqy_player_number;
	}
	public void setZqy_player_number(int zqy_player_number) {
		this.zqy_player_number = zqy_player_number;
	}
	
}
