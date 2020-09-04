package Hotel;

import java.util.Scanner;

public class KhachSan {
	private int soNgay;
	private String typeRoom;
	private float giaPhong;
	private MgrCustomer customer;

	Scanner scannerKhachSan = new Scanner(System.in);
	MgrCustomer customer1 = new MgrCustomer();
	
	
	public KhachSan() {
		this.soNgay = 0;
		this.typeRoom = null;
		this.giaPhong = 1000000;
		this.customer = null;
	}
	
	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public String getTypeRoom() {
		return typeRoom;
	}

	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}

	public float getGiaPhong() {
		return giaPhong;
	}

	public void setGiaPhong(float giaPhong) {
		this.giaPhong = giaPhong;
	}

	public MgrCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(MgrCustomer customer) {
		this.customer = customer;
	}

	public int soNgayKhachHang() {
		System.out.println("Nhap so ngay du dinh o lai cua khach hang : ");
		int ngay = scannerKhachSan.nextInt();
		setSoNgay(ngay);
		return ngay;
	}

	public void typeRoomKhachHang() {
		Scanner scannerKhachSan1 = new Scanner(System.in);
		System.out.println("Nhap loai phong cua khach hang : ");
		String loaiPhong = scannerKhachSan1.nextLine();
		setTypeRoom(loaiPhong);

	}

	public void giaPhongKhachHang() {
//		System.out.println("Nhap gia phong cua khach hang thue : ");
//		float gia = scannerKhachSan.nextFloat();
		setGiaPhong(giaPhong);

	}

	public void outsoNgayKhachHang() {
		System.out.println("So ngay KH thue la : " + getSoNgay());
	}

	public void outTypeRoomKhachHang() {
		System.out.println("Kieu phong KH thue la : " + getTypeRoom());
	}

	public void outGiaPhongKhachHang() {
		System.out.println("gia phong KH thue la : " + getGiaPhong());
	}

	public void informationCustomer() {
		System.out.println("Nhap vao thong tin thue phong");
//		customer = new MgrCustomer();
		customer1.addCustomer();
		setCustomer(customer1);
		soNgayKhachHang();
		typeRoomKhachHang();
		giaPhongKhachHang();
	}

	public void outInformationCustomer() {
		System.out.println("Xuat ra thong tin thue phong");
//		customer = new MgrCustomer();
		customer1.outCustomer();
		getCustomer();
		outsoNgayKhachHang();
		outsoNgayKhachHang();
		outGiaPhongKhachHang();
	}

	public void tinhTien() {
		float tien = getGiaPhong() * soNgayKhachHang();
		System.out.println("So tien cua khach hang la : " + tien);

	}
}
