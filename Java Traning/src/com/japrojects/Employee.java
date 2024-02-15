package com.japrojects;

public class Employee {
	
	// Static variable
    private static String companyName;

    // Non-static variables
	private int employeeId;
	private String name;
	private double salary;
	private boolean isFullTime;
	private String department;
	private String joining_date;

	// Constructor
	public Employee(int employeeId, String name, double salary, boolean isFullTime, String department,
			String joining_date) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.isFullTime = isFullTime;
		this.department = department;
		this.joining_date = joining_date;
	}

	// Getters and setters for non-static variables
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isFullTime() {
		return isFullTime;
	}

	public void setFullTime(boolean fullTime) {
		isFullTime = fullTime;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getjoining_date() {
		return joining_date;
	}

	public void setjoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	
	// Getter and setter methods for static variable
    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    

}
