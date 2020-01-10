package com.learn.core.statis_variables;

public class ClassWithStaticVariable {
	public static String someName;

	public static void main(String[] args) {
		ClassWithStaticVariable classWithStaticVariable1 = new ClassWithStaticVariable();
		System.out.println(ClassWithStaticVariable.someName);
		ClassWithStaticVariable.someName = "some value";
		ClassWithStaticVariable classWithStaticVariable2 = new ClassWithStaticVariable();
		System.out.println(ClassWithStaticVariable.someName);
	}
}
