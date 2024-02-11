package BasicMathTestGenerator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * This class is designed to create an entire math test with certain sections 
 * for specific arithmetic operations like division, multiplication, addition,
 * and even subtraction. 
 * 
 * Each section has its own score in order to determine the level of proficiency 
 * and notify the user as to which operations to work on. 
 * 
 * Note: The variables can be changed in the constructor of the class by altering
 * the number of problems for each category. 
 * 
 * @author Everett Lopez 
 * @version February 10, 2024
 */
public class BasicMathTestGenerator 
{
	public static Scanner sc;
	
	public static int score;
	
	public static int additionScore;
	public static int subtractionScore;
	public static int multiplicationScore;
	public static int divisionScore;
	
	public static int additionProblems;
	public static int divisionProblems;
	public static int subtractionProblems;
	public static int multiplicationProblems;
	
	public static int totalNumberOfProblems;
	
	public BasicMathTestGenerator()
	{
		sc = new Scanner(System.in);
		
		score = 0;
		additionScore = 0;
		subtractionScore = 0;
		multiplicationScore = 0;
		divisionScore = 0;
		
		additionProblems = 3;
		divisionProblems = 3;
		subtractionProblems = 3;
		multiplicationProblems = 3;
		
		totalNumberOfProblems = additionProblems + divisionProblems + subtractionProblems + multiplicationProblems;
		
		welcomeMessage();
		System.out.print("Please enter your name: ");
		String userName = sc.nextLine();
		
		//This statement will once the user inputs their name.
		if(userName != null)
		{
			startMessage(userName);
			
			additionProblems();
			subtractionProblems();
			multiplicationProblems();
			divisionProblems();
		}
		sc.close();
	}
	
	public static void main(String[] args) 
	{
		BasicMathTestGenerator newClass = new BasicMathTestGenerator();
		calculateScore();
	}
	
	
	//************************HELPER METHODS***********************************************
	
	/**
	 * This is a simple helper method that displays the welcome message to the program. In order
	 * for cleaner code, I decided to make it a helper method and leave room in the main method for simple 
	 * method calls.
	 */
	private static void welcomeMessage()
	{
		System.out.println("*********WELCOME TO MY RANDOM MATH TEST PROGRAM*********");
		System.out.println("\n" + "\t" + "The purpose of this program is to increase your profiency in simple math probelms using operations" + "\n" + 
		"such as addition, subtraction, multiplication and division. You first be given the basic introduction test" + "\n" + 
				"that consists of " + totalNumberOfProblems + " math problems, four problems in each of the math operations." + "\n");
	}
	
	/**
	 * Provides a cuztomized starting message with the users name from the scanner input
	 * to notify the user that the test has begin.
	 * 
	 * @param userName - Inputted name of the user. 
	 */
	private static void startMessage(String userName)
	{
		System.out.println("\n" + "Welcome " + userName + ", we will now begin the random math test. Good luck!" + "\n");
		System.out.println("**************************************************" + "\n");
	}
	
	/**
	 * Responsible for randomly creating addition problems where each number has a range value from 
	 * 0 to 20. If the varibales have been changed in the constructor, the number of problems will correspond to 
	 * the intiailized input without directly touching this method.
	 */
	private static void additionProblems()
	{
		System.out.println("**** Addition Problems ****");
		System.out.println("This section will be made up of four addition problems where each number will range from 0 to 20." + "\n");
		
		
		Random rng = new Random();
		
		for(int i = 0; i < additionProblems; i++)
		{
			//Populate random numbers to compute in addition.
			int number1 = rng.nextInt(0, 20);
			int number2 = rng.nextInt(0, 20);
			
			//Asl the question
			System.out.print(number1 + " + " + number2 + ": ");
			int userResult = sc.nextInt();
			
			int correctResult = number1 + number2;
			
			//Update score once correct.
			if(userResult == correctResult)
			{
				additionScore++;
				score++;
			}
		}
	}
	
	/**
	 * Responsible for randomly creating subtraction problems where each number has a range value from 
	 * 0 to 12. If the varibales have been changed in the constructor, the number of problems will correspond to 
	 * the intiailized input without directly touching this method.
	 */
	private static void subtractionProblems()
	{
		System.out.println("\n" + "**** Subtraction Problems ****");
		System.out.println("This section will be made up of four subtraction problems where each number will range from 0 to 12." + "\n");
		
		Random rng = new Random();
		
		for(int i = 0; i < subtractionProblems; i++)
		{
			//Populate random numbers to compute in addition.
			int number1 = rng.nextInt(0, 12);
			int number2 = rng.nextInt(0, 12);
			
			//Asl the question
			System.out.print(number1 + " - " + number2 + ": ");
			int userResult = sc.nextInt();
			
			int correctResult = number1 - number2;
			
			//Update score once correct.
			if(userResult == correctResult)
			{
				subtractionScore++;
				score++;
			}
		}
	}
	
	/**
	 * Responsible for randomly creating multiplication problems where each number has a range value from 
	 * 0 to 20. If the varibales have been changed in the constructor, the number of problems will correspond to 
	 * the intiailized input without directly touching this method.
	 */
	private static void multiplicationProblems()
	{
		System.out.println("\n" + "**** Multiplication Problems ****");
		System.out.println("This section will be made up of four multiplication problems where each number will range from 0 to 12." + "\n");
		
		Random rng = new Random();
		
		for(int i = 0; i < multiplicationProblems; i++)
		{
			//Populate random numbers to compute in addition.
			int number1 = rng.nextInt(0, 12);
			int number2 = rng.nextInt(0, 12);
			
			//Asl the question
			System.out.print(number1 + " x " + number2 + ": ");
			int userResult = sc.nextInt();
			
			int correctResult = number1 * number2;
			
			//Update score once correct.
			if(userResult == correctResult)
			{
				multiplicationScore++;
				score++;
			}
		}
	}
	
	/**
	 * Responsible for randomly creating division problems where each number has a range value from 
	 * 0 to 20. If the varibales have been changed in the constructor, the number of problems will correspond to 
	 * the intiailized input without directly touching this method.
	 */
	private static void divisionProblems()
	{
		System.out.println("\n" + "**** Division Problems ****");
		System.out.println("This section will be made up of four division problems where the numerator will never be 0." + "\n" + 
		"NOTE: If the result is a simple integer such as 1.0, you can return 1. Also round to the second decimal place." + "\n");
		
		Random rng = new Random();
		
		for(int i = 0; i < divisionProblems; i++)
		{
			int number1 = rng.nextInt(0, 20);
			int number2 = rng.nextInt(1, 20);	
			
			//Ask the question
			System.out.print(number1 + " / " + number2 + ": ");
			double userResult = sc.nextDouble();
			
			
			double correctResult = (double) number1 / (double)number2;
			boolean fail = (BigDecimal.valueOf(correctResult).scale() > 2);
		
			if(fail)
			{
				correctResult = round(correctResult, 2);
			}
			
			
			if((number1 % number2) == 0)
			{
				if(userResult == (int) correctResult)
				{
					divisionScore++;
					score++;
				}
			}
			else if(userResult == correctResult)
			{
				divisionScore++;
				score++;
			}
		}
	}
	
	/**
	 * Rounds the inputted double value to a specific number of decimal places.
	 *  
	 * @param value - inputted double value to be rounded.
	 * @param places - number of decimal places to the right to round.
	 * @return the desired double value.
	 */
	private static double round(double value, int places) 
	{
	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	/**
	 * Responsible for calulcating the users score and proficiency in each of the 
	 * mathemtic operations.
	 */
	private static void calculateScore()
	{
		double tempAdditionScore = additionScore / additionProblems;
		double tempSubtractionScore = subtractionScore / subtractionProblems;
		double tempDivisionScore = divisionScore / divisionProblems;
		double tempMultiplicationScore = multiplicationScore / multiplicationProblems;
		
		
		System.out.println("\n" + "Your overall score is " + score + "/" + totalNumberOfProblems);
		
		if(tempAdditionScore < 0.50)
		{
			System.out.println("You need to work on addition a bit more.");
		}
		if(tempSubtractionScore < 0.50)
		{
			System.out.println("You need to work on subtraction a bit more.");
		}
		if(tempDivisionScore < 0.50)
		{
			System.out.println("You need to work on division a bit more.");
		}
		if(tempMultiplicationScore < 0.50)
		{
			System.out.println("You need to work on multiplication a bit more.");
		}
	}
	
}
