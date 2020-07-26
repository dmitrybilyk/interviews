package com.learn.interview_questions.patterns.structural.decorator;

import com.learn.interview_questions.patterns.structural.decorator.beverageimpl.*;
import com.learn.interview_questions.patterns.structural.decorator.decoratorimpl.Mocha;
import com.learn.interview_questions.patterns.structural.decorator.decoratorimpl.Soy;
import com.learn.interview_questions.patterns.structural.decorator.decoratorimpl.Whip;

//Decorator design pattern is used to modify the functionality of an object
// at runtime. At the same time other instances of the same class will not
// be affected by this, so individual object gets the modified behavior.
//Notice that client program can create different kinds of Object at
// runtime and they can specify the order of execution too.
public class Main
{
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
