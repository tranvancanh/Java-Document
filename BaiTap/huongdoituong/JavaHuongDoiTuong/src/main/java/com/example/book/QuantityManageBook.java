package com.example.book;

import java.util.Scanner;

public class QuantityManageBook {
	private int totalBook;
	private int borrowBook;

	// Constructor
	public QuantityManageBook() {
		this.totalBook = 0;
		this.totalBook = 0;
	}

	public int getTotalBook() {
		return totalBook;
	}

	public void setTotalBook(int totalBook) {
		this.totalBook = totalBook;
	}

	public int getBorrowBook() {
		return borrowBook;
	}

	public void setBorrowBook(int borrowBook) {
		this.borrowBook = borrowBook;
	}

	Scanner sc = new Scanner(System.in);

	public void totalBook() {
		System.out.println("Total so sach la : ");
		int total = sc.nextInt();
		setTotalBook(total);
	}

	public void borrowBook() {
		System.out.println("Borrow so sach la : ");
		int borrow = sc.nextInt();
		setBorrowBook(borrow);
	}

	public void remainBooks() {
		System.out.println("So sach con lai la : " + (getTotalBook() - getBorrowBook()));

	}
}
