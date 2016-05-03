package com.sunonline.web.bean;

import java.sql.Date;
/**
 * @author 武文良
 * @date 2016.5.3
 * <p>function:higo大学季视频bean</p>
 */
public class HigoVideoBean {
	
	private String higoVideoName;				//higoVideo视频名称
	private String higoVideoUrl;				//higoVideo视频链接
	private Date higoVideoDate;					//higoVideo视频发布时间
	private String higoVideoPicUrl;				//higoVideo视频截图链接
	private Integer higoVideoPlayedNumnber;		//higoVideo视频播放次数
	
	public String getHigoVideoName() {
		return higoVideoName;
	}
	public void setHigoVideoName(String higoVideoName) {
		this.higoVideoName = higoVideoName;
	}
	public String getHigoVideoUrl() {
		return higoVideoUrl;
	}
	public void setHigoVideoUrl(String higoVideoUrl) {
		this.higoVideoUrl = higoVideoUrl;
	}
	public Date getHigoVideoDate() {
		return higoVideoDate;
	}
	public void setHigoVideoDate(Date higoVideoDate) {
		this.higoVideoDate = higoVideoDate;
	}
	public String getHigoVideoPicUrl() {
		return higoVideoPicUrl;
	}
	public void setHigoVideoPicUrl(String higoVideoPicUrl) {
		this.higoVideoPicUrl = higoVideoPicUrl;
	}
	public Integer getHigoVideoPlayedNumnber() {
		return higoVideoPlayedNumnber;
	}
	public void setHigoVideoPlayedNumnber(Integer higoVideoPlayedNumnber) {
		this.higoVideoPlayedNumnber = higoVideoPlayedNumnber;
	}

}
