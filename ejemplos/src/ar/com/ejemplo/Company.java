package ar.com.ejemplo;

import ar.com.ejemplo.employee.Employee;

public abstract class Company {	
	
	public void createSoftware() {
		
		Employee[] employees = this.getEmployess();
		
		for (Employee employee : employees) {
			System.out.println(employee.doWork());
		}
	}
	
	public abstract Employee[] getEmployess();

}


/*
 * Designer designer = new Designer(); System.out.println(designer.doWork());
 * 
 * Programmer programmer = new Programmer();
 * System.out.println(programmer.writeCode());
 * 
 * Tester tester = new Tester(); System.out.println(tester.testSoftware());
 */