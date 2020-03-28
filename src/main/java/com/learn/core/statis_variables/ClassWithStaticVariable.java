package com.learn.core.statis_variables;

public class ClassWithStaticVariable {
	public static String someName;
	public String nonStatic;
	final static String name;

	static {
		name = "dim";
	}

	public ClassWithStaticVariable(String name) {
	}

	public static void main(String[] args) {
		ClassWithStaticVariable classWithStaticVariable1 = new ClassWithStaticVariable(name);
		classWithStaticVariable1.print();
		System.out.println(ClassWithStaticVariable.someName);
		ClassWithStaticVariable.someName = "some value";
		ClassWithStaticVariable classWithStaticVariable2 = new ClassWithStaticVariable(name);
		classWithStaticVariable2.print();
		System.out.println(ClassWithStaticVariable.someName);
	}

	public static void print() {
		System.out.println(someName);
	}
}
