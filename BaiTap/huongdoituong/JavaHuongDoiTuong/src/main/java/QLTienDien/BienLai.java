package QLTienDien;

import java.util.Scanner;

public class BienLai {
	private Float soCu;
	private Float soMoi;
	private KhachHang khachHang;

	public BienLai() {
		this.soCu = 0.0f;
		this.soMoi = 0.0f;
		this.khachHang = null;
	}

	KhachHang kh = new KhachHang(null, null, null);
	Scanner sc = new Scanner(System.in);

	public Float getSoCu() {
		return soCu;
	}

	public void setSoCu(Float soCu) {
		this.soCu = soCu;
	}

	public Float getSoMoi() {
		return soMoi;
	}

	public void setSoMoi(Float soMoi) {
		this.soMoi = soMoi;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public void inPutAllthongTinKhachHang() {
		System.out.println("Nhap vao thong tin co ban cua khach hang ");
		kh.inPutThongTinKhachHang();
		setKhachHang(kh);
		System.out.println("Nhap vao so cu");
		Float cu = sc.nextFloat();
		setSoCu(cu);
		System.out.println("Nhap vao so moi ");
		Float moi = sc.nextFloat();
		setSoMoi(moi);

	}

	public void outPutAllthongTinKhachHang() {
		System.out.println("Xuat ra thogn tin co ban cua KH " + getKhachHang());
		System.out.println("Xuuat ra so cu cua cong to " + getSoCu());
		System.out.println("Xuat ra so moi cua cong to " + getSoMoi());
	}
	
	
}
