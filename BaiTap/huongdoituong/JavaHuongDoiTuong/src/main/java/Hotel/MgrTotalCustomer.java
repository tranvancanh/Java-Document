package Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MgrTotalCustomer {

	Scanner scannerMgrTotalCustomer = new Scanner(System.in);
	List<KhachSan> listCustomer = new ArrayList<KhachSan>(100);

	public void inPutAllCustomer(int totalCustomer) {
//		System.out.println("Nhap vao tong so khach hien dang co cua khach san : ");
//		int total = scannerMgrTotalCustomer.nextInt();
		for (int i = 0; i < totalCustomer; i++) {
			KhachSan mgr = new KhachSan();
			mgr.informationCustomer();
			listCustomer.add(mgr);

		}

	}

	public void searchNameCustomer() {
		Scanner scannerMgrTotalCustomer1 = new Scanner(System.in);
		System.out.println("Nhap vao ten khach hang can tim kiem");
		String name = scannerMgrTotalCustomer1.nextLine();
		for (int i = 0; i < listCustomer.size(); i++) {
			if (listCustomer.get(i).getCustomer().custommerMgrCustomer.getFirstAndLastName().contains(name)) {
				System.out.println("Co ten khach hang do");
			}
			else {
				System.out.println("Ko co khach hang do");
			}
		}
	}

	public void outPutAllCustomer(int totalCustomer) {
		System.out.println("In ra thong tin cua NV la : ");
		for (int i = 0; i < totalCustomer; i++) {
			listCustomer.get(i).outInformationCustomer();
		}
	}

	public int emptyRoom(int totalCustomer) {
		int emptyRoom = listCustomer.size() - totalCustomer;
		System.out.println("So phong con trong la : " + emptyRoom);
		return emptyRoom;
	}
}
