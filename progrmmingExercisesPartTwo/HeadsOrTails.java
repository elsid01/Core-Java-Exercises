package progrmmingExercisesPartTwo;

import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		// Generate the random side 
		int side = (int)(Math.random()*2);
		
		//Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess head or tail? " 
				+ " Enter 0 for head and 1 for tail: ");
		
		int guess = input.nextInt();
		
		//Check the guess
		
		if(guess==side)
			System.out.println("Correct guess");
		else if (side==0)
			System.out.println("Sorry, it's a head");
		
		else 
			System.out.println("Sorry, it's a tail");
		
		
		
	}

}
