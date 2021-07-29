/*
 *  Name Program    : Sum Odd Value in Array
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
 *  9
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
		int [] arrayInteger = new int[5];
		int penghitung = 0;
		int jumlah = 0;

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

		// Variable inisialization
		jumlah = 0;

		// Loop for sum odd value from array of integer
		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			if (arrayInteger[penghitung] % 2 == 1)
			{
				jumlah = jumlah + arrayInteger[penghitung];
			}
		}

		// Print to console
		System.out.println(jumlah);

	}
}