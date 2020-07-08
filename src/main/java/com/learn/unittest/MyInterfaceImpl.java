package com.learn.unittest;

public class MyInterfaceImpl implements MyInterface{
	private MyAdditionalInterface myAdditionalInterface;
	@Override
	public String print(String s) {
		if (s.equals("vova")) {
			String s1 = myAdditionalInterface.printAdditional(s);
			s1 = "Expired";
			return s1;
		} else {
			String s1 = myAdditionalInterface.printAdditional(s);
			s1 = "Cool";
			return s1;
		}
	}

	@Override
	public void printAgain(String s) {

	}

	@Override
	public void setMyAdditionalInterface(MyAdditionalInterface myAdditionalInterface) {
		this.myAdditionalInterface = myAdditionalInterface;
	}

}
