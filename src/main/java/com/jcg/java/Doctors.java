package com.jcg.java;

public class Doctors {
	
	public String username, email, address, password, telephoneNumber, gender, introduction;
	public int patientNumber;
	
	
	public Doctors()
	{
		
	}
	
	public Doctors(String username, String email, String address, String password, String telephoneNumber, String gender, int patientNumber, String introduction) {
		this.username = username;
		this.email = email;
		this.address = address;
		this.password = password;
		this.telephoneNumber = telephoneNumber;
		this.gender = gender;
		this.introduction = introduction;
		this.patientNumber = patientNumber;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getTelephoneNumber()
	{
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(String telephoneNumber)
	{
		this.telephoneNumber = telephoneNumber;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public int getPatientNumber()
	{
		return patientNumber;
	}
	
	public void setPatientNumber(int patientNumber)
	{
		this.patientNumber = patientNumber;
	}
	
	public String getIntroduction()
	{
		return introduction;
	}
	
	public void setIntroduction(String introduction)
	{
		this.introduction = introduction;
	}
	
}
