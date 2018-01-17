package com.gx.entity;

import java.sql.Date;

public class Notice {
	private int id;
	private String noticeName;
	private String noticeDescription;
	private String noticeType;
	private Date createTime;
	private Date updateTime;
	private int isUseful;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoticeName() {
		return noticeName;
	}
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	public String getNoticeDescription() {
		return noticeDescription;
	}
	public void setNoticeDescription(String noticeDescription) {
		this.noticeDescription = noticeDescription;
	}
	public String getNoticeType() {
		return noticeType;
	}
	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getIsUseful() {
		return isUseful;
	}
	public void setIsUseful(int isUseful) {
		this.isUseful = isUseful;
	}

}
