package com.sunonline.web.bean;

/**
 * @author 武文良
 * @date 2016.5.3
 * <p>function:高校最强音选手bean</p>
 */
public class CollegeVoicePlayerBean {
	
	private String playerName;			//选手姓名
	private Integer playerGender;		//选手性别
	private String playerSchool;		//选手学校
	private Integer playerNumber;		//选手编号
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Integer getPlayerGender() {
		return playerGender;
	}
	public void setPlayerGender(Integer playerGender) {
		this.playerGender = playerGender;
	}
	public String getPlayerSchool() {
		return playerSchool;
	}
	public void setPlayerSchool(String playerSchool) {
		this.playerSchool = playerSchool;
	}
	public Integer getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(Integer playerNumber) {
		this.playerNumber = playerNumber;
	}
	
}
