/*
 *  Name Program    : Pola Bintang Satu Baris
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
		int penghitung, bintang;

		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan banyaknya bintang:");

		// Get input from console
		try{

			bintang = sc.nextInt();

		}catch(Exception e){

		}

		// Loop for print to console the start pattern
		for (penghitung = 0; penghitung < bintang; penghitung++)
		{
			
			System.out.println("*");
		}
	}
}