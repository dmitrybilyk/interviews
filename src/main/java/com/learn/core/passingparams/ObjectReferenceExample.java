package com.learn.core.passingparams;

public class ObjectReferenceExample {

	public static void main(String... doYourBest) {
    	    Simpson simpson = new Simpson();
    	    int i = 10;

		String name = simpson.name;
		transformIntoHomer(simpson, name, 10);
			System.out.println(i);
    	    System.out.println(simpson.name);
    	    System.out.println(simpson.age);
    	    System.out.println(name);
	}

	static void transformIntoHomer(Simpson simpson, String name, int i) {
		    i = 11;
    	    simpson.name = "Homer";
    	    simpson.age = 100;
    	    name = "homerName";
	}

}

class Simpson {
	int age;
	String name;
}