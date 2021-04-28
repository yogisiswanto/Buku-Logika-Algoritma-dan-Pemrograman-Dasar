/*
 *  Name Program    : Pola Segitiga Bintang
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 28th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int baris, kolom, bintang = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan banyaknya bintang:");

		// Get input from console
		try{

			bintang = sc.nextInt();

		}catch(Exception e){

		}

		// Loop for star print for top part
		for (baris = 0; baris < (bintang / 2); baris++)
		{
			
			for (kolom = 0; kolom < baris; kolom++)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

		// Loop for star print for middle part
		if (bintang % 2 == 1)
		{
			
			for (kolom = 0; kolom < (bintang / 2); kolom++)
			{
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}

			System.out.println();
		}

		// Loop for star print for bottom part
		for (baris = 0; baris < (bintang / 2); baris++)
		{
			
			for (kolom = ((bintang / 2) - baris); kolom > 1; kolom--)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}
}