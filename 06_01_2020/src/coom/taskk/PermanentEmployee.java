package coom.taskk;

import java.time.LocalDate;

public class PermanentEmployee extends Employee {
	private double salary;
	 
	public PermanentEmployee()
	{
		super();
	}

	public PermanentEmployee(String employeeId, String employeeName, LocalDate dateOfJoining,double salary) {
		super(employeeId, employeeName, dateOfJoining);
		// TODO Auto-generated constructor stub
		this.salary=salary;
	}
	@Override
	public String getDetails() {
		
		return super.getDetails()+" Salary: "+salary;

	}
	

}
