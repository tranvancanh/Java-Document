package QLTienDien;

import java.util.Scanner;

public class KhachHang {
	private String tenKH;
	private String soNha;
	private String maSoCongTo;
	
	public KhachHang(String tenKH,String soNha,String maSoCongTo ) {
		this.tenKH = tenKH;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}
	Scanner scanner = new Scanner(System.in);
	

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getSoNha() {
		return soNha;
	}

	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}

	public String getMaSoCongTo() {
		return maSoCongTo;
	}

	public void setMaSoCongTo(String maSoCongTo) {
		this.maSoCongTo = maSoCongTo;
	}
	
	public void inPutThongTinKhachHang() {
		System.out.println("Nhap vao ten KH : ");
		String name = scanner.nextLine();
		setTenKH(name);
		System.out.println("Nhap vao so nha KH : ");
		String soNha = scanner.nextLine();
		setSoNha(soNha);
		System.out.println("Nhap vao maSoCongTo KH : ");
		String maSoCongTo = scanner.nextLine();
		setMaSoCongTo(maSoCongTo);
	}
	public void outPutThongTinKhachHang() {
		System.out.println("Xuat ra ten cua khach hang " +getTenKH());
		System.out.println("Xuat ra so nha cua khach hang " +getSoNha());
		System.out.println("Xuat ra ma so cong to cua khach hang " +getMaSoCongTo());
	}
	
}
