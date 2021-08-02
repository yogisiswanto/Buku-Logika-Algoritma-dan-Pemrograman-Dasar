/*
 *  Name Program    : Method in Java with class
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd August 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 * 	-
 * 
 * 	Output
 * 	------
 * 	Program utama prosedur tulis 
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
	    String sentence = "Program utama prosedur tulis";

        // Variable instantiation
        Method method = new Method();

		// Print sentence
        method.write(sentence);
	}
}

// Method class
class Method{

    // Constructor
    Method(){

    }

    // Method for write sentence
    public static void write(String sentence){

        System.out.println(sentence);
    }
}

