package com.que5;

public class Shapes {
 
  
	 public void area(int length , int breadth) {
		 int x =length;
		 double y = breadth;
		 
		 double area = x*y;
		 
		 System.out.println("Area of Rectangle is "+area);
	}
 

	 public void area( int circle) {
		 int x = circle;
		 double y =3.14;
		 
		 double area = y*(x*x);
		 
		 System.out.println("Area of Circle is "+area);
	}
	 
	 public void areas(int side) {
		 int x = side;
		 double area = x*x;
		 
		 System.out.println("Area of Square is "+area);
	}
  
}
