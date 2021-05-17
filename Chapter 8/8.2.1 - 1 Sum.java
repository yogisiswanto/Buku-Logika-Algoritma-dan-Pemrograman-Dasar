/*
 *  Name Program    : Sum
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
 * 	10
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int berapa_kali, hasil_jumlah, penghitung;

		Scanner sc = new Scanner(System.in);

		// Variable initialization
		hasil_jumlah = 0;

		System.out.println("masukan angka berapa kali akan diulang:");

		// Get input from console. Example = 5
		try{

			berapa_kali = sc.nextInt();

		}catch(Exception e){

		}

		// Loop for calculate sum from input
		for (penghitung = 0; penghitung < berapa_kali; penghitung++)
		{
			hasil_jumlah = hasil_jumlah + penghitung;
		}

		// Print to console
		System.out.println(hasil_jumlah);
	}
}