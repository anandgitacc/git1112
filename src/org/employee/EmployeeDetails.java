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

	private void empOffice() {
		
		System.out.println("Greens");
	}
	private void empLocation() {

		System.out.println("Chennai");
	}
//<<<<<<< HEAD
//=======
		// >>>>>>> 130a7ac14c6977825a532262e3b867a2286e0053

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
