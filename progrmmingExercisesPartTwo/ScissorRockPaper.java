package progrmmingExercisesPartTwo;

import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args) {
		// Generate scissor, rock, paper
		int computerNumber = (int)( Math.random()*3);
		
		//Prompt the user to enter scissor, rock, or paper
		
		Scanner input = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int userNumber = input.nextInt();
		
		//Check the guess
		switch(computerNumber) {
		case 0:
			if(userNumber==0)
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			else if(userNumber==1)
				System.out.println("The computer is scissor. you are rock. You won");
			else if(userNumber==2)
				System.out.println("The computer is scissor. You are paper. You lost");
			break;
			
		case 1:
			if(userNumber==0)
				System.out.println("The computer is rock. You are scissor . you lost");
			else if(userNumber==1)
				System.out.println("The computer is rock. you are rock too . It's a draw ");
			else if(userNumber==2)
				System.out.println("The computer is rock. You are paper. You won");
			break;
			
		case 2:
			if(userNumber==0)
				System.out.println("The computer is paper. You are scissor . You won");
			else if(userNumber==1)
				System.out.println("The computer is paper. you are rock. You Lost");
			else if(userNumber==2)
				System.out.println("The computer is paper. You are paper. It's a draw");
			break;
		}

	}

}
