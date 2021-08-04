/*
 *  Name Program    : Triangular Character
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
 * 	g
 *   e
 *    m
 *     b
 *    a
 *   l
 *  a
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
		
		// Print triangular character
		pattern.triangularCharacter(string);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for triangular character
    public static void triangularCharacter(String string){

        // Variable declaration
        int incrementRow, incrementColumn, length, space;
		
		// Length inisialization
		length =  string.length();
		space = length / 2;

		// Loop for print pattern
		/* 
		* 	g
		*    e
		*     m
		*/
		for (incrementRow = 0; incrementRow < space; incrementRow++)
		{
			
			for (incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++)
			{
				
				System.out.print(" ");
			}

			System.out.println(string.charAt(incrementRow));
		}

		// Loop for print pattern
		/* 
		*     b
		*    a
		*   l
		*  a
		*/
		for (incrementRow = space; incrementRow < length; incrementRow++)
		{
			
			for (incrementColumn = 1; incrementColumn < (length - incrementRow); incrementColumn++)
			{
				
				System.out.print(" ");
			}

			System.out.println(string.charAt(incrementRow));
		}
    }
}