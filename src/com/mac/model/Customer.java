package com.mac.model;

import java.util.List;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.mac.adapter.DateAdapter;

@XmlType(propOrder= {"userId", "userName", "company", "position", "joinedDate", "qual", "cars"})
public class Customer {

	private int userId;
	private String company;
	private String position;
	private Date joinedDate;
	private String userName;
	private Qualification qual;
	private List<Car> cars;
	
	public Customer() {
	}
	
	public Customer(int userId, String company, String position,
			Date joinedDate, String userName, Qualification qual, List<Car> cars) {
		super();
		this.userId = userId;
		this.company = company;
		this.position = position;
		this.joinedDate = joinedDate;
		this.userName = userName;
		this.qual = qual;
		this.cars = cars;
	}
	@XmlElement(name="user_id")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@XmlElement(name="joined_date")
	@XmlJavaTypeAdapter(DateAdapter.class)
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Qualification getQual() {
		return qual;
	}
	public void setQual(Qualification qual) {
		this.qual = qual;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}


}
