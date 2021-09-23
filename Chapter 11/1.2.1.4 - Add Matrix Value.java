/*
 *  Name Program    : Add firstMatrix Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th September 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 *  2
 *  2
 *  1
 *  2
 *  3
 *  4
 *  1
 *  2
 *  3
 *  4
 * 
 * 	Output
 * 	------
 *  2
 *  4
 *  6
 *  8 
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
        int firstMatrix[][] = new int[row][column];
        int secondMatrix[][] = new int[row][column];
        int thirdMatrix[][] = new int[row][column];

        // Fill first matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                try{

                    firstMatrix[incrementRow][incrementColumn] = sc.nextInt();

                }catch(Exception e){
        
                }
            }
            
        }

        // Fill second matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                try{

                    secondMatrix[incrementRow][incrementColumn] = sc.nextInt();

                }catch(Exception e){
        
                }
            }
            
        }

        // Add matrix value
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                thirdMatrix[incrementRow][incrementColumn] = firstMatrix[incrementRow][incrementColumn] + secondMatrix[incrementRow][incrementColumn];
            }
            
        }

        // Print matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                System.out.println(thirdMatrix[incrementRow][incrementColumn]);
            }
            
        }
	}
}