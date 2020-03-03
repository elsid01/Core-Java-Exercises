package examplesandcasestudies;

import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {
		// Generate the random  number
		
		int number = (int)(Math.random()*101);
		
		//Prompt the user for answer
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100 ");
		int answer =-1;
		
		while(answer != number) {
			System.out.println("Enter your guess: ");
			answer = input.nextInt();
			if(answer==number) {
				System.out.println("Yes the number is " + answer);
			}
			else if(answer>number) {
				System.out.println("Your guess is too high: ");
				
			}else  {
				System.out.println("Your guess is too low: ");
				
			}
		}
        
	}

}
