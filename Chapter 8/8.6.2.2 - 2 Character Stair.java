/*
 *  Name Program    : Character Stair
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : Java Language
 * 
 *  Input
 *  -----
 *  akuadalah
 * 
 *  Output
 *  ------
 *  a
 *   k
 *    u
 *     a
 *      d
 *       a
 *        l
 *         a
 *          h
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		String string = "";
		int baris = 0, kolom = 0, spasi = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan angka:\n");

		// Get input from console
		try{

			string = sc.next();

		}catch(Exception e){

		}

		// Loop for print character like stair
		for (baris = 0; baris < string.length(); baris++)
		{
			for (kolom = 0; kolom < spasi; kolom++)
			{
				System.out.print();
			}

			System.out.println(string[baris]);

			spasi++;
		}
	}
}