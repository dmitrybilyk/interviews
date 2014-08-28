package test;

import java.io.File;

import org.faabtech.brainfuck.BrainfuckEngine;


public class BrainfuckTest {
	
	public static void main(String[] args) throws Exception {
		new BrainfuckEngine(30000).interpret(new File(
				"/home/bid/Dev/projects/interview/brainfuck-java/samples/hello_world.bf"));
	}

}
