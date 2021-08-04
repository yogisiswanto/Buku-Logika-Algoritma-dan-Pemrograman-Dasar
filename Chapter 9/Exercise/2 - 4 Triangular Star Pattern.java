/*
 *  Name Program    : Triangular Star Pattern
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
 *   *****
 *    *****
 *   *****
 *  *****
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

		System.out.println("Masukan banyaknya bintang:");

		// Get input from console
		try{

			number = sc.nextInt();

		}catch(Exception e){

		}

		// Call method for print triangular star pattern
		pattern.triangularStar(number);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for print triangular star pattern
    public static void triangularStar(int number){

        // Variable declaration
        int incrementRow, incrementColumn;

		// Loop for star print of top part
		/* 
		 * 	*****
		 *   *****
		 */
		for (incrementRow = 0; incrementRow < (number / 2); incrementRow++)
		{
			
			for (incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++)
			{
				
				System.out.print(" ");
			}

			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		// Loop for star print of middle part
		//     *****
		if (number % 2 == 1)
		{
			
			for (incrementColumn = 0; incrementColumn < (number / 2); incrementColumn++)
			{
				System.out.print(" ");
			}

			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				
				System.out.print("*");
			}

			System.out.println();
		}

		// Loop for star print of bottom part
		/* 
		 *   *****
		 *  *****
		 */
		for (incrementRow = 0; incrementRow < (number / 2); incrementRow++)
		{
			
			for (incrementColumn = ((number / 2) - incrementRow); incrementColumn > 1; incrementColumn--)
			{
				
				System.out.print(" ");
			}

			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}
    }
}