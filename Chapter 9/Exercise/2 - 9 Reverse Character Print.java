/*
 *  Name Program    : Reverse Character Print
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	gembala
 * 
 * 	Output
 * 	------
 * 	     a
 *       l
 *      a
 *     b
 *    m
 *   e
 *  g
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		String string = "";
		
		// Variable instantiation
		Scanner sc = new Scanner(System.in);
		Pattern pattern = new Pattern();

		// Get input from console
		try{

			string = sc.next();

		}catch(Exception e){

		}

		// reverse character
		pattern.reverseCharacterPrint(string);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for reverse character
    public static void reverseCharacterPrint(String string){

        // Variable declaration
        int incrementRow, incrementColumn, length, space;
		
		// Length inisialization
		length = string.length() - 1;
		space = length - 1;

		// Loop for print pattern
		for (incrementRow = length; incrementRow >= 0; incrementRow--)
		{
			// Decrement white space
			if (incrementRow < length - 1)
			{
				space--;
			}

			// Print white space
			for (incrementColumn = 0; incrementColumn < space; incrementColumn++)
			{
				System.out.print(" ");
			}

			System.out.println(string.charAt(incrementRow));
		}
    }
}