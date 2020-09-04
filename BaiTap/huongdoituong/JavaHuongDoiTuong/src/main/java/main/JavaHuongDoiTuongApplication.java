package main;

import java.util.Scanner;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.employee.ManageEmployee;

import Hotel.MgrTotalCustomer;
import QLHocSinhPT.QLHocSinh;
import TinhKeThua.QlXe;

@SpringBootApplication
public class JavaHuongDoiTuongApplication {

	public static void main(String[] args) {
//		SpringApplication.run(JavaHuongDoiTuongApplication.class, args);
//		Book book = new Book();
//		System.out.println("In ra a");
//        book.intPutBook();
//        book.printNameBook();
//        System.out.println("So sach con lai la: " +book.restBook());
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("Nhap vao tong so nhan vien");
//		int soNhanVien = sc1.nextInt();
//		ManageEmployee mgr = new ManageEmployee();
//		mgr.inPutAllEmployees(soNhanVien);
//		mgr.outPutAllEmloyee(soNhanVien);
//		int totalCustomer = 1;
//		MgrTotalCustomer mgr = new MgrTotalCustomer();
//		mgr.inPutAllCustomer(totalCustomer);
//		mgr.outPutAllCustomer(totalCustomer);
//		mgr.emptyRoom(totalCustomer);
//		mgr.searchNameCustomer();
//		QLHocSinh qlhs = new QLHocSinh();
//		int sum = 3;
//		qlhs.inPutAllHocSinh(sum);
//		qlhs.outPutAllHocSinh(sum);
//		qlhs.serchAddress(sum);
//		
		QlXe qlXe = new QlXe();
		qlXe.nhapDanhSachXe();
		qlXe.xuatDanhSachXe();
	}

}
