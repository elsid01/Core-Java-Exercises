package programmingExercisesPartOne;

import java.util.Scanner;

public class FutureDates {

	public static void main(String[] args) {
		// Create scanner 
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for today's date and the future date
		System.out.println("Enter today's date: ");
		int todaysDate = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int futurDate = input.nextInt();
		
		//Compute the day of the week
		
		
		//Display the today's date
		String nameDate= " ";
		if(todaysDate==0)
			nameDate= "Sunday";
		else if(todaysDate==1)
			nameDate="Monday";
		else if(todaysDate==2)
			nameDate="Tuesday";
		else if(todaysDate==3)
			nameDate="Wednesday";
		else if(todaysDate==4)
			nameDate="Thursday";
		else if(todaysDate==5)
			nameDate="Friday";
		else if(todaysDate==6)
			nameDate="Saturday";
		
		//Display the future day
		int dayOfTheWeek = (todaysDate+futurDate)%7;
		String namefutureDate=" ";
		if(dayOfTheWeek==0)
			namefutureDate="Sunday";
		else if(dayOfTheWeek==1)
			namefutureDate="Monday";
		else if(dayOfTheWeek==2)
			namefutureDate="Tuesday";
		else if(dayOfTheWeek==3)
			namefutureDate="Wednesday";
		else if(dayOfTheWeek==4)
			namefutureDate="Thursday";
		else if(dayOfTheWeek==5)
			namefutureDate="Friday";
		else if(dayOfTheWeek==6)
			namefutureDate="Saturday";
		
		System.out.println("Today's day is " + nameDate + " and the future day will be " + namefutureDate);

	}

}
