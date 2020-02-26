package programmingexercises;

import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args) {
	//create a scanner
	Scanner input = new Scanner(System.in);
	
	//Enter Celcius
	System.out.print("Enter a degree in Celcius:");
	int  celcius = input.nextInt();
	
	//Obtain Fahrenheit
	
	double fahrenheit = (9.0/5)*celcius + 32;
	
	//Display result
	
	System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
}
}
