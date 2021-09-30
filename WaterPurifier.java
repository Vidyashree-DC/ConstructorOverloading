package com.Xworkz.ConstructorOverloading;

public class WaterPurifier {
	String brand;
	int price;
	String model;
	int serialNo;
	
public WaterPurifier(){
		System.out.println("Constructor invoked");
	}
public WaterPurifier(String brand,int price,String model,int serialNo){
	System.out.println("Constructor with parameters invoked");
	this.brand=brand;
	this.price=price;
	this.model=model;
	this.serialNo=serialNo;	
}
public void fillwater() {
	System.out.println("Filling water");
}
public void purify() {
	System.out.println("Purifying water");
}
public void displayInfo() {
	System.out.println(this.brand);
	System.out.println(this.price);
	System.out.println(this.model);
	System.out.println(this.serialNo);	
}
}
