/*
 *  Name Program    : String Pattern
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	4
 *  aku
 *  adalah
 *  anak
 *  gembala
 * 
 * 	Output
 * 	------
 * 	a a a g
 *  k d n e
 *  u a a m
 *    l k b
 *    a   a
 *    h   l
 *        a
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		String[] string = new String[99];
		int number, increment, length;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
		Pattern pattern = new Pattern();

		// Variable inisialization
		number = 0;
		length = 0;

		// Get input from console
		try{

			number = sc.nextInt();

		}catch(Exception e){

		}

		for (increment = 0; increment < number; increment++) {

			try{

				string[increment] = sc.next();

			}catch(Exception e){

			}

			// Get the maximum string length
			if (length < string[increment].length())
			{
				length = string[increment].length();
			}
		}

		// Print string pattern
		pattern.stringPattern(number, length, string);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for triangular character
    public static void stringPattern(int number, int length, String[] string){

        // Variable declaration
        int incrementRow, incrementColumn;
		
		// Loop for print patter horizonaly
		for (incrementRow = 0; incrementRow < length; incrementRow++)
		{	
			// Loop for print patter verticaly
			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				// Condition when incrementRow is less than length of string column
				if (incrementRow < string[incrementColumn].length()) {
					
					// Condition when column is equal with number min 1
					if (incrementColumn == number - 1)
					{
						System.out.print(string[incrementColumn].charAt(incrementRow));
					}

					// Alternate condition
					else{		

						System.out.print(string[incrementColumn].charAt(incrementRow) + " ");
					}		

				// Alternate condition
				}else{

					System.out.print("  ");
				}			
			}

			System.out.println();
		}
    }
}