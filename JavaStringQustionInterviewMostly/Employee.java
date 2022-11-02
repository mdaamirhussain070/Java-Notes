package com.str;

public class Employee {
	private int empId;
	private String empName;
	private int empage;
	private String empGender;
	private double empSalar;
	
	
	
	
	
	
	
	public Employee(int empId, String empName, int empage, String empGender, double empSalar) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empage = empage;
		this.empGender = empGender;
		this.empSalar = empSalar;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public double getEmpSalar() {
		return empSalar;
	}
	public void setEmpSalar(double empSalar) {
		this.empSalar = empSalar;
	}
	
	
	

}
