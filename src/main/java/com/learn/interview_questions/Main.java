package com.learn.interview_questions;

import java.io.IOException;

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

class getHumanStudentClass {
	void printHuman(Human human) throws IOException {
		System.out.println("human");
	}
}

class getHumanStudentClassChild  extends getHumanStudentClass {
	@Override
	void printHuman(Human human) {
//		super.printHuman(human);
	}
}

class Human {
	private String name;
}

class Student extends Human {
	private String level;
}
