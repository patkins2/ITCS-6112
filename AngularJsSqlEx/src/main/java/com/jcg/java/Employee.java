package com.jcg.java;

public class Employee {

	public int emp_id;
	public String emp_firstname, emp_lastname;

	public Employee() {}

	public Employee(int id, String firstname, String lastname) {
		this.emp_id = id;
		this.emp_firstname = firstname;
		this.emp_lastname = lastname;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_firstname() {
		return emp_firstname;
	}

	public void setEmp_name(String emp_firstname) {
		this.emp_firstname = emp_firstname;
	}

	public String getEmp_lastname() {
		return emp_lastname;
	}

	public void setEmp_lastname(String emp_lastname) {
		this.emp_lastname = emp_lastname;
	}
}