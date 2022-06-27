package com.java.dsp;

public class SingleTonExample1 {

	private static SingleTonExample1 se1;
	
	private SingleTonExample1() {}
	
	public static SingleTonExample1 getInstance() {
		if (se1==null) {
			se1 = new SingleTonExample1();
		}
		return se1;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	public static void main(String[] args) {
		se1 = SingleTonExample1.getInstance();
		System.out.println(se1.sum(12, 5));
		System.out.println(se1.sub(12, 5));
	}
}
