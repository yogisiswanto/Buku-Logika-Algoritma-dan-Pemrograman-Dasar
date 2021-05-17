/*
 *  Name Program    : String to Float
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 9th May 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	2.3
 *  4.5
 *  6.9
 * 
 * 	Output
 * 	------
 * 	12.7
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		String string = "";
		int banyak, baris, kolom, before;
		float jumlah, temp, total;

		Scanner sc = new Scanner(System.in);

		// Variable inisialization
		banyak = 0;
		total = 0;

		// Get input from console
		try{

			banyak = sc.nextInt();

		}catch(Exception e){
		}

		// Convert string to float
		for (baris = 0; baris < banyak; baris++) {

			try{

				string = sc.next();

			}catch(Exception e){
			}

			before = 0;
			jumlah = 0;
			kolom = 0;

			// Convert character before dot
			while((string.charAt(kolom) != '.') && (kolom < string.length())){

				if (string.charAt(kolom) == '1')
				{
					temp = 1;
				}

				else if (string.charAt(kolom) == '2')
				{
					temp = 2;
				}

				else if (string.charAt(kolom) == '3')
				{
					temp = 3;
				}

				else if (string.charAt(kolom) == '4')
				{
					temp = 4;
				}

				else if (string.charAt(kolom) == '5')
				{
					temp = 5;
				}

				else if (string.charAt(kolom) == '6')
				{
					temp = 6;
				}

				else if (string.charAt(kolom) == '7')
				{
					temp = 7;
				}

				else if (string.charAt(kolom) == '8')
				{
					temp = 8;
				}

				else if (string.charAt(kolom) == '9')
				{
					temp = 9;
				}

				else{
					temp = 0;
				}

				if (kolom == 1)
				{
					temp = temp * 10;
				}

				else if (kolom == 2)
				{
					temp = temp * 100;
				}

				jumlah = jumlah + temp;

				before++;
				kolom++;
			}

			temp = 0;

			// Convert character after dot
			for (kolom = before + 1; kolom < string.length(); kolom++)
			{
				
				if (string.charAt(kolom) == '1')
				{
					temp = 1;
				}

				else if (string.charAt(kolom) == '2')
				{
					temp = 2;
				}

				else if (string.charAt(kolom) == '3')
				{
					temp = 3;
				}

				else if (string.charAt(kolom) == '4')
				{
					temp = 4;
				}

				else if (string.charAt(kolom) == '5')
				{
					temp = 5;
				}

				else if (string.charAt(kolom) == '6')
				{
					temp = 6;
				}

				else if (string.charAt(kolom) == '7')
				{
					temp = 7;
				}

				else if (string.charAt(kolom) == '8')
				{
					temp = 8;
				}

				else if (string.charAt(kolom) == '9')
				{
					temp = 9;
				}

				else{
					temp = 0;
				}

				if (kolom == before + 1)
				{
					temp = temp / 10;
				}

				else if (kolom == before + 2)
				{
					temp = temp / 100;
				}

				jumlah = jumlah + temp;

			}

			total = total + jumlah;
		}

		// Print to console
		System.out.println(total);
	}
}