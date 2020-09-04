package TinhKeThua;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	private String noiDen;
	private Integer soNgayDiDuoc;

	public ChuyenXeNgoaiThanh() {
		super();
		this.noiDen = null;
		this.soNgayDiDuoc = 0;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public Integer getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(Integer soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
	}
	
	public void chuyenXeNgoaiThanh() {
		super.inPutChuyenXe();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao noi den ");
		noiDen = scanner.nextLine();
		setNoiDen(noiDen);
		System.out.println("Nhap vao so ngay di dc ");
		Integer soNgayDiDuoc = scanner.nextInt();
		setSoNgayDiDuoc(soNgayDiDuoc);
	}
	
	public String toString() {
		return " thong tin chuyen xe " + super.toString() + "Xuat noi den xe ngoai thanh " + getNoiDen() + "Xuat so ngay di duoc  xe ngoai thanh " + getSoNgayDiDuoc();
	}

}
