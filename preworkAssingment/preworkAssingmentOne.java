package preworkAssingment; import java.util.Scanner;

public class preworkAssingmentOne {

	public static void main(String[] args) {
//declaring variables
			int choice, n;
// to take input form user
			Scanner sc = new Scanner(System.in);
			
				
// to create do-while loop 			
do {
			
//display menu for choices
			System.out.println("Enter your choice below \n"
			+"1. Find palindrome of number\n"
			+"2.Print pattern for given numbre \n"
			+"3.Check whether the no is a prime number\n"
			+"4.print Fibonacci series\n"
			+"Enter 0 to exit. \n");
			
//user input of choice 			
			 choice = sc.nextInt();	
			
			
//user input of number 
			System.out.println("Enter a number...");
			 n = sc.nextInt();		
			
//code according to selected choice
			
	switch(choice) {
	case 0:
		//choice = 0; 
		
	break;
	
////1. check for palindrome number		
	case 1:{
				
				int x;
				x = n;
				int reverseNo = 0;
				
				while(x != 0) {
					
					int lastDigit = x % 10;
					reverseNo = 10*reverseNo + lastDigit; 
					x = x/10;
					
				}
				
				if(reverseNo == n) {
					System.out.println("number "+ n + " is a palindrome number");
				} else {
					System.out.println("number "+ n + " is not a palindrome number");				
				}
							
			}
			break;
	
////2. pattern of stars
	case 2: {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++ ) {
			   	  System.out.print("*");
					} System.out.println(" ");
				}
			}
			break;
	
////3. check if number is prime	
	case 3: {
		 boolean prime = true;
		 for(int i = 2; i < n; i++) {
			 
			 if( n % i == 0) {
			 prime = false;
				 System.out.println("the number "+n+" is not a prime number");
				 break;
			 } else {
//			 	 System.out.println(prime);	
				 System.out.println("the number "+n+"  is a prime number");
				 break;
			 		}
		 		}		 	 	
			}
	     	
	 		   break;
	
////4. Fibonacci series of n
	case 4: {
		 int firstNo = 0, secondNo =1, thirdNo;
		    
		    System.out.print(firstNo + " "); 
		    System.out.print(secondNo + " "); 
		    
		    for(int i = 3; i <= n; i++) {
		    	thirdNo = firstNo + secondNo;
		    	System.out.print(thirdNo + " ");
		    	
		    	firstNo = secondNo;
		    	secondNo = thirdNo;
		    	}
			}
			  break;
	
//exit out of code		
	default: System.out.println("Please enter a valid number...");
			break;
	
	} //end of switch cases

} while (choice != 0); //end of do-while loop

   System.out.println("Exited Sucessfully");
		
		}

	}
	
