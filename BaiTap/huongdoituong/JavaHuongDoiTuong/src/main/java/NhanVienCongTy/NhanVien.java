package NhanVienCongTy;

import java.util.Scanner;

public class NhanVien {
	private String hoTen;
	private Integer soSP;

	public NhanVien(String hoTen, int soSP) {
		this.hoTen = hoTen;
		if (soSP >= 0) {
			this.soSP = soSP;
		} else {
			this.soSP = 0;
		}
	}

	Scanner scanner = new Scanner(System.in);

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Integer getSoSP() {
		return soSP;
	}

	public void setSoSP(Integer soSP) {
		this.soSP = soSP;
	}

	public void inPutNhanVien() {
		System.out.println("Nhap vao ho ten NV ");
		String name = scanner.nextLine();
		System.out.println("Nhap vao so SP NV ");
		Integer sp = scanner.nextInt();
		if (sp < 0) {
			sp = 0;
		}
		setHoTen(name);
		setSoSP(sp);
	}

	public float donGia(int soSanPham) {
		float dongia;
		if (soSanPham >= 1 && soSanPham <= 199) {
			dongia = 0.5f;
		} else if (soSanPham >= 200 && soSanPham <= 399) {
			dongia = 0.55f;
		} else if (soSanPham >= 400 && soSanPham <= 599) {
			dongia = 0.6f;
		} else if (soSanPham >= 600) {
			dongia = 0.65f;
		} else
			dongia = 0.0f;
		return dongia;
	}

	public float getLuong() {
		int soSanPham;
		float donGia;
		float tienLuong;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so sp cua NV");
		soSanPham = sc.nextInt();
		donGia = donGia(soSanPham);
		tienLuong = soSanPham * donGia;
		
		return tienLuong;
	}

}
