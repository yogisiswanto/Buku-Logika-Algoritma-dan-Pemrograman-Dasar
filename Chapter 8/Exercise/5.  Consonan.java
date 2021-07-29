/*
 *  Name Program    : Consonan
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	6
 *  s
 *  t
 *  r
 *  i
 *  n
 *  g
 * 
 * 	Output
 * 	------
 * 	s
 *  t
 *  r
 *  n
 *  g
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		char[] character = new char[10];
		int banyak, baris;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

		// Variable inisialization
		banyak = 0;
		baris = 0;

		// Get input from console
		try{

			banyak = sc.nextInt();

		}catch(Exception e){

		}

		for (baris = 0; baris < banyak; baris++) {

			try{

				character[baris] = sc.next().charAt(0);

			}catch(Exception e){

			}
		}

		// Looping for checking character
		for (baris = 0; baris < banyak; baris++)
		{
			// Condition when character is not equal with vocal
			if ((character[baris] != 'A') && (character[baris] != 'a') &&
				(character[baris] != 'I') && (character[baris] != 'i') &&
				(character[baris] != 'U') && (character[baris] != 'u') &&
				(character[baris] != 'E') && (character[baris] != 'e') &&
				(character[baris] != 'O') && (character[baris] != 'o'))
			{
				System.out.println(character[baris]);
			}
		}
	}
}