package com.cons;

/* ---------------------------------Student Information------------------------------------------------------


public class ConstructorDay2 {
    int studentId;
    String studentName;
    int age;
    String city;
    
	public ConstructorDay2( int studentId ,String studentName ,  int age ,  String city) {
		this.studentId = studentId ;
		this.studentName = studentName;
		this.age = age;
		this.city = city;
	}
	
	public ConstructorDay2(Constructorday2 s) {
		this.studentId = studentId ;
		this.studentName = studentName;
		this.age = age;
		this.city = city;
	}
	
	
	public void viewInffo() {
		System.out.println(studentId + "   " + studentName + "  " +age +"  "+ city );
	}
}





//-----------------------------------------Employee Infromation-------------------------------------------------

public class ConstructorDay2 {
	int employeeId;
	String empName ;
	String city;
	double salary;
	long mobileNo;
	
	public ConstructorDay2(int employeeId,String empName ,String city,double salary ,long mobileNo) {
    		this.employeeId = employeeId;
    		this.empName = empName;
    		this.city = city;
    		this.salary  = salary;
    		this.mobileNo = mobileNo;
	}
	
	public void display() {
		System.out.println(employeeId + " "+ empName+ " "+city+ " "+salary +" "+mobileNo);
	}
}





//-----------------------------------------My Portfolio -------------------------------------------------------

public class ConstructorDay2 {
String name ;
int rollNo;
int age;
String year;
String collageName;
float marks;
String city;

public ConstructorDay2(String name , int rollNo, int age, String year, String collageName, float marks, String city) {
	this. name = name ;
	this.rollNo = rollNo;
	this. age = age;
	this. year  = year;
	this. collageName = collageName;
	this.marks = marks;
	this. city = city;
}
public void display() {
	System.out.println("--------------My Portfolio------------------");
	System.out.println(name +" "+rollNo +" "+age+" "+year+" "+collageName+" "+marks+" "+city);
}
}





//----------------------------------------------Informatation about Car---------------------------------------------

public class ConstructorDay2 {
String carName ;
String carBrand ;
int carModel;
String carColor;
int carSeatingcapacity;
long carPrice;

public ConstructorDay2(String carName ,String carBrand ,int carModel,String carColor,int carSeatingcapacity,long carPrice) {
	this. carName  = carName;
	this. carBrand = carBrand ;
	this. carModel = carModel;
	this. carColor = carColor;
	this. carSeatingcapacity = carSeatingcapacity;
	this. carPrice = carPrice;

}
public void display() {
	System.out.println("-----------------Information About Car----------------------------");
	System.out.println(carName +" "+carBrand +" "+carModel+" "+carColor+" "+carSeatingcapacity+" "+carPrice);
}
}
*/






//---------------------------------------------Information About Collage--------------------------------------------

public class ConstructorDay2 {
String collageName ;
String location;
int establishedYear;
String collageType;
String university;
String approval;
int intakeCapacity;
double fees;

public ConstructorDay2(String collageName , String location, int establishedYear, String collageType, String university, String approval, int intakeCapacity,double fees) {
	this. collageName   = collageName ;
	this. location = location ;
	this. establishedYear = establishedYear;
	this. collageType = collageType;
	this. university = university;
	this. approval = approval;
	this. intakeCapacity = intakeCapacity;
	this. fees = fees;

}
public void display() {
	System.out.println("-----------------Information About Collage----------------------------");
	System.out.println(collageName +"      "+location  +"     "+establishedYear+"     "+collageType+"     "+university+"     "+approval+"     "+intakeCapacity+"     "+fees);
}
}


