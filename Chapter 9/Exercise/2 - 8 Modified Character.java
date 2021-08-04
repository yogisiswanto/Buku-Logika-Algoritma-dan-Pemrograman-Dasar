/*
 *  Name Program    : Modified Character
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	4
 *  anilsa
 *  igoy
 *  ulfa
 *  enigma
 * 
 * 	Output
 * 	------
 * 	aslina
 *  gioy
 *  aflu
 *  enigma
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration	
		String[] string = new String[10];
		int number, increment;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
		Pattern pattern = new Pattern();

		// Variable inisialization
		number = 0;

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
		}
		
		// Print modified character
		pattern.modifiedCharacter(number, string);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for modified character
    public static void modifiedCharacter(int number, String[] string){

        // Variable declaration
        int incrementRow, incrementColumn;
		
		// Looping for checking string
		for (incrementRow = 0; incrementRow < number; incrementRow++)
		{

			// Condition when string has prefix A or a. From anilsa into aslina
			if ((string[incrementRow].charAt(0) == 'A') || (string[incrementRow].charAt(0) == 'a'))
			{
				
				for (incrementColumn = string[incrementRow].length() - 1; incrementColumn >= 0; incrementColumn--)
				{
					System.out.print(string[incrementRow].charAt(incrementColumn));
				}

				System.out.println();
			
			}

			// Condition when string has prefix I or i. From igoy into gioy
			else if ((string[incrementRow].charAt(0) == 'I') || (string[incrementRow].charAt(0) == 'i'))
			{
				// Variable declaration & inisialization
				int length = 0;
				int start = 0;
				int middle = 0;

				// Set length from current string
				length = string[incrementRow].length();

				// Condition when length of current string is even
				if (length % 2 == 0)
				{
					start = (length / 2) - 1;
					middle = length / 2;
				}

				// Condition when length of current string is odd
				else{

					start = length / 2;
					middle = (length / 2) + 1;
				}

				for (incrementColumn = start; incrementColumn >= 0; incrementColumn--)
				{
					System.out.print(string[incrementRow].charAt(incrementColumn));
				}

				for (incrementColumn = middle; incrementColumn < length; incrementColumn++)
				{
					System.out.print(string[incrementRow].charAt(incrementColumn));
				}

				System.out.println();
			}

			// Condition when string has prefix U or u. From ulfa into aflu
			else if ((string[incrementRow].charAt(0) == 'U') || (string[incrementRow].charAt(0) == 'u'))
			{
				for (incrementColumn = string[incrementRow].length() - 1; incrementColumn >= 0; incrementColumn--)
				{
					System.out.print(string[incrementRow].charAt(incrementColumn));
				}

				System.out.println();
			}

			// Alternate condition
			else{
				
				System.out.println(string[incrementRow]);
			}	
		}
    }
}