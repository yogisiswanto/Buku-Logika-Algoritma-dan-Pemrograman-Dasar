/*
 *  Name Program    : Rotate Matrix
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th Oktober 2021
 *  Language        : Java Language
 * 
 * 	Input 1
 * 	-----
 *  3 2
 *  2 2
 *  3 3
 *  1 1
 *  -999
 *  2 2
 *  2 2
 *  4 4
 *  -999
 *  2 3
 *  1 1 1
 *  2 2 2
 * 
 * 	Output 1
 * 	------
 *  2 2
 *  3 3
 *  1 1
 *  4 4
 *  2 2
 *  1 1 1
 *  2 2 2
 * 
 * 	Input 2
 * 	-----
 *  3 2
 *  2 2
 *  3 3
 *  1 1
 *  -999
 *  2 2
 *  2 2
 *  5 5
 *  -999
 *  2 3
 *  1 1 1
 *  2 2 2
 * 
 * 	Output 2
 * 	------
 *  2 3 1
 *  2 3 1
 *  2 2
 *  5 5
 *  1 1 1
 *  2 2 2
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
        // Variable declaration
        int firstMatrixRow, firstMatrixColumn, secondMatrixRow, secondMatrixColumn, thirdMatrixRow, thirdMatrixColumn, incrementRow, incrementColumn, divider, maximumValueInFirstMatrix, maximumValueInSecondMatrix, maximumValueInThirdMatrix, maximumValueFromAllMatrix, temp;

		// Variable inisialization
        firstMatrixRow = 0;
        firstMatrixColumn = 0;
        secondMatrixRow = 0;
        secondMatrixColumn = 0;
        thirdMatrixRow = 0;
        thirdMatrixColumn = 0;
        incrementRow = 0;
        incrementColumn = 0;
        divider = 0;
        maximumValueInFirstMatrix = 0;
        maximumValueInSecondMatrix = 0;
        maximumValueInThirdMatrix = 0;
        maximumValueFromAllMatrix = 0;
        temp = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

        // Get input row and column for first matrix
        try{
            
            firstMatrixRow = sc.nextInt();
            firstMatrixColumn = sc.nextInt();

        }catch(Exception e){

        }

        // Variable declaration & inisialization
        int firstMatrix[][] = new int[firstMatrixRow][firstMatrixColumn];

        // Fill first matrix
        for (incrementRow = 0; incrementRow < firstMatrixRow; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < firstMatrixColumn; incrementColumn++){
                
                try{

                    firstMatrix[incrementRow][incrementColumn] = sc.nextInt();

                }catch(Exception e){
        
                }

                // Condition when current value is greater than maximum initialization value
                if(firstMatrix[incrementRow][incrementColumn] > maximumValueInFirstMatrix){

                    maximumValueInFirstMatrix = firstMatrix[incrementRow][incrementColumn];
                }
            }
            
        }

        // Get input divider, row and column second matrix
        try{
            
            divider = sc.nextInt();
            secondMatrixRow = sc.nextInt();
            secondMatrixColumn = sc.nextInt();

        }catch(Exception e){

        }

        // Variable declaration & inisialization
        int secondMatrix[][] = new int[secondMatrixRow][secondMatrixColumn];

        // Fill second matrix
        for (incrementRow = 0; incrementRow < secondMatrixRow; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < secondMatrixColumn; incrementColumn++){
                
                try{

                    secondMatrix[incrementRow][incrementColumn] = sc.nextInt();

                }catch(Exception e){
        
                }

                // Condition when current value is greater than maximum initialization value
                if(secondMatrix[incrementRow][incrementColumn] > maximumValueInFirstMatrix){

                    maximumValueInSecondMatrix = secondMatrix[incrementRow][incrementColumn];
                }
            }
            
        }

        // Get input divider, row and column third matrix
        try{
            
            divider = sc.nextInt();
            thirdMatrixRow = sc.nextInt();
            thirdMatrixColumn = sc.nextInt();

        }catch(Exception e){

        }

        // Variable declaration & inisialization
        int thirdMatrix[][] = new int[thirdMatrixRow][thirdMatrixColumn];

        // Multiple matrix value
        for (incrementRow = 0; incrementRow < thirdMatrixRow; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < thirdMatrixColumn; incrementColumn++){

                try{

                    thirdMatrix[incrementRow][incrementColumn] = sc.nextInt();

                }catch(Exception e){
        
                }

                // Condition when current value is greater than maximum initialization value
                if(thirdMatrix[incrementRow][incrementColumn] > maximumValueInFirstMatrix){

                    maximumValueInThirdMatrix = thirdMatrix[incrementRow][incrementColumn];
                }
                
            }
            
        }

        // Condition when maximum value in first matrix is greater than maximum value in second matrix and maximum value in first matrix is greater than third matrix
        if ((maximumValueInFirstMatrix > maximumValueInSecondMatrix) && (maximumValueInFirstMatrix > maximumValueInThirdMatrix)){

            maximumValueFromAllMatrix = maximumValueInFirstMatrix; 
        }

        // Condition when maximum value in second matrix is greater than maximum value in first matrix and maximum value in second matrix is greater than third matrix
        else if ((maximumValueInSecondMatrix > maximumValueInFirstMatrix) && (maximumValueInSecondMatrix > maximumValueInThirdMatrix)){

            maximumValueFromAllMatrix = maximumValueInSecondMatrix;
        }

        // Another condition
        else{

            maximumValueFromAllMatrix = maximumValueInSecondMatrix;
        }

        // Condition when maximum value from all matrix is odd
        if (maximumValueFromAllMatrix % 2 == 1){

            // Condition when first matrix row is less than first matrix column
            if (firstMatrixRow > firstMatrixColumn){

                temp = firstMatrixRow;
                firstMatrixRow = firstMatrixColumn;
                firstMatrixColumn = temp;
            }

            // Print first matrix
            for (incrementRow = (firstMatrixRow - 1); incrementRow >= 0; incrementRow--){
                
                for (incrementColumn = 0; incrementColumn < firstMatrixColumn; incrementColumn++){
                    
                    System.out.print(firstMatrix[incrementColumn][incrementRow]);

                    // Condition when current column index is not equal with first matrix column - 1 
                    if (incrementColumn != (firstMatrixColumn - 1)) {
                        
                        System.out.print(" ");
                    }
                }        

                System.out.println();
            }

            // Print second matrix
            for (incrementRow = 0; incrementRow < secondMatrixRow; incrementRow++){
                
                for (incrementColumn = 0; incrementColumn < secondMatrixColumn; incrementColumn++){
                    
                    System.out.print(secondMatrix[incrementRow][incrementColumn]);

                    // Condition when current column index is not equal with second matrix column - 1 
                    if (incrementColumn != (secondMatrixColumn - 1)) {
                        
                        System.out.print(" ");
                    }
                }    

                System.out.println();        
            }
        }

        // Condition when maximum value from all matrix is even
        else {

            // Print first matrix
            for (incrementRow = 0; incrementRow < firstMatrixRow; incrementRow++){
                
                for (incrementColumn = 0; incrementColumn < firstMatrixColumn; incrementColumn++){
                    
                    System.out.print(firstMatrix[incrementRow][incrementColumn]);

                    // Condition when current column index is not equal with first matrix column - 1 
                    if (incrementColumn != (firstMatrixColumn - 1)) {
                        
                        System.out.print(" ");
                    }
                }        

                System.out.println();
            }

            // Print second matrix
            for (incrementRow = (secondMatrixRow - 1); incrementRow >= 0 ; incrementRow--){
                
                for (incrementColumn = 0; incrementColumn < secondMatrixColumn; incrementColumn++){
                    
                    System.out.print(secondMatrix[incrementRow][incrementColumn]);

                    // Condition when current column index is not equal with second matrix column - 1 
                    if (incrementColumn != (secondMatrixColumn - 1 )) {
                        
                        System.out.print(" ");
                    }
                }    

                System.out.println();        
            }

        }


        // Print third matrix
        for (incrementRow = 0; incrementRow < thirdMatrixRow; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < thirdMatrixColumn; incrementColumn++){
                
                System.out.print(thirdMatrix[incrementRow][incrementColumn]);
                
                // Condition when current column index is not equal with first matrix column - 1 
                if (incrementColumn != (thirdMatrixColumn - 1)) {
                    
                    System.out.print(" ");
                }
            }     

            System.out.println();
        }
	}
}