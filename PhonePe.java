package com.Xworkz.ConstructorOverloading;

public class PhonePe {
	String name;
	long phoneNo;
	String place;
	String adharNo;
	String panNo;
	public PhonePe(String name,long phoneNo,String place) {
		this.name="Vidya";
		this.phoneNo=1234567892;
		this.place="Tumkur";	
	}
	public PhonePe(String name,long phoneNo,String place,String adharNo) {
		this.name="Varsha";
		this.phoneNo=2135648971;
		this.place="Bangalore";
		this.adharNo="123456789456";
	}
	public PhonePe(String name,long phoneNo,String place,String adharNo,String panNo) {
		this.name=name;
		this.phoneNo=phoneNo;
		this.place=place;
		this.adharNo=adharNo;
		this.panNo=panNo;
	}
	public void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.phoneNo);
		System.out.println(this.place);
		System.out.println(this.adharNo);
		System.out.println(this.panNo);
	}
}
