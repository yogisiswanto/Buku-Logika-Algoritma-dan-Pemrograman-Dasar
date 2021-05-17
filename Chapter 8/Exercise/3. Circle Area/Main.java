/*
 *  Name Program    : Circle
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 9th May 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	78.50
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {

		// Variable declaration	
		int r = 0;
		
		Circle circle = new Circle();

		Scanner sc = new Scanner(System.in);

		// Get input from console
		try{

			r = sc.nextInt();

		}catch(Exception e){

		}

		// Set r
		circle.setR(r);

		// Print to console
		System.out.println(circle.getArea());

	}
}