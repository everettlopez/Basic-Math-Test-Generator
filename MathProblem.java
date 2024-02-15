package BasicMathTestGenerator;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MathProblem 
{
	private int number1;
    private int number2;
    
    
    /**
     * This will generate a single randomized addition problem in infix notation.
     * 
     * @param userInput - scanner object tracking user answers in the console.
     * @param userResults - list of user responses to problems.
     * @param testAnswers - list of problem answers.
     */
    public void AdditionProblem(Scanner userInput, List<Double> userResults, List<Double> testAnswers)
    {
    	//Generate random numbers for each numbers.
    	Random rng = new Random();
    	number1 = rng.nextInt(-20, 20);
    	number2 = rng.nextInt(-20, 20);
    	
    	//Print generated problem to console.
    	System.out.println(number1 + " + " + number2 + ": ");
    	
    	double userResult = userInput.nextDouble();
    	userResults.add(userResult);
    	
    	double problemAnswer = (number1 + number2);
    	testAnswers.add(problemAnswer);
    	
    }
    
    /**
     * This will generate a single randomized subtract problem in infix notation.
     * 
     * @param userInput - scanner object tracking user answers in the console.
     * @param userResults - list of user responses to problems.
     * @param testAnswers - list of problem answers.
     */
    public void SubtractionProblem(Scanner userInput, List<Double> userResults, List<Double> testAnswers)
    {
    	//Generate random numbers for each numbers.
    	Random rng = new Random();
    	number1 = rng.nextInt(-20, 20);
    	number2 = rng.nextInt(-20, 20);
    	
    	//Print generated problem to console.
    	System.out.println(number1 + " - " + number2 + ": ");
    	
    	double userResult = userInput.nextDouble();
    	userResults.add(userResult);
    	
    	double problemAnswer = (number1 - number2);
    	testAnswers.add(problemAnswer);
    }
    
    /**
     * This will generate a single randomized division problem in infix notation.
     * 
     * @param userInput - scanner object tracking user answers in the console.
     * @param userResults - list of user responses to problems.
     * @param testAnswers - list of problem answers.
     */
    public void DivisionProblem(Scanner userInput, List<Double> userResults, List<Double> testAnswers)
    {
    	//Generate random numbers for each numbers.
    	Random rng = new Random();
    	number1 = rng.nextInt(-20, 20);
    	number2 = rng.nextInt(-20, 20);
    	
    	//Check for division by zero.
    	while(number2 == 0)
    	{
    		number2 = rng.nextInt(-20, 20);
    	}
    	
    	//Print generated problem to console.
    	System.out.println(number1 + " / " + number2 + ": ");
    	
    	double userResult = userInput.nextDouble();
    	userResults.add(userResult);
    	
    	double problemAnswer = (number1 / number2);
    	testAnswers.add(problemAnswer);
    }
    
    /**
     * This will generate a single randomized multiplication problem in infix notation.
     * 
     * @param userInput - scanner object tracking user answers in the console.
     * @param userResults - list of user responses to problems.
     * @param testAnswers - list of problem answers.
     */
    public void MulitplicationProblem(Scanner userInput, List<Double> userResults, List<Double> testAnswers)
    {
    	//Generate random numbers for each numbers.
    	Random rng = new Random();
    	number1 = rng.nextInt(-20, 20);
    	number2 = rng.nextInt(-20, 20);
    	
    	//Print generated problem to console.
    	System.out.println(number1 + " * " + number2 + ": ");
    	
    	double userResult = userInput.nextDouble();
    	userResults.add(userResult);
    	
    	double problemAnswer = (number1 - number2);
    	testAnswers.add(problemAnswer);
    }
    
}
