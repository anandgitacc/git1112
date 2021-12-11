package org.employee;
//             class name
public class EmployeeDetails {
	
	// method 1
	public void empName() {

		System.out.println("employee name is : anand");
	}
	// method 2
	public void empMobile() {

		System.out.println("employee mobile : 8939278836");
	}
	// method 3
	public void empAdd() {

		System.out.println("chennai");
	}

	// main method
	public static void main(String[] args) {
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
		e.empMobile();
		e.empAdd();

	}
}
