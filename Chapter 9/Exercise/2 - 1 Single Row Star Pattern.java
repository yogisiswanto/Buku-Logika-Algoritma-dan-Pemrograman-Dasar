/*
 *  Name Program    : Single Row Star Pattern
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

		// Get input from console. Example = 5
		try{

			number = sc.nextInt();

		}catch(Exception e){

		}

		// Call method for print Single row pattern
		pattern.row(number);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for write sentence
    public static void row(int number){

        // Variable declaration
        int increment;

        // Loop for print to console the start pattern
		for (increment = 0; increment < number; increment++)
		{			
			System.out.print("*");
		}
    }
}