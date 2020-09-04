package QLSachThuVien;

import java.util.Scanner;

public class SachThamKhao extends Sach {
	private Float thue;
	private Float thanhTien;

	public SachThamKhao() {
		super();
		// TODO Auto-generated constructor stub
		this.thue = 0.0f;
		this.thanhTien = 0.0f;
	}

	public Float getThue() {
		return thue;
	}

	public void setThue(Float thue) {
		this.thue = thue;
	}

	public Float getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(Float thanhTien) {
		this.thanhTien = thanhTien;
	}

	public void inPutSachThamKhao() {
		super.inPutSach();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao thue ");
		Float thue = sc.nextFloat();
		setThue(thue);
	}

	public String toString() {
		return "Thong tin co ban cua sach" + super.toString() + "Thue " + getThue();
	}

	public Float thanhTienSachThamKhao() {
		Float thanhTien = 0.0f;
		Integer soLuong = getSoLuong();
		Float donGia = getDonGia();
		thanhTien = soLuong * donGia;
		setThanhTien(thanhTien);
		return thanhTien;
	}
	
}
