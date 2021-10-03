/*
 *  Name Program    : Fill The Greatest Matrix Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 1st Oktober 2021
 *  Language        : Java Language
 * 
 * 	Input
 * 	-----
 *  10
 *  2 2
 *  11
 *  7
 *  13
 *  9
 *  1
 *  18
 *  32
 *  2
 * 
 * 	Output
 * 	------
 *  1
 *  11 18
 *  32 0
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
        int row = 0, column = 0, incrementRow = 0, incrementColumn = 0, limit = 0, emptyMatrixCounter = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

        // Get input from console
        try{
            
            limit = sc.nextInt();
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

        // Multiple matrix value
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){

                // Condition when firstMatrix is greater than secondMatrix and firstMatrix is greater than limit
                if ((firstMatrix[incrementRow][incrementColumn] > secondMatrix[incrementRow][incrementColumn]) && (firstMatrix[incrementRow][incrementColumn] > limit)) {
                    
                    thirdMatrix[incrementRow][incrementColumn] = firstMatrix[incrementRow][incrementColumn];
                }

                // Condition when firstMatrix is less than secondMatrix and secondMatrix is greater than limit
                else if ((firstMatrix[incrementRow][incrementColumn] < secondMatrix[incrementRow][incrementColumn]) && (secondMatrix[incrementRow][incrementColumn] > limit)) {
                    
                    thirdMatrix[incrementRow][incrementColumn] = secondMatrix[incrementRow][incrementColumn];
                }

                // Alternate condition
                else {
                    
                    emptyMatrixCounter++;
                    thirdMatrix[incrementRow][incrementColumn] = 0;
                }
                
            }
            
        }

        // Print empty matrix counter
        System.out.println(emptyMatrixCounter);

        // Print matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                System.out.print(thirdMatrix[incrementRow][incrementColumn]);

                // Condition when current column index is not equal with column - 1 
                if (incrementColumn != (column - 1)) {
                    
                    System.out.print(" ");
                }
            }

            System.out.println();            
        }
	}
}