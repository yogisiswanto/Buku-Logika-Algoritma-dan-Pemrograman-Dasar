/*
 *  Name Program    : Character Stair
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : Java Language
 * 
 *  Input
 *  -----
 *  akuadalah
 * 
 *  Output
 *  ------
 *  a
 *   k
 *    u
 *     a
 *      d
 *       a
 *        l
 *         a
 *          h
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
		String string = "";

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
		Pattern pattern = new Pattern();

		System.out.println("Masukan kata:\n");

		// Get input from console
		try{

			string = sc.next();

		}catch(Exception e){

		}

		// Print character look like stair
		pattern.characterStair(string);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for print character look like stair
    public static void characterStair(String string){

        // Variable declaration
        int incrementRow, incrementColumn;
		
		// Loop for print character like stair
		for (incrementRow = 0; incrementRow < string.length(); incrementRow++)
		{
			for (incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++)
			{
				System.out.print(" ");
			}

			System.out.println(string.charAt(incrementRow));
		}
    }
}