/*
 *  Name Program    : Average
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	-
 * 
 * 	Output
 * 	------
 * 	5.50
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int increment;
		double hasil;

		// Variable initialization
		hasil = 0.0;

		// Loop for calculate sum
		for (increment = 1; increment <= 10; increment++)
		{
			hasil = hasil * increment;
		}

		// Calculate average
		hasil = hasil / 10;

		// Print to console
		System.out.println(hasil);
	}
}