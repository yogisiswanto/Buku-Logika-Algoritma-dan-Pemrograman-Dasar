/*
 *  Name Program    : Rotate Matrix
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th Oktober 2021
 *  Language        : C Language
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

#include <stdio.h>

// Main function
int main(){

    // Variable declaration
    int firstMatrixRow, firstMatrixColumn, secondMatrixRow, secondMatrixColumn, thirdMatrixRow, thirdMatrixColumn, incrementRow, incrementColumn, divider, maximumValueInFirstMatrix, maximumValueInSecondMatrix, maximumValueInThirdMatrix, maximumValueFromAllMatrix, temp;

    // Variable inisialization
    maximumValueInFirstMatrix = 0;
    maximumValueInSecondMatrix = 0;
    maximumValueInThirdMatrix = 0;
    maximumValueFromAllMatrix = 0;

    // Get input row and column for first matrix
    scanf("%d", &firstMatrixRow);
    scanf("%d", &firstMatrixColumn);

    // Variable declaration
    int firstMatrix[firstMatrixRow][firstMatrixColumn];

    // Fill first matrix
    for (incrementRow = 0; incrementRow < firstMatrixRow; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < firstMatrixColumn; incrementColumn++){
            
            scanf("%d", &firstMatrix[incrementRow][incrementColumn]);

            // Condition when current value is greater than maximum initialization value
            if(firstMatrix[incrementRow][incrementColumn] > maximumValueInFirstMatrix){

                maximumValueInFirstMatrix = firstMatrix[incrementRow][incrementColumn];
            }
        }        
    }

    // Get input for divider
    scanf("%d", &divider);

    // Get input row and column for second matrix
    scanf("%d", &secondMatrixRow);
    scanf("%d", &secondMatrixColumn);

    // Variable declaration
    int secondMatrix[secondMatrixRow][secondMatrixColumn];

    // Fill second matrix
    for (incrementRow = 0; incrementRow < secondMatrixRow; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < secondMatrixColumn; incrementColumn++){
            
            scanf("%d", &secondMatrix[incrementRow][incrementColumn]);

            // Condition when current value is greater than maximum initialization value
            if(secondMatrix[incrementRow][incrementColumn] > maximumValueInFirstMatrix){

                maximumValueInSecondMatrix = secondMatrix[incrementRow][incrementColumn];
            }
        }        
    }
    
    // Get input for divider
    scanf("%d", &divider);

    // Get input row and column for second matrix
    scanf("%d", &thirdMatrixRow);
    scanf("%d", &thirdMatrixColumn);

    // Variable declaration
    int thirdMatrix[thirdMatrixRow][thirdMatrixColumn];

    // Fill third matrix
    for (incrementRow = 0; incrementRow < thirdMatrixRow; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < thirdMatrixColumn; incrementColumn++){
            
            scanf("%d", &thirdMatrix[incrementRow][incrementColumn]);

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
                
                printf("%d", firstMatrix[incrementColumn][incrementRow]);

                // Condition when current column index is not equal with first matrix column - 1 
                if (incrementColumn != (firstMatrixColumn - 1)) {
                    
                    printf(" ");
                }
            }        

            printf("\n");
        }

        // Print second matrix
        for (incrementRow = 0; incrementRow < secondMatrixRow; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < secondMatrixColumn; incrementColumn++){
                
                printf("%d", secondMatrix[incrementRow][incrementColumn]);

                // Condition when current column index is not equal with second matrix column - 1 
                if (incrementColumn != (secondMatrixColumn - 1)) {
                    
                    printf(" ");
                }
            }    

            printf("\n");        
        }
    }

    // Condition when maximum value from all matrix is even
    else {

        // Print first matrix
        for (incrementRow = 0; incrementRow < firstMatrixRow; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < firstMatrixColumn; incrementColumn++){
                
                printf("%d", firstMatrix[incrementRow][incrementColumn]);

                // Condition when current column index is not equal with first matrix column - 1 
                if (incrementColumn != (firstMatrixColumn - 1)) {
                    
                    printf(" ");
                }
            }        

            printf("\n");
        }

        // Print second matrix
        for (incrementRow = (secondMatrixRow - 1); incrementRow >= 0 ; incrementRow--){
            
            for (incrementColumn = 0; incrementColumn < secondMatrixColumn; incrementColumn++){
                
                printf("%d", secondMatrix[incrementRow][incrementColumn]);

                // Condition when current column index is not equal with second matrix column - 1 
                if (incrementColumn != (secondMatrixColumn - 1 )) {
                    
                    printf(" ");
                }
            }    

            printf("\n");        
        }

    }


    // Print third matrix
    for (incrementRow = 0; incrementRow < thirdMatrixRow; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < thirdMatrixColumn; incrementColumn++){
            
            printf("%d", thirdMatrix[incrementRow][incrementColumn]);
            
            // Condition when current column index is not equal with first matrix column - 1 
            if (incrementColumn != (thirdMatrixColumn - 1)) {
                
                printf(" ");
            }
        }     

        printf("\n");
    }
    

    return 0;
}