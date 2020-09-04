package TinhKeThua;

import java.util.Scanner;

public class ChuyenXe {
	private String msSoCHuyenXe;
	private String hoTen;
	private String soXe;
	private Float doanhThu;

	public ChuyenXe() {
		this.msSoCHuyenXe = null;
		this.hoTen = null;
		this.soXe = null;
		this.doanhThu = 0.00f;
	}

	public String getMsSoCHuyenXe() {
		return msSoCHuyenXe;
	}

	public void setMsSoCHuyenXe(String msSoCHuyenXe) {
		this.msSoCHuyenXe = msSoCHuyenXe;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public Float getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(Float doangThu) {
		this.doanhThu = doangThu;
	}

	public void inPutChuyenXe() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ma so chuyen xe ");
		String code = scanner.nextLine();
		setMsSoCHuyenXe(code);
		System.out.println("Nhap vao ho ten khach hang ");
		String name = scanner.nextLine();
		setHoTen(name);
		System.out.println("Nhap vao so xe");
		String soXe = scanner.nextLine();
		setSoXe(soXe);
		System.out.println("Nhap vao doanh thu ");
		Float doanhThu = scanner.nextFloat();
		setDoanhThu(doanhThu);
	}

	public String toString() {
		return "Ma so chuyen xe la " + getMsSoCHuyenXe() + " Ten KH " + getHoTen() + "So xe KH di " + getSoXe()	+ "Doanh thu cua xe " + getDoanhThu();
	}

}
