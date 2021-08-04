/*
 *  Name Program    : Stair Word with Struct
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : Java Language
 * 
 *  Input
 *  -----
 *  aku
 *  adalah
 *  anak
 *  gemabala
 *  selalu
 *  riang
 *  serta
 *  gembira
 *  karena
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
		int increment = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);
		Pattern pattern = new Pattern();

		// Loop getting input from console
		for (increment = 0; increment < 9; increment++) {

			System.out.println("Masukan angka:");

			try{

				string[increment] = sc.next();

			}catch(Exception e){

			}
		}

		// Print word like stair
		pattern.wordStair(string);
	}
}

// Pattern class
class Pattern{

    // Constructor
    Pattern(){

    }

    // Method for print word like stair
    public static void wordStair(String[] string){

        // Variable declaration
        int incrementRow, incrementColumn, space;

		// Variable inisialization
		space = 0;
		
		// Loop for string print look like stair
		for (incrementRow = 0; incrementRow < 9; incrementRow++)
		{
			for (incrementColumn = 0; incrementColumn < space; incrementColumn++)
			{
				System.out.print(" ");
			}

			System.out.println(string[incrementRow]);

			space = space + string[incrementRow].length();
		}
    }
}