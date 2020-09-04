package Hotel;

import java.util.Scanner;

public class MgrCustomer {

	Scanner scannerMgrCustomer = new Scanner(System.in);
	Customer custommerMgrCustomer = new Customer();

	public void addFirstAndLastNameCustomer() {
		System.out.println("Nhap vao FirstAndLastName cua khach hang : ");
		String firstandlastname = scannerMgrCustomer.nextLine();

		custommerMgrCustomer.setFirstAndLastName(firstandlastname);
	}

	public void addBirthDayCustomer() {
		System.out.println("Nhap vao birthDayCustomer cua khach hang : ");
		String birthDay = scannerMgrCustomer.nextLine();

		custommerMgrCustomer.setBirthDay(birthDay);
	}

	public void addIdNumberCustomer() {
		System.out.println("Nhap vao IdNumberCustomer cua khach hang : ");
		String idNumber = scannerMgrCustomer.nextLine();

		custommerMgrCustomer.setIdNumber(idNumber);
	}

	public String outFirstAndLastNameCustomer() {
		String tr = custommerMgrCustomer.getFirstAndLastName();
		System.out.println("Xuat ra FirstAndLastName cua khach hang : " + tr);
		return tr;
	}

	public void outBirthDayCustomer() {
		System.out.println("Xuat ra BirthDayCustomer cua khach hang : " + custommerMgrCustomer.getBirthDay());

	}

	public void outIdNumberCustomer() {
		System.out.println("Xuat ra IdNumberCustomer cua khach hang : " + custommerMgrCustomer.getIdNumber());

	}

	public void addCustomer() {
		System.out.println("Nhap vao thong tin ca nhan cua khach thue");
		addFirstAndLastNameCustomer();
		addBirthDayCustomer();
		addIdNumberCustomer();
	}

	public void outCustomer() {
		System.out.println("Xuat ra thong tin ca nhan cua khach thue");
		outFirstAndLastNameCustomer();
		outBirthDayCustomer();
		outIdNumberCustomer();
	}

}
