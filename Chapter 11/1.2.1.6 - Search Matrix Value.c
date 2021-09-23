/*
 *  Name Program    : Search Matrix Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th September 2021
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

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int row, column, incrementRow, incrementColumn, searchNumber, isFind;

    // Get input from consoleincrementColumn
    scanf("%d", &row);
    scanf("%d", &column);

    // Variable declaration
    int matrix[row][column];

    // Fill first matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            scanf("%d", &matrix[incrementRow][incrementColumn]);
        }
        
    }

    // Get search number
    scanf("%d", &searchNumber);

    // Variable inisialization
    isFind = 0;
    incrementRow = 0;
    
    // Looping for row
    while ((isFind == 0) && (incrementRow < row)){

        // Variable reinisialization
        incrementColumn = 0;

        // Looping for column
        while ((isFind == 0) && (incrementColumn < column)){
            
            // Condition when matrix value is equal with searchNumber
            if (matrix[incrementRow][incrementColumn] == searchNumber){
                
                isFind = 1;
            }

            // Condition when matrix value is not equal with searchNumber
            else {
                
                incrementColumn++;

            }            
            
        }

        incrementRow++;        
    }

    // Condition when isFind is equal with 1
    if (isFind == 1) {
        
        printf("Bilangan yang dicari ada di dalam matriks\n");
    
    }
    
    // Condition when isFind is not equal with 1
    else {
    
        printf("Bilangan yang dicari tidak ada di dalam matriks\n");
    
    }    

    return 0;
}