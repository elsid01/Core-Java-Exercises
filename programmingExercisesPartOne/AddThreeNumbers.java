package programmingExercisesPartOne;

import java.util.Scanner;

public class AddThreeNumbers {

	public static void main(String[] args) {
		// Create a Scanner 
		Scanner input = new Scanner(System.in);

		//Obtain the  numbers
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int number3 = (int)(Math.random()*10);



		//Prompt the user to answer "What is number1-number2?"
		System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " ?");
		int answer = input.nextInt();

		if(number1+ number2 + number3==answer) 
			System.out.println("You are correct!");
		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " + " + number2 + " + "+ number3 + " should be " + 
					(number1+number2 +number3));
		}

	}
}

