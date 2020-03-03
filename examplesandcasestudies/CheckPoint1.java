package examplesandcasestudies;

public class CheckPoint1 {

	public static void main(String[] args) {
		// Question 5.3
		int i =1;
		while(i<10) {
			if(i%2==0) { 
				System.out.println(i);
		}
		}
        
		
		 i = 1;
		 while(i<10) {
			 if(i%2==0)
				 System.out.println(i++);
		 }
		
		 i=1;
		 while(i<10)
			 if((i++)%2 == 0)
				 System.out.println(i);
	}

}
