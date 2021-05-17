/*
 *  Name Program    : Count Down
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 * 	-
 * 
 * 	Output
 * 	------
 * 	10
 * 	9
 * 	8
 * 	7
 * 	6
 * 	5
 * 	4
 * 	3
 * 	2
 * 	1
 */

public class  Main{

	// Main function
	public static void main(String[] args) {

		// Variable declaration
		int increment;

		// Loop for print down to
		for (increment = 10; increment >= 1; increment--) {
		
			System.out.println(increment);
		}		

	}

}