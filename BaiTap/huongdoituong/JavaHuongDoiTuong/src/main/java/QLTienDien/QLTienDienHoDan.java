package QLTienDien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTienDienHoDan {

	List<BienLai> listQlTienDien = new ArrayList<BienLai>();

	private int sum;

	public void inPutAllHoDan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tong so ho dan ");
		sum = sc.nextInt();
		for (int i = 0; i < sum; i++) {
			BienLai hs = new BienLai();
			hs.inPutAllthongTinKhachHang();
			listQlTienDien.add(hs);
		}
	}

	public void outPutAllHoDan() {
		System.out.println("In ra thong tin cua cac ho dan la : ");
		for (int i = 0; i < sum; i++) {
			listQlTienDien.get(i).outPutAllthongTinKhachHang();
		}
	}

	public void tinhTienDienAllHoDan() {
		System.out.println("In ra thong tin tien dien cua cac ho dan la : ");
		for (int i = 0; i < sum; i++) {
			Float dif = listQlTienDien.get(i).getSoMoi() - listQlTienDien.get(i).getSoCu();
			System.out.println("Tien dien cua ho dan thu " + i + " : " + (dif * 750));
		}
	}
}
