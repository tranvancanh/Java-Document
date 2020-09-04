package com.example.demo;

public class Package2 {
	private int a;
	protected int b;
	int c;
	public static int d;

	public Package2() {
		d = 1;
	}
	public Package2(int d) {
		this.d = d;
	}

	public static void hamPublic() {
		System.out.println("ham1");

	}
	private static void hamPrivate() {
		System.out.println("ham2");

	}
	protected static void hamProtected() {
		System.out.println("ham3");
	}
	 static void hamDefault() {
		System.out.println("ham4");

	}
	 public static void layHam2() {
		 hamPrivate();
		 d = 1212;
	 }
}
