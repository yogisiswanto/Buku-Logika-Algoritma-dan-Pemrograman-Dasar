/*
 *  Name Program    : Count Vocal Character in String
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
 *  5
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
		String string = "";
		int penghitung = 0;
		int jumlah = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan angka:\n");
		
		// Get input from console
		try{

			string = sc.next();

		}catch(Exception e){

		}

		// Varibale inisialization
		jumlah = 0;

		// Loop for countung vocal character in a string
		for (penghitung = 0; penghitung < string.length(); penghitung++)
		{
			if ((string.chartAt(penghitung) == 'a') || (string.chartAt(penghitung) == 'i') || (string.chartAt(penghitung) == 'u') || (string.chartAt(penghitung) == 'e') || (string.chartAt(penghitung) == 'o'))
			{
				jumlah++;
			}
		}

		// Print to console
		System.out.println(jumlah);
	}
}