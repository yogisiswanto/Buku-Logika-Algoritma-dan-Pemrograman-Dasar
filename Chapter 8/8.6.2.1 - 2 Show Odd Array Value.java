/*
 *  Name Program    : Show Odd Array Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : Java Language
 * 
 *  Input
 *  -----
 *  1
 *  2
 *  3
 *  4
 *  5
 * 
 *  Output
 *  ------
 *  1
 *  3
 *  5
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
		int [] arrayInteger = new int[5];
		int penghitung = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

		// Loop for getting input from console
		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			System.out.println("Masukan angka:\n");

			try{

				arrayInteger[penghitung] = sc.nextInt();

			}catch(Exception e){

			}
		}
		
		// Loop for print to console the odd value from array of integer
		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			if (arrayInteger[penghitung] % 2 == 1)
			{
				System.out.println(arrayInteger[penghitung]);
			}			
		}

	}
}