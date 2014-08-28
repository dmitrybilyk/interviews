package org.faabtech.brainfuck;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * The {@link org.faabtech.brainfuck.BrainfuckEngine} class is an implementation of the original <code>brainfuck</code>
 * 	language.
 * 
 * @author Fabian M.
 */
public class BrainfuckEngine {

   /**
    * The memory thats available for this <code>brainfuck</code> program.
    */
   protected byte[] data;

   /**
    * The data pointer that points to the current index in the {@link org.faabtech.brainfuck.BrainfuckEngine#data} memory array.
    */
   protected int dataPointer = 0;

   /**
    * The character pointer that points to the current index of the character array
    * 	of value of its file or string.
    */
   protected int charPointer = 0;

   /**
    * The {@link org.faabtech.brainfuck.BrainfuckEngine#fileReader} allows use to read from a file if one is specified.
    */
   protected BufferedReader fileReader;

   /**
    * The {@link org.faabtech.brainfuck.BrainfuckEngine#consoleReader} allows us to read from the console for the ',' keyword.
    */
   protected InputStreamReader consoleReader;

   /**
    * The {@link org.faabtech.brainfuck.BrainfuckEngine#outWriter} allows us to write to the console.
    */
   protected OutputStream outWriter;

   /**
    * The current line the engine is at.
    */
   protected int lineCount = 0;

   /**
    * The current column the engine is at.
    */
   protected int columnCount = 0;

   /**
    * The {@link org.faabtech.brainfuck.BrainfuckEngine.Token} class contains tokens in <code>brainfuck</code>.
    *
    * @author Fabian M.
    */
   protected static class Token
   {

      public final static char NEXT         = '>';
      public final static char PREVIOUS     = '<';
      public final static char PLUS         = '+';
      public final static char MINUS        = '-';
      public final static char OUTPUT       = '.';
      public final static char INPUT        = ',';
      public final static char BRACKET_LEFT = '[';
		public final static char BRACKET_RIGHT = ']';
	}

	/**
	 * Constructs a new {@link org.faabtech.brainfuck.BrainfuckEngine} instance.
	 * 
	 * @param cells
	 *            The amount of memory cells.
	 */
	public BrainfuckEngine(int cells) {
		this(cells, new PrintStream(System.out), System.in);
	}

	/**
	 * Constructs a new {@link org.faabtech.brainfuck.BrainfuckEngine} instance.
	 * 
	 * @param cells
	 *            The amount of mem
		interpret(content);ory cells.
	 * @param out The outputstream of this program.
	 */
	public BrainfuckEngine(int cells, OutputStream out) {
		this(cells, out, System.in);
	}

	/**
	 * Constructs a new {@link org.faabtech.brainfuck.BrainfuckEngine} instance.
	 * 
	 * @param cells
	 *            The amount of memory cells.
	 * @param out The printstream of this program.
	 * @param in The outputstream of this program.
	 */
	public BrainfuckEngine(int cells, OutputStream out, InputStream in) {
		initate(cells);
		outWriter = out;
		consoleReader = new InputStreamReader(in); 
	}

	/**
	 * Initiate this instance.
	 */
	protected void initate(int cells) {
		data = new byte[cells];
		dataPointer = 0;
		charPointer = 0;
	}

	/**
	 * Interprets the given string.
	 * 
	 * @param str
	 *            The string to interpret.
	 * @throws Exception
	 */
	public void interpret(String str) throws Exception {
		for (; charPointer < str.length(); charPointer++) 
			interpret(str.charAt(charPointer), str.toCharArray());
		initate(data.length);
	}
	
	/**
	 * Interprets the given char
	 * 
	 * @param c
	 *            The char to interpret.
	 * @throws Exception
	 */
	protected void interpret(char c, char[] chars) throws Exception {
		switch (c) {
		case Token.NEXT:
			// increment the data pointer (to point to the next cell to the
			// right).
			if ((dataPointer + 1) > data.length) {
				throw new Exception("Error on line " + lineCount + ", column " + columnCount + ":" 
						+ "data pointer (" + dataPointer
						+ ") on postion " + charPointer + "" + " out of range.");
			}
			dataPointer++;
			break;
		case Token.PREVIOUS:
			// decrement the data pointer (to point to the next cell to the
			// left).
			if ((dataPointer - 1) < 0) {
				throw new Exception("Error on line " + lineCount + ", column " + columnCount + ":" 
						+ "data pointer (" + dataPointer
						+ ") on postion " + charPointer + " " + "negative.");
			}
			dataPointer--;
			break;
		case Token.PLUS:

			// increment (increase by one) the byte at the data pointer.
			if ((((int) data[dataPointer]) + 1) > Integer.MAX_VALUE) {
				throw new Exception("Error on line " + lineCount + ", column " + columnCount + ":" 
						+ "byte value at data pointer ("
						+ dataPointer + ") " + " on postion " + charPointer
						+ " higher than byte max value.");
			}
			data[dataPointer]++;
			break;
		case Token.MINUS:
			// decrement (decrease by one) the byte at the data pointer.
			/*if ((data[dataPointer] - 1) < 0) {
				throw new Exception("Error on line " + lineCount + ", column " + columnCount + ":" 
						+ "at data pointer " + dataPointer
						+ " on postion " + charPointer
						+ ": Value can not be lower than zero.");
			}*/
			data[dataPointer]--;
			break;
		case Token.OUTPUT:
			// Output the byte at the current index in a character.
			outWriter.write((char) data[dataPointer]);
			break;
		case Token.INPUT:
			// accept one byte of input, storing its value in the byte at the data pointer.
			data[dataPointer] = (byte) consoleReader.read();
			break;
		case Token.BRACKET_LEFT:
			if (data[dataPointer] == 0) {
				int i = 1;
				while (i > 0) {
					char c2 = chars[++charPointer];
					if (c2 == Token.BRACKET_LEFT)
						i++;
					else if (c2 == Token.BRACKET_RIGHT)
						i--;
				}
			}
			break;
		case Token.BRACKET_RIGHT:
			int i = 1;
			while (i > 0) {
				char c2 = chars[--charPointer];
				if (c2 == Token.BRACKET_LEFT)
					i--;
				else if (c2 == Token.BRACKET_RIGHT)
					i++;
			}
			charPointer--;
			break;
		}
		columnCount++;
	}
}

