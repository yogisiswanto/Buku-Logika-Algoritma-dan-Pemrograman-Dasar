/*
 *  Name Program    : Square Star Pattern
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	5
 * 
 * 	Output
 * 	------
 * 	*****
 *  *****
 *  *****
 *  *****
 *  *****
 */

#include <stdio.h>
void square(int);

// Main function
int main(){
	
	// Variable declaration
	int number;

	printf("Masukan banyaknya bintang:\n");

	// Get input from console
	scanf("%d", &number);

	// Print pattern
	square(number);

	return 0;   
}

// Procedure for print square pattern
void square(int number){

	// Variable declaration
	int incrementRow, incrementColumn;

	// Loop for print to console the start pattern in raw
	for (incrementRow = 0; incrementRow < number; incrementRow++)
	{
		// Loop for print to console the start pattern in column
		for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}
}