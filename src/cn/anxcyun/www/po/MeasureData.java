package cn.anxcyun.www.po;
    
public class MeasureData {
	public MeasureData(String date, String height, String weight, String bloodPressure, String bloodSugar,
			String temp) {
		super();
		this.date = date;
		this.height = height;
		this.weight = weight;
		this.bloodPressure = bloodPressure;
		this.bloodSugar = bloodSugar;
		this.temp = temp;
	}


	protected String date;
	protected String height;
	protected String weight;
	protected String bloodPressure;
	protected String bloodSugar;
	protected String temp;
	
	
	public MeasureData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getBloodPressure() {
		return bloodPressure;
	}


	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}


	public String getBloodSugar() {
		return bloodSugar;
	}


	public void setBloodSugar(String bloodSugar) {
		this.bloodSugar = bloodSugar;
	}


	public String getTemp() {
		return temp;
	}


	public void setTemp(String temp) {
		this.temp = temp;
	}
	
}
