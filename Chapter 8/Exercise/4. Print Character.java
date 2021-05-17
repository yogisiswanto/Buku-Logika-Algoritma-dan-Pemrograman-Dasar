/*
 *  Name Program    : Print Character
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
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
		int banyak, baris, kolom;

		Scanner sc = new Scanner(System.in);

		banyak = 0;
		baris = 0;
		kolom = 0;

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
		}

		// Looping for checking string
		for (baris = 0; baris < banyak; baris++)
		{

			// Condition when string has prefix A or a. From anilsa into aslina
			if ((string[baris].charAt(0) == 'A') || (string[baris].charAt(0) == 'a'))
			{
				
				for (kolom = string[baris].length() - 1; kolom >= 0; kolom--)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				System.out.println();
			
			}

			// Condition when string has prefix I or i. From igoy into gioy
			else if ((string[baris].charAt(0) == 'I') || (string[baris].charAt(0) == 'i'))
			{
				int length = 0;
				int start = 0;
				int middle = 0;

				length = string[baris].length();

				if (length % 2 == 0)
				{
					start = (length / 2) - 1;
					middle = length / 2;
				}

				else{
					start = length / 2;
					middle = (length / 2) + 1;
				}

				for (kolom = start; kolom >= 0; kolom--)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				for (kolom = middle; kolom < length; kolom++)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				System.out.println();
			}

			// Condition when string has prefix U or u. From ulfa into aflu
			else if ((string[baris].charAt(0) == 'U') || (string[baris].charAt(0) == 'u'))
			{
				for (kolom = string[baris].length() - 1; kolom >= 0; kolom--)
				{
					System.out.print(string[baris].charAt(kolom));
				}

				System.out.println();
			}

			// Alternate condition
			else{
				
				System.out.println(string[baris]);
			}	
		}
	}
}