/*
 *  Name Program    : Repeat Do-While
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	y/n
 * 
 * 	Output
 * 	------
 * 	If y, it will continuou. If n, it will terminate
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration
		char jawaban;

		// Getting input from console first, and then check
		Scanner sc = new Scanner(System.in);

		do{
		
			System.out.println("Halo dunia!");

			System.out.println("Apakah anda ingin menampilkan lagi?");

			try{

				jawaban = sc.next().charAt(0);

			}catch(Exception e){

			}

		} while (jawaban == 'y');
	}
}