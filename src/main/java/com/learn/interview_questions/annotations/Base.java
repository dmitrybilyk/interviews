package com.learn.interview_questions.annotations;

/* Java program to demonstrate that annotations are
not barely comments (This program throws compiler 
error because we have mentioned override, but not 
overridden, we have overloaded display) */
class Base 
{ 
	public void display() 
	{ 
		System.out.println("Base display()"); 
	} 
} 
class Derived extends Base 
{ 
	@Override
//	public void display(int x)
//	{
//		System.out.println("Derived display(int )");
//	}
	public void display()
	{
		System.out.println("Derived display(int )");
	}

	public static void main(String args[]) 
	{ 
		Derived obj = new Derived(); 
		obj.display(); 
	} 
}
