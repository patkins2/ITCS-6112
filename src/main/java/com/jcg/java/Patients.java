package com.jcg.java;

public class Patients {
	
	public String username, email, address, password, telephoneNumber, gender, birthDate, medicalHistory;
	public int patientNumber;
	
	
	public Patients()
	{
		
	}
	
	public Patients(String username, String email, String address, String password, String telephoneNumber, String gender, String birthDate, String medicalHistory) {
		this.username = username;
		this.email = email;
		this.address = address;
		this.password = password;
		this.telephoneNumber = telephoneNumber;
		this.gender = gender;
		this.birthDate = birthDate;
		this.medicalHistory = medicalHistory;
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
	
	public String getbirthDate()
	{
		return birthDate;
	}
	
	public void setbirthDate(String birthDate)
	{
		this.birthDate = birthDate;
	}
	
	public String getMedicalHistory()
	{
		return medicalHistory;
	}
	
	public void setMedicalHistory(String medicalHistory)
	{
		this.medicalHistory = medicalHistory;
	}
	
}
