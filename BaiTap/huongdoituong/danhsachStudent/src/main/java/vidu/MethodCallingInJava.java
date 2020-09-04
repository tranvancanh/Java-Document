package vidu;

import com.example.demo.Package2;

import baitaphuongdoituong1.Lop;
import baitaphuongdoituong1.Student;

public class MethodCallingInJava extends Package2 {
	public static void nhap() {
		System.out.println("day la phuong thuc ko co doi so truyen vao");
	}
	public static void nhapCoDoiSo(String st) {
		System.out.println(st);
	}
	public static int tinhTong(int a,int b){
		return a+b;
	}
	private void ham() {
		Package2 package2 = new Package2();
		package2.hamProtected();
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		nhap();
//		nhapCoDoiSo("xin chao");
//		tinhTong(5,6);

		Package2 package3 = new Package2();

//		package3.hamPublic();
//		package3.hamProtected();
//		ViDu.viDu();
//		System.out.println(package3.d);
//		Package2 package4 = new Package2(4);
//		System.out.println(package4.d);
//		Student sv1 = new Student();
//		sv1.hamNhap();
//		sv1.hamXuatSV();
//		float diemTB = sv1.diemTB();
//		System.out.println(diemTB);
//		sv1.xepLoai();
		Lop lopA = new Lop();
		lopA.nhapLopHoc();
		lopA.xuatLopHoc();
		System.out.println(lopA.diemTBLop());
		
		
		
		





	}

}
