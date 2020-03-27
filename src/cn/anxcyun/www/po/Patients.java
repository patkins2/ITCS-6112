package cn.anxcyun.www.po;


    /**
    * @ClassName: User
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Anxc
    * @date 2019年8月22日
    *
    */
    
public class Patients {
	protected String username;
	protected String email;
	protected String address;
	protected String password;
	protected String telephoneNumber;
	protected String gender;
	protected String birthDate;
	protected String medicalHistory;
	
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
	
	public Patients(String username, String email, String address, String password, String telephoneNumber, String gender, String birthDate, String medicalHistory) {
		super();
		this.username = username;
		this.email = email;
		this.address = address;
		this.password = password;
		this.telephoneNumber = telephoneNumber;
		this.gender = gender;
		this.birthDate = birthDate;
		this.medicalHistory = medicalHistory;
	}

	
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
