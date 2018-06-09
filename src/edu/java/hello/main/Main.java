package edu.java.hello.main;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println("123");
		int[] ints= new int[20];
		for (int i = 0; i< ints.length;i++){
			System.out.println("true");
			ints[i] = i+1;
			System.out.println(i+1);
		}
	}
}