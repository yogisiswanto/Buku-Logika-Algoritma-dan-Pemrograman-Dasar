/*
 *  Name Program    : Check Array Equal
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 9
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 5th August 2021
 *  Language        : C Language
 * 
 * 	Input 1
 * 	-----
 * 	2
 *  1
 *  2
 *  2
 *  1
 *  2
 * 
 * 	Output 1
 * 	------
 *  Sama
 * 
 * 	Input 2
 * 	-----
 * 	1
 *  1
 *  2
 *  1
 *  2
 * 
 * 	Output 2
 * 	------
 *  Tidak Sama
 * 
 * 	Input 3
 * 	-----
 * 	2
 *  1
 *  2
 *  2
 *  2
 *  1
 * 
 * 	Output 3
 * 	------
 *  Tidak Sama
 */

#include <stdio.h>
int isEqual(int, int [], int, int []);

// Main function
int main(){

    // Variable declaration
    int firstNumber, secondNumber, increment, result;

    // Get input from console for firstNumber
    scanf("%d", &firstNumber);

    // Variable declaration of firstArray
    int firstArray[firstNumber];

    // Loop for fill firstArray
    for(increment = 0; increment < firstNumber; increment++){
        
        scanf("%d", &firstArray[increment]);
    }

    // Get input from console secondNumber
    scanf("%d", &secondNumber);

    // Variable declaration of secondArray
    int secondArray[secondNumber];

    // Loop for fill secondArray
    for(increment = 0; increment < secondNumber; increment++){
        
        scanf("%d", &secondArray[increment]);
    }

    // Check first array and second array is equal
    result = isEqual(firstNumber, firstArray, secondNumber, secondArray);
    
    // Condition when first array and second array is equal
    if(result == 1){

        printf("Sama\n");
    }

    // Condition when first array and second array is not equal
    else{

        printf("Tidak Sama\n");
    }

    return 0;
}

// Function for check first array and second array is equal
int isEqual(int firstNumber, int firstArray[], int secondNumber, int secondArray[]){

    // Variable declaration
    int increment, status;

    // Variable inisialization
    increment = 0;
    status = 1;

    // Condition when firstNumber and secondNumber is equal
    if (firstNumber == secondNumber){
        
        // Loop for check first array and second array is equal
        while ((increment < firstNumber) && (status == 1)){
            
            // Condition when firstArray value of current index is not equal with secondArray value of current index
            if (firstArray[increment] != secondArray[increment]){
                
                status = 0;
            }

            increment++;            
        }
    }

    // Condition when firstNumber and secondNumber is equal
    else{
        
        status = 0;
    }
    
    return status;
}