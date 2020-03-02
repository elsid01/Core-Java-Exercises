package programmingExercisesPartOne;

import java.util.Scanner;

public class CheckIsbn {

	public static void main(String[] args) {
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an integer
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int number = input.nextInt();
		
		//Calculate checksum 
		int checksum=
				((number/100000000%10)*1 + 
				(number/10000000%10)*2+
				(number/1000000%10)*3+
				(number/100000%10)*4+
				(number/10000%10)*5+
				(number/1000%10)*6+
				(number/100%10)*7+
				(number/10%10)*8+
				(number%10)*9)%11;
		System.out.println("The ISBN-10 number is ");
		
		//Display leading zero
		if(number/100000000==0) {
			System.out.println("0");
			if(number/10000000==0) {
				System.out.println("0");
				if(number/1000000==0) {
					System.out.println("0");
					if(number/100000==0) {
						System.out.println("0");
						if(number/10000==0) {
							System.out.println("0");
							if(number/1000==0) {
								System.out.println("0");
								if(number/100==0) {
									System.out.println("0");
									if(number/10==0) {
										System.out.println("0");
										if(number==0) {
											System.out.println("0");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.println(number);
		
		if(checksum==10)
			System.out.println("X");
		else
			System.out.println(checksum);

	}

}
