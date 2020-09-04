package TinhKeThua;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private Integer soTuyen;
	private Float soKM;

	public ChuyenXeNoiThanh() {
		super();
		this.soTuyen = 0;
		this.soKM = 0.0f;
		// TODO Auto-generated constructor stub
	}

	public Integer getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(Integer soTuyen) {
		this.soTuyen = soTuyen;
	}

	public Float getSoKM() {
		return soKM;
	}

	public void setSoKM(Float soKM) {
		this.soKM = soKM;
	}

	public void chuyenXeNoiThanh() {
		super.inPutChuyenXe();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Nhap vao so tuyen ");
		soTuyen = scanner.nextInt();
		setSoTuyen(soTuyen);
		System.out.println("Nhap vao so km ");
		Float soKm = scanner1.nextFloat();
		setSoKM(soKm);
	}

	public String toString() {
		return " thong tin chuyen xe " + super.toString() + "Xuat so tuyen xe noi thanh " + getSoTuyen() + "Xuat so km  xe noi thanh " + getSoKM();
	}
	
}
