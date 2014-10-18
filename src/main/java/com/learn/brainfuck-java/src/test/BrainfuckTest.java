import java.io.File;

import BrainfuckEngine;


public class BrainfuckTest {
	
	public static void main(String[] args) throws Exception {
        String content = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";
		new BrainfuckEngine(30000).interpret(content);
	}


}
