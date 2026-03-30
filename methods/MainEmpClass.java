package com.methods;

public class MainEmpClass {
	public static void main(String args[]) {
		
		//className ObjectName = new ClassName();
		
		Employee e1 = new Employee();
		e1.empId = 1211;
		e1.empName = "Ankita";
		e1.salary = 500000;
		e1.city = "Solapur";
		
		e1.employee();
	}

}
