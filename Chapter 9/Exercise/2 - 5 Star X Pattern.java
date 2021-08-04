/*
 *  Name Program    : Star X Pattern
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
 * 	*****    *****
 *   *****  *****
 *    **********
 *   *****  *****
 *  *****    *****
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

		// Call method for print x star pattern
		pattern.xstar(number);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for star ledder pattern
    public static void xstar(int number){

        // Variable declaration
        int incrementRow, incrementColumn, border, bottom;

		// Condition when input is even
		if (number % 2 == 0)
		{
			bottom = number / 2;
			border = number - 2;
		
		// Condition when input is odd
		}else{

			bottom = (number / 2) + 1;
			border = number - 1;
		}

		// Loop for star print for top part
		/* 
		 * 	*****    *****
		 *   *****  *****
		 *    **********
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

			for (incrementColumn = 0; incrementColumn < (border - (incrementRow * 2)); incrementColumn++)
			{
				
				System.out.print(" ");
			}

			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		// Loop for star print for bottom part
		/* 
		 *   *****  *****
		 *  *****    *****
		 */
		for (incrementRow = 0; incrementRow < bottom; incrementRow++)
		{
			
			for (incrementColumn = bottom - incrementRow; incrementColumn > 1; incrementColumn--)
			{
				
				System.out.print(" ");
			}

			for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
			{
				
				System.out.print("*");
			}

			for (incrementColumn = 0; incrementColumn < (incrementRow * 2); incrementColumn++)
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