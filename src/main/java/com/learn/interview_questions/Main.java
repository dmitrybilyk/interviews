package com.learn.interview_questions;

public class Main {
	public Main() throws Exception{
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println( a + " " + b);
	}
	interface someInterface {
		int d = 0;
		void pring();
		void print2();
	}
}
