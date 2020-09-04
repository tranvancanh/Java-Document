package QLSachThuVien;

import java.util.Scanner;

public class Sach {
	private String maSach;
	private Float donGia;
	private Integer soLuong;
	private String nhaXB;

	public Sach() {
		this.maSach = null;
		this.donGia = 0.0f;
		this.soLuong = 0;
		this.nhaXB = null;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public Float getDonGia() {
		return donGia;
	}

	public void setDonGia(Float donGia) {
		this.donGia = donGia;
	}

	public Integer getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXB() {
		return nhaXB;
	}

	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}

	public void inPutSach() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ma sach ");
		String maSach = scanner.nextLine();
		setMaSach(maSach);
		System.out.println("Nhap vao don gia ");
		Float donGia = scanner.nextFloat();
		setDonGia(donGia);
		System.out.println("Nhap vao so luong sach ");
		Integer soLuong = scanner.nextInt();
		setSoLuong(soLuong);
		System.out.println("Nhap vao ten nha XB sach ");
		String nhaXB = scanner.nextLine();
		setNhaXB(nhaXB);
	}

	public String toString() {
		return "Ma sach la " + getMaSach() + "Don gia la " + getDonGia() + "So luong sach la " + getSoLuong() + "Nha XB sach la " + getNhaXB();
	}
}
