/*
 *  Name Program    : String Pattern
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	4
 *  aku
 *  adalah
 *  anak
 *  gembala
 * 
 * 	Output
 * 	------
 * 	a a a g
 *  k d n e
 *  u a a m
 *    l k b
 *    a   a
 *    h   l
 *        a
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		String[] string = new String[99];
		int banyak, baris, kolom, panjang;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

		// Variable inisialization
		banyak = 0;
		baris = 0;
		kolom = 0;
		panjang = 0;

		// Get input from console
		try{

			banyak = sc.nextInt();

		}catch(Exception e){

		}

		for (baris = 0; baris < banyak; baris++) {

			try{

				string[baris] = sc.next();

			}catch(Exception e){

			}

			// Get the maximum string length
			if (panjang < string[baris].length())
			{
				panjang = string[baris].length();
			}
		}

		// Loop for print patter horizonaly
		for (baris = 0; baris < panjang; baris++)
		{	
			// Loop for print patter verticaly
			for (kolom = 0; kolom < banyak; kolom++)
			{
				// Condition when baris is less than length of string column
				if (baris < string[kolom].length()) {
					
					// Condition when column is equal with banyak min 1
					if (kolom == banyak - 1)
					{
						System.out.print(string[kolom].charAt(baris));
					}

					// Alternate condition
					else{		

						System.out.print(string[kolom].charAt(baris) + " ");
					}		

				// Alternate condition
				}else{

					System.out.print("  ");
				}			
			}

			System.out.println();
		}
	}
}