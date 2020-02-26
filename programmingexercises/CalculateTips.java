package programmingexercises;

import java.util.Scanner;

public class CalculateTips {

	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter subtotal and gratuity 
		System.out.print("Enter the subtotal and a gratuity rate: ");
		
		int subtotal = input.nextInt();
		int gratuity = input.nextInt();
		
		//Obtain  gratuity and total
		
		double tips =  subtotal*gratuity/100.0;
		double total = subtotal + tips;
		
		//Display 
		System.out.println("The gratuity is " + tips + " and total is " + total);

	}

}
