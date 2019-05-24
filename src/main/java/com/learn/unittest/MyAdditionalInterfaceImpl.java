package com.learn.unittest;

public class MyAdditionalInterfaceImpl implements MyAdditionalInterface {
	@Override
	public String printAdditional(String s) {
		return s + s;
	}
}
