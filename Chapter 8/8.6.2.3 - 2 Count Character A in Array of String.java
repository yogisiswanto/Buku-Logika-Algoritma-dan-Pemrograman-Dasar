/*
 *  Name Program    : Count Character A in Array of String
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : Java Language
 * 
 *  Input
 *  -----
 *  aku
 *  adalah
 *  anak
 *  gemabal
 *  selalu
 *  riang
 *  serta
 *  gembira
 *  karena
 *  aku
 * 
 *  Output
 *  ------
 *  15
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		String[] string = new String[10];
		int penghitung = 0, huruf = 0, jumlah = 0;

		Scanner sc = new Scanner(System.in);

		// Loop getting input from console
		for (penghitung = 0; penghitung < 10; penghitung++) {

			System.out.println("Masukan angka:\n");

			try{

				string[penghitung] = sc.next();

			}catch(Exception e){

			}
		}

		// Loop for counting a character in array of string
		for (penghitung = 0; penghitung < 10; penghitung++)
		{
			for (huruf = 0; huruf < string[penghitung].length(); huruf++)
			{
				if ((string[penghitung].chartAt(huruf) == 'A') || (string[penghitung].chartAt(huruf) == 'a'))
				{
					jumlah++;
				}
			}
		}

		// Print to console
		System.out.println(jumlah);
	}
}