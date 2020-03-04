package progrmmingExercisesPartTwo;

import java.util.Scanner;

public class LotteryPart2 {

	public static void main(String[] args) {
		// Generate the random number
		int lottery = (int)(Math.random()*1000);
		
		//Prompt the user to enter a guess
		System.out.println("Enter your guess number of three digits: ");
		Scanner input = new Scanner(System.in);
		
		int guess = input.nextInt();
		
		//Get digits from guess
		
		int g1 = guess/100;
		int g2 = (guess%100)/10;
        int g3 = guess%10;
        
        // get digits from lottery
        int l1 = lottery/100;
        int l2 = (lottery%100)/10;
        int l3 = lottery%10;
        
        //Check the  match digits
        if(guess==lottery)
        	System.out.println("Exat match: you win $10,000");
        else if(g1==l1 && g3==l2 && g2==l3 ||
                g2==l1 && g1==l2 && g3==l3  ||
                g3==l1 && g1==l2 && g2==l3 ||
                g3==l1 && g2==l2 && g1==l3)
              System.out.println("Match all digits: you win: $3,000");
        	
        else if(g1==l1 || g1==l2 || g1==l3 ||
        		g2==l1 || g2==l2 || g2==l3 ||
        		g3==l1 || g3==l2 || g3==l3 )
        	System.out.println("Match one digit: you win 1,000");
        else 
        	System.out.println("Sorry, no match");
			
		
        	
        	
        	
        	
        	
        	
        	
        	
	}

}
