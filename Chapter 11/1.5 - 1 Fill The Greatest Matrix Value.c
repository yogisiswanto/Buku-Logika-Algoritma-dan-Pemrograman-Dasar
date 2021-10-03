/*
 *  Name Program    : Fill The Greatest Matrix Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 1st Oktober 2021
 *  Language        : C Language
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

#include <stdio.h>

// Main function
int main(){

    // Variable declaration & inisialization
    int row, column, incrementRow, incrementColumn, limit, emptyMatrixCounter = 0;

    // Get input from console
    scanf("%d", &limit);
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
    printf("%d\n", emptyMatrixCounter);

    // Print matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            printf("%d", thirdMatrix[incrementRow][incrementColumn]);

            // Condition when current column index is not equal with column - 1 
            if (incrementColumn != (column - 1)) {
                
                printf(" ");
            }
            
        }

        printf("\n");
        
    }
    

    return 0;
}