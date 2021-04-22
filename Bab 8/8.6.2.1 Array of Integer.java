/*
 *  Name Program    : Array of Integer
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int banyak = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan banyaknya angka:");

		// Get input from console
		try{

			banyak = sc.nextInt();

		}catch(Exception e){

		}

		// Variable declaration
		int [] arrayInteger = new int[banyak];
		int penghitung = 0;

		// Loop for getting input from console
		for (penghitung = 0; penghitung < banyak; penghitung++)
		{
			System.out.println("Masukan angka:\n");

			try{

				arrayInteger[penghitung] = sc.nextInt();

			}catch(Exception e){

			}

			System.out.println();
		}

		// Loop for print value from array of integer
		for (penghitung = 0; penghitung < banyak; penghitung++)
		{
			
			System.out.println(arrayInteger[penghitung]);
		}

	}
}