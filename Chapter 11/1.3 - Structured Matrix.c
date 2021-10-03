/*
 *  Name Program    : Structured Matrix
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 29th September 2021
 *  Language        : C Language
 * 
 * 	Input
 * 	-----
 *  2
 *  2
 * 
 * 	Output
 * 	------
 *    Putih    Hijau  
 *    Putih    Putih
 */

#include <stdio.h>

// Inisialization structured matrix
typedef struct {
    int red;
    int green;
    int blue;
}pixel;


// Main function
int main(){

    // Variable declaration
    int row, column, incrementRow, incrementColumn;

    // Get input from consoleincrementColumn
    scanf("%d", &row);
    scanf("%d", &column);

    // Structured matrix declaration
    pixel pixelArray[row][column];

    // Inisialization pixel matrix
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            pixelArray[incrementRow][incrementColumn].red = 255;
            pixelArray[incrementRow][incrementColumn].green = 255;
            pixelArray[incrementRow][incrementColumn].blue = 255;
        }
        
    }

    // Inisialization pixel matrix on ordo 0,1
    pixelArray[0][1].red = 0;
    pixelArray[0][1].green = 255;
    pixelArray[0][1].blue = 0;

    // Print pixel matrix value
    for (incrementRow = 0; incrementRow < row; incrementRow++){
        
        for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
            
            // Condition when pixel matrix on current ordo are colors equal with 255
            if ((pixelArray[incrementRow][incrementColumn].red == 255) && (pixelArray[incrementRow][incrementColumn].green == 255) && (pixelArray[incrementRow][incrementColumn].blue == 255)) {

               printf("  Putih  ");

            }

            // Condition when pixel matrix on current ordo is red color equal with 0 and green color is equal with 255 and blue color is equal with 0
            else if ((pixelArray[incrementRow][incrementColumn].red == 0) && (pixelArray[incrementRow][incrementColumn].green == 255) && (pixelArray[incrementRow][incrementColumn].blue == 0)) {
                
                printf("  Hijau  ");
            }

        }

        printf("\n");
        
    }

    return 0;
}