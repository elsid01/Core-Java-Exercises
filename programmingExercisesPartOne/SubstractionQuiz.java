package programmingExercisesPartOne;

import java.util.Scanner;

public class SubstractionQuiz {

	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Generate the random single-digit integers
		int number1= (int)(Math.random()*10);
		int number2= (int)(Math.random()*10);
		
		//Prompt the user for the answer
		System.out.println("What is " + number1 + "-" + number2 + "?");
		int answer = input.nextInt();
		
		//Display the result
		String replyString;
		if(number1-number2==answer) {
			replyString="You are correct";
		}else {
			replyString="Your answer is wrong.\n" + number1 + "-"
					+number2 + "should be " +(number1-number2);
			
		}
		System.out.println(replyString);
		
	}

}
