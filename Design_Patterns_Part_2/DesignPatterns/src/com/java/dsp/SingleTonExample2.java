package com.java.dsp;

import java.util.Scanner;

public class SingleTonExample2 {

	private static ConnectionString cs;
	
	public void show(String db) {
		cs = ConnectionString.getInstance();
		System.out.println(cs.getConnection(db));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Db Type   ");
		String db = sc.next();
		new SingleTonExample2().show(db);
	}
}
