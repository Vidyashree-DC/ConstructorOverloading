package com.Xworkz.ConstructorOverloading;

public class Ipod {
	String brand;
	int imeiNumber;
	int price;
	int batteryCapacity;
	String color;
	int processor;
	int ram;
	String type;
	boolean isSupportFingerPrint;

	Ipod(){
		System.out.println("Constructor invoked");
	}
	Ipod(String brand,int imeiNumber,int price) {
	System.out.println("Constructor with 3 parameters invoked");
	this.brand=brand;
	this.imeiNumber=imeiNumber;
	this.price=price;
	}
	Ipod(String brand,int imeiNumber,int price,int batteryCapacity, String color) {
	System.out.println("Constructor with 5 parameters invoked");
	this.brand=brand;
	this.imeiNumber=imeiNumber;
	this.price=price;
	this.batteryCapacity=batteryCapacity;
	this.color=color;
	}
	public void switchOn() {
		System.out.println("Switch on the Ipod");
	}
	public void switchOff() {
		System.out.println("Switch off the Ipod");
	}
	public void playmusic() {
		System.out.println("Play music");
	}
	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.imeiNumber);
		System.out.println(this.price);
		System.out.println(this.batteryCapacity);
		System.out.println(this.color);
	}
}
