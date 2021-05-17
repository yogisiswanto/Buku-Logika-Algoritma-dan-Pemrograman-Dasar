/*
 *  Name Program    : Hypotenuse
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 9th May 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	3
 *  4
 * 
 * 	Output
 * 	------
 * 	5
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {

		// Variable declaration
		int x = 0, y = 0;
		
		Triangle segitiga = new Triangle();

		Scanner sc = new Scanner(System.in);

		// Get input from console
		try{

			x = sc.nextInt();
			y = sc.nextInt();

		}catch(Exception e){

		}

		// Set input
		segitiga.setX(x);
		segitiga.setY(y);

		// Print to console
		System.out.println(segitiga.getR());

	}
}