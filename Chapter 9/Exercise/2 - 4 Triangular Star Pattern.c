/*
 *  Name Program    : Triangular Star Pattern
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
 *   *****
 *    *****
 *   *****
 *  *****
 */

#include <stdio.h>
void triangularStar(int);

// Main function
int main(){
	
	// Variable declaration
	int number;

	printf("Masukan banyaknya number:\n");

	// Get input from console
	scanf("%d", &number);

	// Print triangular star
	triangularStar(number);

	return 0;   
}

// Procedure for print triangular star
void triangularStar(int number){

	// Variable declaration
	int incrementRow, incrementColumn;

	// Loop for star print of top part
	/* 
	 * 	*****
 	 *   *****
	 */
	for (incrementRow = 0; incrementRow < (number / 2); incrementRow++)
	{
		
		for (incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++)
		{
			
			printf(" ");
		}

		for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	// Loop for star print of middle part
	//     *****
	if (number % 2 == 1)
	{
		
		for (incrementColumn = 0; incrementColumn < (number / 2); incrementColumn++)
		{
			printf(" ");
		}

		for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
		{
			
			printf("*");
		}

		printf("\n");
	}

	// Loop for star print of bottom part
	/* 
	 *   *****
	 *  *****
	 */
	for (incrementRow = 0; incrementRow < (number / 2); incrementRow++)
	{
		
		for (incrementColumn = ((number / 2) - incrementRow); incrementColumn > 1; incrementColumn--)
		{
			
			printf(" ");
		}

		for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}
}