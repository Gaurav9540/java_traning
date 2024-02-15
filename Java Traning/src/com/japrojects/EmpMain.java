package com.japrojects;

public class EmpMain {

	// Main method for testing
		public static void main(String[] args) {

			// Set the company name
	        Employee.setCompanyName("Accenture");
	        
	        // Create an instance of Company
			Employee emp = new Employee(1, "John Doe", 50000, true, "IT", "2024-05-01");
			Employee emp1 = new Employee(2, "Gaurav Pawar", 60000, false, "HR", "2023-06-01");
			Employee emp2 = new Employee(2, "Manoj Avhad", 70000, false, "CSE", "2024-06-01");
			
			// Display company details
			System.out.println("Company Name: " + Employee.getCompanyName());
			System.out.println("EmpId: " + emp.getEmployeeId());
			System.out.println("Emp Name: " + emp.getName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("Department: " + emp.getDepartment());
			System.out.println("joining date: " + emp.getjoining_date());
			
			System.out.println("---------------------------------------------");
			
			System.out.println("Company Name: " + Employee.getCompanyName());
			System.out.println("EmpId: " + emp1.getEmployeeId());
			System.out.println("Emp Name: " + emp1.getName());
			System.out.println("Salary: " + emp1.getSalary());
			System.out.println("Department: " + emp1.getDepartment());
			System.out.println("joining date: " + emp1.getjoining_date());
			
            System.out.println("----------------------------------------------");
			
			System.out.println("Company Name: " + Employee.getCompanyName());
			System.out.println("EmpId: " + emp2.getEmployeeId());
			System.out.println("Emp Name: " + emp2.getName());
			System.out.println("Salary: " + emp2.getSalary());
			System.out.println("Department: " + emp2.getDepartment());
			System.out.println("joining date: " + emp2.getjoining_date());

		}

}
