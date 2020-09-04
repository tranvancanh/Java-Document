package QLSachThuVien;

import java.util.Scanner;

public class SachGK extends Sach {
	private String tinhTrang;
	private Float thanhTien;

	public SachGK() {
		super();
		// TODO Auto-generated constructor stub
		this.tinhTrang = null;
		this.thanhTien = 0.0f;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public Float getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(Float thanhTien) {
		this.thanhTien = thanhTien;
	}

	public void inPutSachGK() {
		super.inPutSach();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tinh trang ");
		String tinhTrang = sc.nextLine();
		setTinhTrang(tinhTrang);
	}

	public String toString() {
		return "Thong tin co ban cua sach" + super.toString() + "Tinh trang sach " + getTinhTrang() + "Thanh tien sach ";
	}

	public Float thanhTienSachGK() {
		Float thanhTien = 0.0f;
		Integer soLuong = getSoLuong();
		Float donGia = getDonGia();
		if (getTinhTrang().equalsIgnoreCase("moi")) {
			thanhTien = soLuong * donGia;
		} else if (getTinhTrang().equalsIgnoreCase("cu")) {
			thanhTien = soLuong * donGia * 0.5f;
		} else
			thanhTien = 0.0f;
		setThanhTien(thanhTien);
		return thanhTien;
	}
	
	
}
