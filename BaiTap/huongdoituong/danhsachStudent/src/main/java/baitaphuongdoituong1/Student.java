package baitaphuongdoituong1;

import java.util.Scanner;

public class Student {
//Tạo 1 lớp Student lưu trữ các thông tin của 1 sinh viên bao gồm họ tên,
	// lớp, điểm 3 môn toán, lý, hóa. Sau đó tính điểm trung bình và
	//xếp loại học lực của sinh viên đó

	private String hoTen;
	private String lop;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	private float diemTB;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public Student () {
		hoTen = "";
		this.lop = "";
		diemToan = 0f;
		diemLy = 0f;
		diemHoa = 0f;
	}
	 public void hamNhap() {
		 System.out.println("hay nhap vao thong tin sinh vien");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("nhap ho ten");
		 hoTen = sc.nextLine();
		 System.out.println("nhap vao lop");
		 lop = sc.nextLine();
		 Scanner sc1 = new Scanner (System.in);
		 System.out.println("nhap vao diem toan");
		 diemToan = sc1.nextFloat();
		 System.out.println("nhap vao diem ly");
		 diemLy = sc1.nextFloat();
		 System.out.println("nhap vao diem hoa");
		 diemHoa = sc1.nextFloat();
	 }
	 public void hamXuatSV() {
		 System.out.println("thong tin SV la");
		 System.out.println("ho ten: "+ hoTen +"\n"+ "lop: " + lop +"\n"+ "toan: " +diemToan+"\n"+"ly: " + diemLy+ "\n"+ "hoa: "+ diemHoa );

	 }

	public float diemTB() {
		System.out.println("diem trung binh la: ");
		return (diemToan + diemLy + diemHoa)/3;
	}

	public void xepLoai() {
		float diemTB  = diemTB();
		if (diemTB>=9) {
			System.out.println("xep loai Gioi");
		}else if(diemTB>=7) {
			System.out.println("xep loai Kha");
		}else if(diemTB>=5) {
			System.out.println("xep loai Trung Binh");
		}else {
			System.out.println("xep loai Yeu");
		}
	}
}