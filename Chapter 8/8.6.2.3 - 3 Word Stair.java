/*
 *  Name Program    : Stair Word with Struct
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 28th April 2021
 *  Language        : Java Language
 * 
 *  Input
 *  -----
 *  aku
 *  adalah
 *  anak
 *  gemabal
 *  selalu
 *  riang
 *  serta
 *  gembira
 *  karena
 *  aku
 * 
 *  Output
 *  ------
 *  aku
 *     adalah
 *           anak
 *               gembala
 *                      selalu
 *                            riang 
 *                                 serta
 *                                      gembira
 *                                             karena
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
		String[] string = new String[10];
		int baris = 0, kolom = 0, spasi = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

		// Loop getting input from console
		for (baris = 0; baris < 9; baris++) {

			System.out.println("Masukan angka:");

			try{

				string[baris] = sc.next();

			}catch(Exception e){

			}
		}

		// Loop for string print look like stair
		for (baris = 0; baris < 9; baris++)
		{
			for (kolom = 0; kolom < spasi; kolom++)
			{
				System.out.print(" ");
			}

			System.out.println(string[baris]);

			spasi = spasi + string[baris].length();
		}
	}
}