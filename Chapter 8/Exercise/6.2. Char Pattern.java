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
		panjang =  string.length();
		spasi = panjang / 2;

		// Loop for print pattern
		/* 
		* 	g
		*   e
		*    m
		*/
		for (baris = 0; baris < spasi; baris++)
		{
			
			for (kolom = 0; kolom < baris; kolom++)
			{
				
				System.out.print(" ");
			}

			System.out.println(string.charAt(baris));
		}

		// Loop for print pattern
		/* 
		*     b
		*    a
		*   l
		*  a
		*/
		for (baris = spasi; baris < panjang; baris++)
		{
			
			for (kolom = 1; kolom < (panjang - baris); kolom++)
			{
				
				System.out.print(" ");
			}

			System.out.println(string.charAt(baris));
		}
	}
}