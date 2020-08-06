package ar.com.ejemplo;

import ar.com.ejemplo.employee.Employee;
import ar.com.ejemplo.employeeImpl.Designer;
import ar.com.ejemplo.employeeImpl.Programmer;
import ar.com.ejemplo.employeeImpl.Tester;

public class GameCompany extends Company {

	@Override
	public Employee[] getEmployess() {
		
		Employee[] theEmployee  = {
				new Designer(),
				new Programmer(),
				new Tester()
		};
		
		return theEmployee;
	}

}
