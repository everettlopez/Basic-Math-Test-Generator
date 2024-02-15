package BasicMathTestGenerator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * This class is designed to create an entirely randomized basic 
 * math test that will store the user input into a list, as well 
 * as storing the problem answer in another list to a=later be compared when 
 * calculating the score. 
 * 
 * This class is currently capable of creating Math Problem objects and calling 
 * each specific problem when randomly being called in the generateTest() method.
 * 
 * @author Everett Lopez 
 * @version February 14, 2024
 */
public class MathTest 
{
	private int totalNumberOfProblems;
	private List<Double> userResponses;
	private List<Double> testAnswers;
	public MathTest(int numberOfProblems, Scanner scanner)
	{
		welcomeMessage();
		totalNumberOfProblems = numberOfProblems;
		userResponses = new ArrayList<>();
		testAnswers = new ArrayList<>();
	}
	
	/**
	 * This is a helper method to calulcate the score of all of the user's responses 
	 * to the randomly generated problems. 
	 */
	public void calculateScore()
	{
		int userScore = 0;
		
		for(int i = 0; i < totalNumberOfProblems; i++)
		{
			if(userResponses.get(i) == testAnswers.get(i))
			{
				userScore++;
			}
		}
		
		System.out.println("Here is your score: " + userScore + "/" + userResponses.size());
	}
	
	/**
	 * This method will randomly generate random problems to the 
	 * console and stores the responses in our local list of responses and correct answers.
	 * @param userInput - scanner to store user input.
	 */
	public void generateTest(Scanner userInput)
	{
		MathProblem problemGenerator = new MathProblem();
		Random rng = new Random();
		
		for(int i = 0; i < totalNumberOfProblems; i++)
		{
			int randomProblemPicker = rng.nextInt(1, 4);
			
			switch(randomProblemPicker)
			{
			case 1:
				problemGenerator.AdditionProblem(userInput, userResponses, testAnswers);
				break;
			case 2:
				problemGenerator.SubtractionProblem(userInput, userResponses, testAnswers);
				break;
			case 3:
				problemGenerator.MulitplicationProblem(userInput, userResponses, testAnswers);
				break;
			case 4:
				problemGenerator.DivisionProblem(userInput, userResponses, testAnswers);
				break;
			}
		}
	}
	
	/**
	 * This is a helper method to easily display the welcome message for the welcome message.
	 */
	private static void welcomeMessage()
	{
		System.out.println("************ BASIC MATH TEST GENERATOR ************");
		System.out.println("\n" + "\t" + "The purpose of this program is to increase your profiency in simple math probelms using operations" + "\n" + 
		"such as addition, subtraction, multiplication and division. This is a work in progress and I hope you enjoy watching the progression" + "\n" +
				"and please follow me on GitHub or LinkedIn.");
		
	}
}
	