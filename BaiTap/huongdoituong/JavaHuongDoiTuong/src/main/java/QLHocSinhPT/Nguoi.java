package QLHocSinhPT;

import java.util.Scanner;

public class Nguoi {
	private String nameAndFristName;
	private String sex;
	private String Address;

	Scanner scanner = new Scanner(System.in);

	public void QLHocSinhPT(String nameAndFristName, String sex, String Address) {
		this.nameAndFristName = nameAndFristName;
		this.sex = sex;
		this.Address = Address;
	}

	public String getNameAndFristName() {
		return nameAndFristName;
	}

	public void setNameAndFristName(String nameAndFristName) {
		this.nameAndFristName = nameAndFristName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void inPutNameAndFristName() {
		System.out.println("Nhap vao ho va ten cua hoc sinh ");
		String name = scanner.nextLine();
		setNameAndFristName(name);
	}

	public void inPutSex() {
		System.out.println("Nhap vao gioi tinh cua hoc sinh ");
		String sex = scanner.nextLine();
		setSex(sex);
	}

	public void inPutAddress() {
		System.out.println("Nhap vao dia chi cua hoc sinh ");
		String address = scanner.nextLine();
		setAddress(address);
	}

	public void outPutNameAndFristName() {
		System.out.println("In ra man hinh ten va ho va ten" + getNameAndFristName());
	}

	public void outPutSex() {
		System.out.println("In ra man hinh gioi tinh " + getSex());
	}

	public void outPutAddress() {
		System.out.println("In ra man hinh dia chi " + getAddress());
	}

	public void inPutStudent() {
		inPutNameAndFristName();
		inPutSex();
		inPutAddress();
	}

	public void outPutStudent() {
		outPutNameAndFristName();
		outPutSex();
		outPutAddress();
	}

}
