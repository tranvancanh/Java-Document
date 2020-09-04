package TinhKeThua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QlXe {

	private int soLuongXeNgoaiThanh;
	private int soLuongXeNoiThanh;
	private Float tongDoanhThuXeNoiThanh;
	private Float tongDoanhThuXeNgoaiThanh;

	public QlXe() {
		this.soLuongXeNoiThanh = 0;
		this.soLuongXeNgoaiThanh = 0;
		this.tongDoanhThuXeNoiThanh = 0.0f;
		this.tongDoanhThuXeNgoaiThanh = 0.0f;
	}

	List<ChuyenXeNoiThanh> listDsXeNoiThanh = new ArrayList<ChuyenXeNoiThanh>(3);
	List<ChuyenXeNgoaiThanh> listDsXeNgoaiThanh = new ArrayList<ChuyenXeNgoaiThanh>(2);

	public int getSoLuongXeNgoaiThanh() {
		return soLuongXeNgoaiThanh;
	}

	public void setSoLuongXeNgoaiThanh(int soLuongXeNgoaiThanh) {
		this.soLuongXeNgoaiThanh = soLuongXeNgoaiThanh;
	}

	public int getSoLuongXeNoiThanh() {
		return soLuongXeNoiThanh;
	}

	public void setSoLuongXeNoiThanh(int soLuongXeNoiThanh) {
		this.soLuongXeNoiThanh = soLuongXeNoiThanh;
	}

	public Float getTongDoanhThuXeNoiThanh() {
		return tongDoanhThuXeNoiThanh;
	}

	public void setTongDoanhThuXeNoiThanh(Float tongDoanhThuXeNoiThanh) {
		this.tongDoanhThuXeNoiThanh = tongDoanhThuXeNoiThanh;
	}

	public Float getTongDoanhThuXeNgoaiThanh() {
		return tongDoanhThuXeNgoaiThanh;
	}

	public void setTongDoanhThuXeNgoaiThanh(Float tongDoanhThuXeNgoaiThanh) {
		this.tongDoanhThuXeNgoaiThanh = tongDoanhThuXeNgoaiThanh;
	}

	public void nhapDanhSachXe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong xe noi thanh");
		int soLuongNoiThanh = sc.nextInt();
		setSoLuongXeNoiThanh(soLuongNoiThanh);
		System.out.println("Nhap vao so luong xe ngoai thanh");
		int soLuongNgoaiThanh = sc.nextInt();
		setSoLuongXeNgoaiThanh(soLuongNgoaiThanh);
		System.out.println("Nhap DS thong tin so xe noi thanh");

		Float doanhThuNoi = 0.0f, doanhThuNgoai = 0.0f;
		for (int i = 0; i < soLuongNoiThanh; i++) {
			ChuyenXeNoiThanh chuyenXeNoiThanh = new ChuyenXeNoiThanh();
			chuyenXeNoiThanh.chuyenXeNoiThanh();
			doanhThuNoi += chuyenXeNoiThanh.getDoanhThu();
			listDsXeNoiThanh.add(chuyenXeNoiThanh);
		}
		System.out.println("Nhap DS thong tin so xe ngoai thanh");
		for (int i = 0; i < soLuongNgoaiThanh; i++) {
			ChuyenXeNgoaiThanh chuyenXeNgoaiThanh = new ChuyenXeNgoaiThanh();
			chuyenXeNgoaiThanh.chuyenXeNgoaiThanh();
			doanhThuNgoai += chuyenXeNgoaiThanh.getDoanhThu();
			listDsXeNgoaiThanh.add(chuyenXeNgoaiThanh);
		}
		setTongDoanhThuXeNoiThanh(doanhThuNoi);
		setTongDoanhThuXeNgoaiThanh(doanhThuNgoai);
	}

	public void xuatDanhSachXe() {
		System.out.println("Xuat ra thong tin cac chuyen xe noi thanh");
		for (ChuyenXeNoiThanh chuyenxenoi : listDsXeNoiThanh) {
			System.out.println(" chuyen xe noi " + chuyenxenoi.toString());
		}
		System.out.println("tong doanh thu xe noi thanh " + getTongDoanhThuXeNoiThanh());

		System.out.println("Xuat ra thong tin cac chuyen xe ngoai thanh");
		for (ChuyenXeNgoaiThanh chuyenxengoai : listDsXeNgoaiThanh) {
			System.out.println(" chuyen xe ngoai " + chuyenxengoai.toString());
		}
		System.out.println("tong doanh thu xe ngaoi thanh " + getTongDoanhThuXeNgoaiThanh());

	}

}
