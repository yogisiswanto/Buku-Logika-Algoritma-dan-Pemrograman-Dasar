/*
 *  Name Program    : Star X Pattern
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
 * 	*****    *****
 *   *****  *****
 *    **********
 *   *****  *****
 *  *****    *****
 */

#include <stdio.h>
void xstar(int);

// Main function
int main(){
	
	// Variable declaration
	int incrementRow, incrementColumn, number, border, bottom;

	printf("Masukan banyaknya bintang:\n");

	// Get input from console
	scanf("%d", &number);

	// Print x star pattern
	xstar(number);

	return 0;   
}

// Procedure for print x star pattern
void xstar(int number){

	// Variable declaration
	int incrementRow, incrementColumn, border, bottom;

	// Condition when input is even
	if (number % 2 == 0)
	{
		bottom = number / 2;
		border = number - 2;
	
	// Condition when input is odd
	}else{

		bottom = (number / 2) + 1;
		border = number - 1;
	}

	// Loop for star print for top part
	/* 
	 * 	*****    *****
	 *   *****  *****
 	 *    **********
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

		for (incrementColumn = 0; incrementColumn < (border - (incrementRow * 2)); incrementColumn++)
		{
			
			printf(" ");
		}

		for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	// Loop for star print for bottom part
	/* 
	 *   *****  *****
 	 *  *****    *****
	 */
	for (incrementRow = 0; incrementRow < bottom; incrementRow++)
	{
		
		for (incrementColumn = bottom - incrementRow; incrementColumn > 1; incrementColumn--)
		{
			
			printf(" ");
		}

		for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
		{
			
			printf("*");
		}

		for (incrementColumn = 0; incrementColumn < (incrementRow * 2); incrementColumn++)
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