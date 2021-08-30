/*
 *  Name Program    : Fill Matrix Value
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

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int row, column, incrementRow, incrementColumn;

    // Get input from console
    scanf("%d", &row);
    scanf("%d", &column);

    // Variable declaration
    int matrix[row][column];

    // Fill matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            scanf("%d", &matrix[incrementRow][incrementColumn]);
        }
        
    }

    // Print matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            printf("%d\n", matrix[incrementRow][incrementColumn]);
        }
        
    }
    

    return 0;
}