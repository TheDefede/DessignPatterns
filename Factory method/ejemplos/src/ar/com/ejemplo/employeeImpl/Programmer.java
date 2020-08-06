package ar.com.ejemplo.employeeImpl;

import ar.com.ejemplo.employee.Employee;

public class Programmer implements Employee{

	@Override
	public String doWork() {
		return "Writing code";
	}

}
