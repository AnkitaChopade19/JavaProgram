package com.encaps;

/*

//----------------------------Employee  Class-------------------------------------------------------------------------

public class Encapsulationday1 {
	private int empId;
	private String empCity;
	private String empName;
	private double empSalary;
	private int empExperiance;
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
	this.empId = empId;
	}

	

	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	
	public double getEmpSalary() {
		if(empSalary >= 60000) {
			System.out.println("High Salary");
		}else {
			System.out.println("low Salary");
		}
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}




 public int getEmpExperiance() {
	  if(empExperiance>= 2) {
		  System.out.println("Developer");
	  } else {
			  System.out.println("Fresher");
		  }
	  return empExperiance;
 }
 public void setEmpExperiance(int empExperiance) {
	  this.empExperiance = empExperiance;
 }

}






//--------1. Create a class with private variables---------------------------------------------------------------------

Question 1 :
Create a class Person with private variables name and age.
Add setter and getter methods.
Create an object and print the name and age.---------------------


public class Encapsulationday1 {
	private String name;
	private int age;
	
	
	public String getname() {
		return name;
   }
	public void setname(String name) {
		this.name = name;
	}
	
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	}
	
	
	
	
	
//	2. Bank Account – deposit & withdraw-------------------------------------------------------------------------------

	Question:
	Create a BankAccount class with a private balance.
	Add:
	deposit(double amount)
	withdraw(double amount)
	getBalance()---------------------------


public class Encapsulationday1 {
	private double balance;
	
	public void deposit(double amount) {
		balance += amount;
	}
	
    public void withdraw(double amount) {
   	 balance -= amount;
    }
    
    public double getbalance() {
   	 return balance;
    }
    
}



//---------Student Class---------------------------------------------------------------------------------------

Private fields: name, marks
Methods:
setMarks(int marks)
getMarks()
displayGrade() (print grade based on marks)-------------------------

*/

public class Encapsulationday1 {
	private String name;
	private int marks;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	
	
	public int getmarks() {
		return marks;
	}
	public void setmarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks = marks;
		}
		System.out.println("Marks is Invalid");
	}
	
	
	
	public void displayGrade() {
		if(marks >= 90) {
			System.out.println("A Grade");
		}else if(marks>=75) {
			System.out.println("B Grade");
		}else if(marks>=45) {
			System.out.println("C Grade");
		}else {
			System.out.println("Fail");
		}
	}
}

