/*
 * 
 * Have an understanding about class and object concept

1. Create a Class name "TestStudent1" with a main() method.
2. Implement a class Student (State: id,name,age) in the same Class file.
3. Create a new object of class Student and print id and name.

4. Assign name of student by reference variable.

5. Initialization through method

	1. Create a new object S2.
	2. Implement a method to set values by reference in Student class.
	3. Implement a method to display set values.

6. Initialization through a constructor

 * 
 * 
 * 
 */


package com.oop.test_1;

class Student{	
	
	  int id;
	  String name;
	  
	  void insertRec(int stid, String stname) {
		  
		  id = stid;
		  name = stname;
	  }
	  
	  void displayData() { 
		  
			System.out.println("Assigned id:"+id);
			System.out.println("Assigned name:"+name);
	  }
}

public class TestStudent1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.id);
		System.out.println(s1.name);
	
		//initialize the object through a reference variable
		s1.name = "Joey";
		System.out.println(s1.name);
		
		//insert data my method
		s2.insertRec(2, "Jeniffer");
		s2.displayData();
	}
}