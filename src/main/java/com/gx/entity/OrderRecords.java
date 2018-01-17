package com.gx.entity;

import java.sql.Date;

public class OrderRecords {
	private int id;
	private int userID;
	private String hospitalName;
	private String officesName;
	private String doctorName;
	private String transactDate;
	private String transactTime;
	private String diseaseInfo;
	private int isSuccess;
	private int isSend;
	private int isCancel;
	private Date createTime;
	private int orderVer;
	private int isFinish;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getOfficesName() {
		return officesName;
	}
	public void setOfficesName(String officesName) {
		this.officesName = officesName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getTransactDate() {
		return transactDate;
	}
	public void setTransactDate(String transactDate) {
		this.transactDate = transactDate;
	}
	public String getTransactTime() {
		return transactTime;
	}
	public void setTransactTime(String transactTime) {
		this.transactTime = transactTime;
	}
	public String getDiseaseInfo() {
		return diseaseInfo;
	}
	public void setDiseaseInfo(String diseaseInfo) {
		this.diseaseInfo = diseaseInfo;
	}
	public int getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(int isSuccess) {
		this.isSuccess = isSuccess;
	}
	public int getIsSend() {
		return isSend;
	}
	public void setIsSend(int isSend) {
		this.isSend = isSend;
	}
	public int getIsCancel() {
		return isCancel;
	}
	public void setIsCancel(int isCancel) {
		this.isCancel = isCancel;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getOrderVer() {
		return orderVer;
	}
	public void setOrderVer(int orderVer) {
		this.orderVer = orderVer;
	}
	public int getIsFinish() {
		return isFinish;
	}
	public void setIsFinish(int isFinish) {
		this.isFinish = isFinish;
	}
	
}
