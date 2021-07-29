/*
 *  Name Program    : Star X Pattern
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 28th April 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	*****    *****
 *   *****  *****
 *    **********
 *   *****  *****
 *  *****    *****
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
		int baris, kolom, bintang = 0, batas, bagianBawah;
		
		// Variable instantiation
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukan banyaknya bintang:");

		// Get input from console
		try{

			bintang = sc.nextInt();

		}catch(Exception e){

		}

		// Condition when input is even
		if (bintang % 2 == 0)
		{
			bagianBawah = bintang / 2;
			batas = bintang - 2;
		
		// Condition when input is odd
		}else{

			bagianBawah = (bintang / 2) + 1;
			batas = bintang - 1;
		}

		// Loop for star print for top part
		/* 
		 * 	*****    *****
		 *   *****  *****
		 *    **********
		 */
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

			for (kolom = 0; kolom < (batas - (baris * 2)); kolom++)
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
		/* 
		 *   *****  *****
		 *  *****    *****
		 */
		for (baris = 0; baris < bagianBawah; baris++)
		{
			
			for (kolom = bagianBawah - baris; kolom > 1; kolom--)
			{
				
				System.out.print(" ");
			}

			for (kolom = 0; kolom < bintang; kolom++)
			{
				
				System.out.print("*");
			}

			for (kolom = 0; kolom < (baris * 2); kolom++)
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