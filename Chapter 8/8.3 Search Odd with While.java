/*
 *  Name Program    : Search Odd with While
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	1
 *  2
 *  3
 * 	4
 *  5
 * 
 * 	Output
 * 	------
 * 	ada angka ganjil
 * 
 * 
 *  Input 2
 * 	-----
 * 	2
 *  2
 *  2
 * 	2
 *  2
 * 
 * 	Output 2
 * 	------
 * 	tidak ada angka ganjil
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		int penghitung;
		int[] arrayInteger = new int[5];
		boolean ketemu = false;

		Scanner sc = new Scanner(System.in);

		// Loop for getting input from console
		for (penghitung = 0; penghitung < 5; penghitung++)
		{
			System.out.println("Masukan angka:");

			try{

				arrayInteger[penghitung] = sc.nextInt();

			}catch(Exception e){

			}
		}

		// Variable inisialization
		penghitung = 0;

		// Loop for finding odd value in array of integer
		while((ketemu == false) && (penghitung < 5)){

			if (arrayInteger[penghitung] % 2 == 1)
			{
			
				ketemu = true;
			
			}else{

				penghitung = penghitung + 1;
			}
		}

		// Condition when there is an odd value in array of integer
		if (ketemu == false)
		{
			
			System.out.println("tidak ada angka ganjil");
		
		// Alternate condition
		}else{

			System.out.println("ada angka ganjil");
		}
	}
}