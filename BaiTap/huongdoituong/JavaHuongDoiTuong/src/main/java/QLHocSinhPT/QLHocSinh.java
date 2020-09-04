package QLHocSinhPT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHocSinh {
	
	List<HocSinh> qLHocSinh = new ArrayList<HocSinh>();

	public void inPutAllHocSinh(int sum) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap vao tong so sinh vien : ");
//		sum = sc.nextInt();
		for (int i = 0; i < sum; i++) {
			HocSinh hs = new HocSinh();
			hs.inPutHocSinh();
			qLHocSinh.add(hs);
		}
	}

	public void outPutAllHocSinh(int sum) {
		System.out.println("In ra thong tin cua NV la : ");
		for (int i = 0; i < sum; i++) {
			qLHocSinh.get(i).outPutHocSinh();
		}
	}

	public void serchAddress(int sum) {
		System.out.println("Nhap vao dia chi can ktra : ");
		Scanner sc = new Scanner(System.in);
		String adr = sc.nextLine();
		for (int i = 0; i < sum; i++) {

			if (qLHocSinh.get(i).nguoi1.getAddress().equalsIgnoreCase("Thai Nguyen")&& qLHocSinh.get(i).getLop().equalsIgnoreCase("10A1")) {
				System.out.println("Ban Hoc sinh ten " + qLHocSinh.get(i).nguoi1.getNameAndFristName() + " thuoc tinh Thai Nguyen lop 10A1");
			}
		}
	}
}
