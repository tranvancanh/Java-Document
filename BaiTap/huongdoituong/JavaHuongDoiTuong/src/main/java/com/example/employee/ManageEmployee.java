package com.example.employee;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;
import java.util.Scanner;

public class ManageEmployee {

	List<Employee> listEmployee = new ArrayList<Employee>();
//	Scanner sc = new Scanner(System.in);

	public void inPutAllEmployees(int soNhanVien) {
		for (int i = 1; i <= soNhanVien; i++) {
			Employee emloyee = new Employee();
			emloyee.inPutEmployee(i);
			listEmployee.add(emloyee);
		}
	}

	public void outPutAllEmloyee(int soNhanVien) {
		System.out.println("In ra thong tin cua NV la : ");
		for (int i = 0; i < soNhanVien; i++) {
			listEmployee.get(i).outPutEmployee();
		}
	}

	public void searchNV(int soNhanVien) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ten nhan vien can tiem la : ");
		String name = sc.nextLine();
		for (int i = 0; i < soNhanVien; i++) {
			if (listEmployee.get(i).getNamEmployee().contains(name)) {
				System.out.println("Co ten nhan vien ten " + name);
			}
		}
	}
}
