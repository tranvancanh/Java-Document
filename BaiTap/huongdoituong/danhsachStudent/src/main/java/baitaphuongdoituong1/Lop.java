package baitaphuongdoituong1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lop {
	public int soLuongSV;
	public ArrayList<Student> danhSachSV = new ArrayList<>(soLuongSV);

	public void nhapLopHoc() {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhap vao so luong sinh vien");
		soLuongSV = sc.nextInt();
		System.out.println("nhap vao danh sach cac sinh vien");
		for(int i= 1; i <= soLuongSV; i++) {
			Student sv = new Student();
			sv.hamNhap();
			danhSachSV.add(sv);
		}
	}

	public void xuatLopHoc() {
		System.out.println("thong tin sv lop hoc nay la");
		for(Student sv : danhSachSV) {
			sv.hamXuatSV();
		}
	}

	public float diemTBLop() {
		float tong = 0f;
		float diemTB = 0f;
		for(int i = 0; i< soLuongSV; i++) {
			diemTB = danhSachSV.get(i).diemTB();
			tong = tong + diemTB;
		}
		return tong/soLuongSV;
	}

}