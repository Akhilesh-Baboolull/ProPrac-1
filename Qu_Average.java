import java.util.Scanner;

/**
 * This application calculates the Average of 4 numbers
 * 
 * @author Akhilesh: 
 * @version 1.0
 * 
 *  */



public class Qu_Average {
	
	public static void clearScreen() {
		for (int i = 0; i <= 10; i++) {
					
		System.out.println();
		//attempting to clear screen by adding at least 10 lines as there is no command to clear screen for windows.
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myKey = new Scanner(System.in);
		
		int num;
		int total = 0;
		double average;
		int choice = 1;

		
		while (choice == 1){
			
		for(int i = 1; i <= 4; i++){
			
			System.out.print("Enter number: ");
			num = myKey.nextInt(); //input number
			
			total += num; //Calculation of total
						
		}
			
			average = total / 4; //Calculation of average
			
			System.out.println("The average is: " + average);
			//Printing average
			
			System.out.println();
			
			
			do {
				
			System.out.println("Press 1....to Re-Try!!");
			System.out.println("Press 2....to Exit Program!!");
			
			System.out.print("Enter choice: ");
			choice = myKey.nextInt();
			//asking user if he/she wishes to re-enter.
			if ((choice != 1) && (choice != 2)) {
				System.out.println("Invalid Choice! Please Re-Enter");
			}
			
			} while((choice != 1) && (choice != 2));
			
			
			if (choice == 1) {
				clearScreen(); //clearing the screen to start fresh
			}
			else if(choice == 2) {
				System.out.print("You are exiting the program!"); //message informing exit of program
			}
			
		} 
		
		
		
			
			
			
			
			
		myKey.close();
		
		
	}

}
