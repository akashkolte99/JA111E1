package com.que2;

import java.util.Scanner;

public class Course {

	static Scanner scanner = new Scanner(System.in);
	int courseId;
	String courseName; 
	int courseFee; 
	public void  displayCourseDetails() {
		System.out.println("...............");
		System.out.println("Course Id :"+ courseId);
		System.out.println("Course name :"+ courseName);
		System.out.println("Course Fee :"+ courseFee);
	}
	public void setcourseId(int id) {
		this.courseId=id;
	}
	public void setcourseName(String name) {
		this.courseName=name;
	}
	public void setcoursefee(int fee) {
		this.courseFee=fee;
	}
	static void authenticate(String username , String password) {
		if(username.equals("Admin")&& password.equals("1234")) {
			Course c1 = new Course();
			System.out.println("Enter Course Id ");
			c1.setcourseId(scanner.nextInt());
			System.out.println("Enter Course Name");
			c1.setcourseName(scanner.next());
			System.out.println("Enter Course Fees");
			c1.setcoursefee(scanner.nextInt());
			
			c1.displayCourseDetails();
		}else {
			System.out.println("Invalid Username or password");
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("First Time");
		System.out.println("...............");
		authenticate("Admin","1234");
		
		System.out.println("...............");
		System.out.println("Second Time");
		System.out.println("...............");
		authenticate("Admin","123");
	}
}
