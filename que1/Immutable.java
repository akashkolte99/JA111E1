package com.que1;

public class Immutable {
 public static void main(String[]args) {
	// The java programming provides a immutability to strings .
	// for security reasons and also for make memory less coverable.
	//example
	String x = "Akash";
	x.concat("hello");
	System.out.println(x);
//	this x is make a space inside the RAM and contain its adress;
	
// if we try to make it change its create another space thats why java avoid it ;
// but we can do it by assign it to the new variables;
// so string immutibility is a advantage for java .
	//
	// string builder is a mutable member of java
	// if we use string builder we can change the string
	
	StringBuilder sb = new StringBuilder("Hello");
	
	// if we want to add something in it we have to do append
	
	sb.append(" world");
	
	// methods of string
	
	System.out.println(x.charAt(2));
//	it will show the charector which is at index 2
	
	System.out.println(x.equals("Akash"));
	
	// it will check that both strings are same or not;
	
	System.out.println(x.indexOf("a"));
	// in this it will show the index of this chhar
	System.out.println(x.lastIndexOf("h"));
 }	
}
