package com.Xworkz.ConstructorOverloading;

public class CorporateCompany {
	String companyName;
	String companyAddress;
	long companyPhoneno;
	long noOfEmployeesworking;
	int noOfProjects;

	CorporateCompany(String companyName,String companyAddress,long companyPhoneno,long noOfEmployeesworking,int noOfProjects) {
		this.companyName=companyName;
		this.companyAddress=companyAddress;
		this.companyPhoneno=companyPhoneno;
		this.noOfEmployeesworking=noOfEmployeesworking;
		this.noOfProjects=noOfProjects;
	}

	public CorporateCompany(String companyName) {
		this.companyName=companyName;
	}

	public void loginTime() {
		System.out.println("company login time is : 8am");
	}
	public void noOfShifts() {
		System.out.println("no of shifts are : 3");
	}
	public void logoutTime() {
		System.out.println("company logout time is : 6pm");
	}
	public void displayInfo() {
		System.out.println(this.companyName);
		System.out.println(this.companyAddress);
		System.out.println(this.companyPhoneno);
		System.out.println(this.noOfEmployeesworking);
		System.out.println(this.noOfProjects);
	}
}
