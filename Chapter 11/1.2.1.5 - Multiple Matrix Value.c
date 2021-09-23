/*
 *  Name Program    : Multiple Matrix Value
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
 *  7
 *  10
 *  15
 *  22  
 */

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int row, column, incrementRow, incrementColumn, increment;

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

    // Multiple matrixs value
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){

            thirdMatrix[incrementRow][incrementColumn] = 0;

            for (increment = 0; increment < column; increment++)
            {
                
                thirdMatrix[incrementRow][incrementColumn] = thirdMatrix[incrementRow][incrementColumn] + (firstMatrix[incrementRow][increment] * secondMatrix[increment][incrementColumn]);
            
            }

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