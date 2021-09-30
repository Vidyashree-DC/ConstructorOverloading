package com.Xworkz.ConstructorOverloading;

public class MosquitoBat {
	String brand;
	int price;
	String color;
	String batteryCapacity;
	String mesh;
	MosquitoBat() {
		System.out.println("MosquitoBat constructor invoked");
	}
	MosquitoBat(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}

	MosquitoBat(String brand,int price,String color,String batteryCapacity,String mesh) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.batteryCapacity = batteryCapacity;
		this.mesh = mesh;
	}
	public void on() {
		System.out.println("On the MosquitoBat");
	}
	public void Charge() {
		System.out.println("Recharging the MosquitoBat");
	}
	public void off() {
		System.out.println("Off the MosquitoBat");
	}
	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println(this.color);
		System.out.println(this.batteryCapacity);
		System.out.println(this.mesh);
	}
}
