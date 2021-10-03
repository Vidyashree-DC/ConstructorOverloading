package com.Xworkz.ConstructorOverloading;

public class Registration {
String userName;
int pone;
String email;
public Registration(String userName,int phone) {
	System.out.println("Registration Sucessful using phone");
}
public Registration(String userName,String email) {
	System.out.println("Registration Sucessful using email");
}
}
