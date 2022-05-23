package com.que5;

public class Main {
	public static void main(String[]args) {
		Shapes s1 = new Shapes();
		
		s1.area(5);
		s1.area(5,6);
		s1.areas(5);
	  }
}


// in polymorphism when we call methods using arguments the java programes run it accrording to arguments;
// like if we have a class of xyz with arguments(String x) 
// and other is class xyz with arguments(int x);
// and if we call and pass a integer in it it will call the xyz (int x);
// and if we pass string in it then it will call xyz(Strikng x);