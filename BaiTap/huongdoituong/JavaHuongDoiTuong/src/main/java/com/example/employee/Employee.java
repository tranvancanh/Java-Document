package com.example.employee;

import java.util.Scanner;

public class Employee {
	private String namEmployee;
	private String phoneNumberEmployee;
	private String IdEmployee;

	public Employee() {
		this.namEmployee = null;
		this.phoneNumberEmployee = null;
		this.IdEmployee = null;
	}

	Scanner scanner = new Scanner(System.in);

	public String getIdEmployee() {
		return IdEmployee;
	}

	public void setIdEmployee(String employeeID) {
		IdEmployee = employeeID;
	}

	public String getNamEmployee() {
		return namEmployee;
	}

	public void setNamEmployee(String namEmployee) {
		this.namEmployee = namEmployee;
	}

	public String getPhoneNumberEmployee() {
		return phoneNumberEmployee;
	}

	public void setPhoneNumberEmployee(String phoneNumberEmployee) {
		this.phoneNumberEmployee = phoneNumberEmployee;
	}

	public void inPutNameOfEmployee(int i) {

		System.out.println("Nhap ten sinh vien thu " + i + " vao ");
		String name = scanner.nextLine();
		setNamEmployee(name);

	}

	public void inPutPhoneNumberOfEmployee(int i) {
		System.out.println("Nhap sdt sinh vien thu " + i + " vao ");
		String phoneNumber = scanner.nextLine();
		setPhoneNumberEmployee(phoneNumber);
	}

	public void inPutIdOfEmployee(int i) {
		System.out.println("Nhap ID sinh vien thu " + i + " vao ");
		String id = scanner.nextLine();
		setIdEmployee(id);
	}

	public void outPutNameOfEmployee() {
		System.out.println("In ten sinh vien ra " + getNamEmployee());
	}

	public void outPutPhoneNumberOfEmployee() {
		System.out.println("In sdt sinh vien ra " + getPhoneNumberEmployee());
	}

	public void outPutIdOfEmployee() {
		System.out.println("In ID sinh vien ra " + getIdEmployee());
	}

	public void inPutEmployee(int i) {
		inPutIdOfEmployee(i);
		inPutNameOfEmployee(i);
		inPutPhoneNumberOfEmployee(i);
	}

	public void outPutEmployee() {
		outPutIdOfEmployee();
		outPutNameOfEmployee();
		outPutPhoneNumberOfEmployee();
	}
}
