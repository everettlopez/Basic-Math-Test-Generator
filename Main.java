package BasicMathTestGenerator;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		MathTest test = new MathTest(10, sc);
		test.generateTest(sc);
		test.calculateScore();
	}

}
