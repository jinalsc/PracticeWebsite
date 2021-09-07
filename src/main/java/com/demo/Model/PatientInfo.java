package com.demo.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SignUp")
public class PatientInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="full_name", nullable = false)
	private String fullName;
	
	@Column(name="mobile_number",nullable = false)
	private String mobileNumber;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="username",unique=true)
	private String username;
	
	@Column(name="password",nullable = false)
	private String password;
	

	public PatientInfo() {
		super();
	}
	
	public PatientInfo(String fullName, String mobileNumber, int age, String gender, Date dob,
			String username, String pwd) {
		super();
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.username = username;
		this.password = pwd;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return password;
	}

	public void setPwd(String pwd) {
		this.password = pwd;
	}

	@Override
	public String toString() {
		return "PatientInfo [id=" + id + ", fullName=" + fullName + ", mobileNumber=" + mobileNumber + ", age=" + age
				+ ", gender=" + gender + ", dob=" + dob + ", username=" + username + ", pwd=" + password + "]";
	}

	
}
