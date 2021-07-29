/*
 *  Name Program    : Star Ladder Pattern
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 28th April 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	*****
 * 	 *****
 *    *****
 *     *****
 *      *****
 */

import java.util.Scanner; 

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int baris, kolom, bintang;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan banyaknya bintang:");

		// Get input from console
		try{

			bintang = sc.nextInt();

		}catch(Exception e){

		}

		// Loop for star print look like stair
		for (baris = 0; baris < bintang; baris++)
		{
			
			for (kolom = 0; kolom < baris; kolom++)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
}