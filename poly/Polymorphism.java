package com.poly;

public class Polymorphism {
/*	//addition
	
 public int add(int a , int b) {
	 return a+b;
 }
 public int add(int a, int b , int c) {
	 return a+b+c;
 }
	
	//based on order------------------------
	
	public void sum(int a  , long b ) {
		System.out.println(a+b);
	}
	public void sum(long a , int b) {
		System.out.println(a+b);
	}
 
	
	// Based on Type -----------------------------------

	void add(int a, int b) {
			System.out.println(a + b);
		}
	
		void add(long a, long b) {
			System.out.println(a + b);
		}

	
		
	//Based on Number------------------------------------------

		void add(int a) {
			System.out.println(a );
		}
	
		void add(int a, int b) {
		System.out.println(a + b);
		}
		
	
	
	
	public static void main(String args[] , int a) {
		System.out.println(a);
	}
	
	
	
	Ploymorphism(){
		
	}
	Ploymorphism(int a){
		
	}
	
	
	
	
//1.Create a class Calculator and overload add() to add:
		two integers
		three integers------------------------------------------------------------------------------------------
	
	
	
	 int add(int a , int b) {
		 System.out.println("Addition is two integers= " + a+b);
		return 4;
	}
	 int add(int a , int b, int c) {
		 System.out.println("Addition is three integers= " + a+b+c);
		 return 3;
	 }
	
	
	
	2.Overload a method multiply() to multiply:
two int values
two double values----------------------------------------------------------------------------------------

   void multiply(int a, int b) {
	   System.out.println("Multiplication is two integers= " + a*b);
   }
   void multiply(double a , double b) {
	   System.out.println("Multiplication is two integers= " + a*b);
   }
   
   
   
	3.Create a method area() to calculate:
area of circle
area of rectangle---------------------------------------------------------------------------------------
	double circle(double radius) {
		return 3.14 * radius * radius;
	}
	double circle(double breath , double length) {
		 return length * breath;
	}
	
	
	
4.Overload a method display() to print:
integer value
string value----------------------------------------------------------------------------------------------------------	
	
	void display(int a) {
		System.out.println("integer value = " +a);
	}
	void display(String name) {
		System.out.println("String value = " + name);
	}
	
	
	
5.Overload sum() using different data types:
		sum(int, int)
		sum(float, float)--------------------------------------------------------------------------------------------------
	
	
	void sum(int a , int b) {
		System.out.println("sum = " + a+b);
	}
	void sum(float a, float b) {
		System.out.println("sum = " + a+b);
	}

	
6.Create a class Demo and overload show() using:
		(int, String)
		(String, int)---------------------------------------------------------------------------------------------------------
	
	void show(int a ,String s) {
		System.out.println(a);
		System.out.println(s);
	}
	void show(String s1, int a1) {
		System.out.println(s1);
		System.out.println(a1);
	}
	
	
	
	
7. Overload a constructor in a Student class to initialize:
		default values
		only id
		id and name------------------------------------------------------------------------------------------------
	
	
	void student(int id) {
		System.out.println(id);
	}
	void student(int id , String name) {
		System.out.println(id);
		System.out.println(name);
	}
	
	
8. Overload a static method print() with:
		one parameter
		two parameters-------------------------------------------------------------------------------------------

	
	static void print(String msg) {
		System.out.println(msg);
	}
	static void print(String msg , int id) {
		System.out.println(msg);
		System.out.println(id);
	}
	
	
	
9. Can you overload the main() method? Write a program to prove it.	----------------------------------------
	
	public static void main (String args[]) {
		System.out.println("main method");
	}
	void main(int a) {
		System.out.println("overload main method with "+a);
	}
	void main(int a, String name) {
		System.out.println("overload main method with "+a);
		System.out.println("overload main method with"+name);
	}
	
	
10.Overload a method calculate() to find:
		square of a number
		cube of a number------------------------------------------------------------------------------------------
	
	
	int calculate(int a ) {
		return a*a;
		}
	double calculate(double a) {
		return a*a*a;
	}
	
	
	
11. Create a method max() to find maximum of:
		two numbers
		three numbers--------------------------------------------------------------------------------------------
	
	
	void max(int a, int b) {
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
	}
	void max(int a , int b , int c) {
		if(a>b && a>c ) {
			System.out.println("a is greater");
		}else if(b>c) {
			System.out.println("b is greater");
		}else {
			System.out.println("c is greater");
		}
	}
	
	
	
12. Overload details() method to display:
		name
		name and age	------------------------------------------------------------------------------------
	
	void details(String name) {
		System.out.println(name);
	}
	void details(String name , int age) {
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
13. Overload a method convert() to convert:
		Celsius to Fahrenheit
		Fahrenheit to Celsius-----------------------------------------------------------------------
	
	//celsius to Fahrenheit
	double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius
    double convert(double temperature, char scale) {
        if (scale == 'F' || scale == 'f') {
            return (temperature - 32) * 5 / 9;
        } else {
            System.out.println("Invalid scale!");
            return 0;
        }
    }
	
	
14. Write a program to show that return type alone cannot overload a method.-----------------------------------
	
	int display() {
        return 10;
    }
	int display(int a, int b) {
        return a + b;
    }

	
	
15. Overload a method login() with:
		username
		username and password----------------------------------------------------------------------------*/
	
	void login(String username) {
		System.out.println(username);
	}
	void login(String username, long password) {
		System.out.println(username);
		System.out.println(password);
	}
}	
	
	
	
	
	
	
	

