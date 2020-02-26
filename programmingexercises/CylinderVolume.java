package programmingexercises;

import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter radius and length
		System.out.print("Enter the radius and length of a cylinder");
		double radius = input.nextDouble();
		int length = input.nextInt();
		final double PI = 3.14159;
		
		//Obtain area and volume
		
		double area = radius*radius*PI;
		double volume = area*length;
		
		//display 
		System.out.println("The are is " + area);
		System.out.println("The volume is " + volume);
		
		

	}

}
