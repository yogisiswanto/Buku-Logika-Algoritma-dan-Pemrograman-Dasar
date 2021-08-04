/*
 *  Name Program    : Star Ladder Pattern
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	*****
 * 	 *****
 *    *****
 *     *****
 *      *****
 */

import java.util.Scanner; 

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
		int number = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
		Pattern pattern = new Pattern();

		System.out.println("Masukan banyaknya number:");

		// Get input from console
		try{

			number = sc.nextInt();

		}catch(Exception e){

		}

		// Call method for print star ledder pattern
		pattern.starLadder(number);

	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for star ledder pattern
    public static void starLadder(int number){

        // Variable declaration
        int incrementRow, incrementColumn;

		// Loop for star print look like stair
		for (incrementRow = 0; incrementRow < number; incrementRow++)
		{
			// Loop for print to console the start pattern in column
			for (incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++)
			{
				
				System.out.print(" ");
			}

			// Loop for print to console the start pattern in column
			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}
    }
}