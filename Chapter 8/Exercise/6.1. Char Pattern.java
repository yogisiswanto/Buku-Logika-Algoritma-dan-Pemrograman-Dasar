/*
 *  Name Program    : Char Pattern
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
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
		int baris, kolom, panjang, spasi;

		Scanner sc = new Scanner(System.in);

		baris = 0;
		kolom = 0;
		panjang = 0;
		spasi = 0;

		// Get input from console
		try{

			string = sc.next();

		}catch(Exception e){

		}

		// Length inisialization
		panjang = string.length() - 1;
		spasi = panjang - 1;

		// Loop for print pattern
		for (baris = panjang; baris >= 0; baris--)
		{
			// Decrement white space
			if (baris < panjang - 1)
			{
				spasi--;
			}

			// Print white space
			for (kolom = 0; kolom < spasi; kolom++)
			{
				System.out.print(" ");
			}

			System.out.println(string.charAt(baris));
		}
	}
}