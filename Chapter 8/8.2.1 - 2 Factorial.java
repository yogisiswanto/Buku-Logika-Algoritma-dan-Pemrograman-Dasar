/*
 *  Name Program    : Factorial
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	120
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int fak_berapa, penghitung, hasil_faktorial;

		Scanner sc = new Scanner(System.in);

		// Variable initialization
		hasil_faktorial = 1;

		System.out.println("Masukan angka faktorial yang akan dihitung:");

		// Get input from console. Example = 5
		try{

			fak_berapa = sc.nextInt();

		}catch(Exception e){

		}

		// Loop for calculate factorial from input
		for (penghitung = 2; penghitung <= fak_berapa; penghitung++)
		{
			hasil_faktorial = hasil_faktorial * penghitung;
		}

		// Print to console
		System.out.println(hasil_faktorial);
	}
}