package com.example.book;

import java.util.ArrayList;
import java.util.List;

public class ManageBook {
	
	
	List<Book> listBooks = new ArrayList<Book>();

	public void inPutAllBooks(int soBook) {
		for (int i = 1; i <= soBook; i++) {
			Book book = new Book();
			book.inPutOfBook();
			listBooks.add(book);
		}
	}

	public void outPutAllBooks(int soBook) {
		System.out.println("In ra thong tin cua NV la : ");
		for (int i = 0; i < soBook; i++) {
			listBooks.get(i).outPutOfBook();
		}
	}
	
	public void searchBook(String str) {
		if(listBooks.contains(str)) {
			System.out.println("Co sach do");
		}
		else {
			System.out.println("Ko co sach do");
		}
	}
}
