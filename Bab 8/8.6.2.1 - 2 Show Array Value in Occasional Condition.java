/*
 *  Name Program    : Show Array Value in Occasional Condition
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
		int [] arrayInteger = new int[5];
		int penghitung = 0;

		Scanner sc = new Scanner(System.in);

		// Loop for getting input from console
		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			System.out.println("Masukan angka:\n");

			try{

				arrayInteger[penghitung] = sc.nextInt();

			}catch(Exception e){

			}

			System.out.println();
		}
		
		// Loop for print to console while the value from array is occasional condition
		while((arrayInteger[penghitung] != 999) && (penghitung < 5)){

			System.out.println(arrayInteger[penghitung]);

			penghitung++;
		}

	}
}