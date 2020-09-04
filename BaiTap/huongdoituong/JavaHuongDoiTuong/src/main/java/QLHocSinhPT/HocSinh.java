package QLHocSinhPT;

import java.util.Scanner;

public class HocSinh {
	private String Lop;
	private String MASSV;
	private Nguoi nguoi;

	public void HocSinh(String Lop, String MASSV, Nguoi nguoi) {
		this.Lop = null;
		this.MASSV = null;
		this.nguoi = null;
	}

	Scanner scanner = new Scanner(System.in);
	Nguoi nguoi1 = new Nguoi();

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public String getMASSV() {
		return MASSV;
	}

	public void setMASSV(String mASSV) {
		MASSV = mASSV;
	}

	public Nguoi getNguoi() {
		return nguoi;
	}

	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}

	public void inPutHocSinh() {
		System.out.println("Nhap vao thong tin co ban cua hoc sinh : ");
//		Nguoi ng = new Nguoi();
		nguoi1.inPutStudent();
		setNguoi(nguoi1);
		System.out.println("Nhap vao lop hoc sinh : ");
		String lop = scanner.nextLine();
		setLop(lop);
		System.out.println("Nhap vao MSSV hoc sinh : ");
		String mssv = scanner.nextLine();
		setMASSV(mssv);

	}

	public void outPutHocSinh() {
		System.out.println("Xuat ra thong tin co ban cua hoc sinh : ");
		nguoi1.outPutStudent();
		System.out.println("Xuat ra MSSV cua hoc sinh : " + getMASSV());
		System.out.println("Xuat ra lop cua hoc sinh : " + getLop());

	}

}
