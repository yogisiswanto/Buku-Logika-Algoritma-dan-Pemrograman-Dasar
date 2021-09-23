/*
 *  Name Program    : Search Matrix Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 23th September 2021
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
 *  4
 * 
 * 	Output
 * 	------
 *  Bilangan yang dicari ada di dalam matriks
 * 
 * 	Input
 * 	-----
 *  2
 *  2
 *  1
 *  2
 *  3
 *  4
 *  5
 * 
 * 	Output
 * 	------
 *  Bilangan yang dicari tidak ada di dalam matriks  
 */

import java.util.Scanner;

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
        int row = 0, column = 0, incrementRow = 0, incrementColumn = 0, searchNumber = 0;
        boolean isFind = false;

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

        // Fill first matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                try{

                    matrix[incrementRow][incrementColumn] = sc.nextInt();

                }catch(Exception e){
        
                }
            }
        }

        // Get input from console
        try{

            searchNumber = sc.nextInt();

        }catch(Exception e){

        }

        // Variable reinisialization
        incrementRow = 0;        

        // Looping for row
        while ((isFind == false) && (incrementRow < row)){

            // Variable reinisialization
            incrementColumn = 0;

            // Looping for column
            while ((isFind == false) && (incrementColumn < column)){
             
                // Condition when matrix value is equal with searchNumber
                if (matrix[incrementRow][incrementColumn] == searchNumber){
                    
                    isFind = true;
                }

                // Condition when matrix value is not equal with searchNumber
                else {
                    
                    incrementColumn++;

                }         
            }

            incrementRow++;        
        }

        // Condition when isFind is equal with true
        if (isFind == true) {
            
            System.out.println("Bilangan yang dicari ada di dalam matriks\n");
        
        }
        
        // Condition when isFind is equal with false
        else {
        
            System.out.println("Bilangan yang dicari tidak ada di dalam matriks\n");
        
        }
	}
}