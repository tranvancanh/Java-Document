package com.example.book;

//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

	private String nameBook;
	private String idBook;
	private String typeBook;

	// Constructer
	public Book() {
		this.nameBook = null;
		this.idBook = null;
		this.typeBook = null;
	}

	Scanner scanner = new Scanner(System.in);

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public String getTypeBook() {
		return typeBook;
	}

	public void setTypeBook(String typeBook) {
		this.typeBook = typeBook;
	}

	public void inPutNameBook() {
		System.out.println("Nhap vao ten sach la : ");
		String name = scanner.nextLine();
		setNameBook(name);
	}

	public void inPutIdBook() {
		System.out.println("Nhap vao ID sach la : ");
		String id = scanner.nextLine();
		setIdBook(id);
	}

	public void inPutTypeBook() {
		System.out.println("Nhap vao Type sach la : ");
		String type = scanner.nextLine();
		setTypeBook(type);
	}

	public void outPutNameBook() {
		System.out.println("Ten quyen sach la : " + getNameBook());
	}

	public void outPutIdBook() {
		System.out.println("Id quyen sach la : " + getIdBook());
	}

	public void outPutTypeBook() {
		System.out.println("Type quyen sach la : " + getTypeBook());
	}

	public void inPutOfBook() {
		inPutIdBook();
		inPutTypeBook();
		inPutNameBook();
	}

	public void outPutOfBook() {
		outPutIdBook();
		outPutTypeBook();
		outPutNameBook();
	}

}
