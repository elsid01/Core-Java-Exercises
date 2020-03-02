package examplesAndCaseStudies_chapter3;

import java.util.Scanner;

public class ComputeTaxes {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter filling status
		System.out.println("(0-single filer, 1-married jointly or qualifying widow(er), "
				+ "2-married separately, 3-head of household) Enter filling status: ");
		
		int status = input.nextInt();
		
		//Prompt user to Enter taxable income
		System.out.println("Enter the taxable income: ");
		double income = input.nextDouble();
		
		//Compute tax
		double tax =0;
		if(status==0) {//Compute tax for single filers
			if(income<=8350)
				tax=income*0.10;
			else if (income<=33950)
				tax = 8350*0.10 + (income-8350)*0.15;
			else if (income<=82250)
				tax = 8350*0.10 + (33950-8350)*0.15 + (income-33950)*0.25;
			else if (income<=171550)
				tax = 8350*0.10 + (33950-8350)*0.15 + (822550-33950)*0.25 + (income-822550)*0.28;
			else if (income<=372950)
				tax = 8350*0.10 + (33950-8350)*0.15 + (822550-33950)*0.25 
				+ (171550-822550)*0.28 + (income-171550)*0.28;
			else 
				tax = 8350*0.10 + (33950-8350)*0.15 + (822550-33950)*0.25 
				+ (171550-822550)*0.28 + (372950-171550)*0.28 + (income-372950)*0.35;
		}

		
		
		
		//Display result 
		System.out.println("Tax is " + (int)(tax*100)/100.0);
	}

}
















