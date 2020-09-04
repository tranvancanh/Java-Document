package QLSachThuVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLSach {

	private int soLuongSachGK;
	private int soLuongSachThamKhao;
	private Float tongTienSachGK;
	private Float tongTienSachThamKhao;
	private Float TbCongDonGiaSachThamKhao;

	public QLSach() {

		// TODO Auto-generated constructor stub
		this.soLuongSachGK = 0;
		this.soLuongSachThamKhao = 0;
		this.tongTienSachGK = 0.0f;
		this.tongTienSachThamKhao = 0.0f;
		this.TbCongDonGiaSachThamKhao = 0.0f;

	}

	List<SachGK> listSachGK = new ArrayList<SachGK>();
	List<SachThamKhao> listSachThamKhao = new ArrayList<SachThamKhao>();

	public int getSoLuongSachGK() {
		return soLuongSachGK;
	}

	public void setSoLuongSachGK(int soLuongSachGK) {
		this.soLuongSachGK = soLuongSachGK;
	}

	public int getSoLuongSachThamKhao() {
		return soLuongSachThamKhao;
	}

	public void setSoLuongSachThamKhao(int soLuongSachThamKhao) {
		this.soLuongSachThamKhao = soLuongSachThamKhao;
	}

	public Float getTongTienSachGK() {
		return tongTienSachGK;
	}

	public void setTongTienSachGK(Float tongTienSachGK) {
		this.tongTienSachGK = tongTienSachGK;
	}

	public Float getTongTienSachThamKhao() {
		return tongTienSachThamKhao;
	}

	public void setTongTienSachThamKhao(Float tongTienSachThamKhao) {
		this.tongTienSachThamKhao = tongTienSachThamKhao;
	}

	public Float getTbCongDonGiaSachThamKhao() {
		return TbCongDonGiaSachThamKhao;
	}

	public void setTbCongDonGiaSachThamKhao(Float tbCongDonGiaSachThamKhao) {
		TbCongDonGiaSachThamKhao = tbCongDonGiaSachThamKhao;
	}

	public void nhapDSSachGK() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong sach GK ");
		int soSachGK = sc.nextInt();
		setSoLuongSachGK(soSachGK);
		System.out.println("Nhap vao so luong sach tham khao ");
		int soSachThamKhao = sc.nextInt();
		setSoLuongSachThamKhao(soSachThamKhao);
		Float tongDonGiaSachThamKhao = 0.0f, TbCongDonGia = 0.0f;
		for (int i = 0; i < soSachThamKhao; i++) {
			SachThamKhao sachTK = new SachThamKhao();
			sachTK.inPutSachThamKhao();
			listSachThamKhao.add(sachTK);
			tongDonGiaSachThamKhao = +listSachThamKhao.get(i).getDonGia();
		}
		TbCongDonGia = (Float) tongDonGiaSachThamKhao / soSachGK;
		for (int i = 0; i < soSachGK; i++) {
			SachGK sachGK = new SachGK();
			sachGK.inPutSachGK();
			listSachGK.add(sachGK);
		}

	}

	public void xuatNhaXbTenX() {
		for (int i = 0; i < getSoLuongSachGK(); i++) {
			if (listSachGK.get(i).getNhaXB().equalsIgnoreCase("x")) {
				System.out.println("ma sach " + listSachGK.get(i).getMaSach() + "thuoc nha xb x");
			}
		}
		for (int i = 0; i < getSoLuongSachThamKhao(); i++) {
			if (listSachThamKhao.get(i).getNhaXB().equalsIgnoreCase("x")) {
				System.out.println("ma sach " + listSachThamKhao.get(i).getMaSach() + "thuoc nha xb x");
			}
		}
	}
	

}
