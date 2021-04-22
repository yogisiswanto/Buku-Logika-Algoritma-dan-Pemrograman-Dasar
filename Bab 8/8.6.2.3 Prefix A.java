/*
 *  Name Program    : Prefix A
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
		String[] string = new String[10];
		int penghitung = 0;

		Scanner sc = new Scanner(System.in);

		// Loop getting input from console
		for (penghitung = 0; penghitung < 10; penghitung++) {

			System.out.println("Masukan angka:\n");

			try{

				string[penghitung] = sc.next();

			}catch(Exception e){

			}
		}

		// Loop for string print which have a prefix a in array of string
		for (penghitung = 0; penghitung < 10; penghitung++)
		{
			
			if ((string[penghitung].chartAt(0) == 'A') || (string[penghitung].chartAt(0) == 'a'))
			{
				System.out.println(string[penghitung]);
			}

		}
	}
}