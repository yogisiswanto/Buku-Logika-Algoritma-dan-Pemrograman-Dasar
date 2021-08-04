/*
 *  Name Program    : Square Star Pattern
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
 *  *****
 *  *****
 *  *****
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

		// Call method for print square pattern
		pattern.square(number);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for print square pattern
    public static void square(int number){

        // Variable declaration
        int incrementRow, incrementColumn;

        // Loop for print to console the start pattern in raw
		for (incrementRow = 0; incrementRow < number; incrementRow++)
		{
			// Loop for print to console the start pattern in column
			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}
    }
}