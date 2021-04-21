/*
 *  Name Program    : Fill Array of Integer
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : Java Language
 */

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int[] arrayInteger = new int[5]; 
		int penghitung;

		// Loop for fill array of integer
		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			arrayInteger[penghitung] = penghitung;
		}

		// Loop for print to console value from array of integer
		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			System.out.println(arrayInteger[penghitung]);
		}	
	}
}