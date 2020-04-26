package cn.anxcyun.www.po;
    
public class Doctor {
	protected String username;
	protected String email;
	protected String address;
	protected String password;
	protected String telephoneNumber;
	protected String gender;
	protected String introduction;
	protected int patientNumber;
	protected boolean status;
	
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
	
	public boolean getStatus()
	{
		return status;
	}
	
	public void setStatus(boolean bool)
	{
		this.status = bool;
	}
	public String toString()
	{
		return this.email + "|||" + this.username + "|||" + this.introduction;
		
	}
	public Doctor(String username, String email, String address, String password, String telephoneNumber, String gender, int patientNumber, String introduction) {
		super();
		this.username = username;
		this.email = email;
		this.address = address;
		this.password = password;
		this.telephoneNumber = telephoneNumber;
		this.gender = gender;
		this.introduction = introduction;
		this.patientNumber = patientNumber;
	}
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
