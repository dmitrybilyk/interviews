package com.learn.unittest;

import org.easymock.EasyMock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyInterfaceImplTest {

	private MyAdditionalInterface myAdditionalInterfaceMock;

	@Test
	public void testPrintVova() {
		MyInterface myInterface = new MyInterfaceImpl();
		myAdditionalInterfaceMock = EasyMock.createMock(MyAdditionalInterface.class);
		EasyMock.expect(myAdditionalInterfaceMock.printAdditional(EasyMock.anyString())).andReturn("777");
		EasyMock.replay(myAdditionalInterfaceMock);
		myInterface.setMyAdditionalInterface(myAdditionalInterfaceMock);
		String result = myInterface.print("vova");
		assertEquals("Expired", result);
	}

	@Test
	public void testPrintNina() {
		MyInterface myInterface = new MyInterfaceImpl();
		myAdditionalInterfaceMock = EasyMock.createMock(MyAdditionalInterface.class);
		EasyMock.expect(myAdditionalInterfaceMock.printAdditional(EasyMock.anyString())).andReturn("777");
		EasyMock.replay(myAdditionalInterfaceMock);
		myInterface.setMyAdditionalInterface(myAdditionalInterfaceMock);
		String result = myInterface.print("nina");
		assertEquals("Cool", result);
	}

	@Test
	public void printAgain() {
	}
}