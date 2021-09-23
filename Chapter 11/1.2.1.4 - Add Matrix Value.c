/*
 *  Name Program    : Add Matrix Value
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

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int row, column, incrementRow, incrementColumn;

    // Get input from console
    scanf("%d", &row);
    scanf("%d", &column);

    // Variable declaration
    int firstMatrix[row][column];
    int secondMatrix[row][column];
    int thirdMatrix[row][column];

    // Fill first matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            scanf("%d", &firstMatrix[incrementRow][incrementColumn]);
        }
        
    }

    // Fill second matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            scanf("%d", &secondMatrix[incrementRow][incrementColumn]);
        }
        
    }

    // Add matrixs value
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            thirdMatrix[incrementRow][incrementColumn] = firstMatrix[incrementRow][incrementColumn] + secondMatrix[incrementRow][incrementColumn];
        }
        
    }

    // Print matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            printf("%d\n", thirdMatrix[incrementRow][incrementColumn]);
        }
        
    }
    

    return 0;
}