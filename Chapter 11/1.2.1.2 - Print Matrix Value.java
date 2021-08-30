/*
 *  Name Program    : Print Matrix Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 30th August 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 *  2
 *  2
 *  1
 *  2
 *  3
 *  4
 * 
 * 	Output
 * 	------
 *  1
 *  2
 *  3
 *  4 
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
        int row = 0, column = 0, incrementRow = 0, incrementColumn = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

        // Get input from console
        try{

            row = sc.nextInt();
            column = sc.nextInt();

        }catch(Exception e){

        }

        // Variable declaration & inisialization
        int matrix[][] = new int[row][column];

        // Fill matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                try{

                    matrix[incrementRow][incrementColumn] = sc.nextInt();

                }catch(Exception e){
        
                }
            }
            
        }

        // Print matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                System.out.println(matrix[incrementRow][incrementColumn]);
            }
            
        }
	}
}