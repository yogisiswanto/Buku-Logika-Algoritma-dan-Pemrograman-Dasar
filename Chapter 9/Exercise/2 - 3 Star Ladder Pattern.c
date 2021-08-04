/*
 *  Name Program    : Star Ladder Pattern
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
 * 	 *****
 *    *****
 *     *****
 *      *****
 */

#include <stdio.h>
void starLadderPattern(int);

// Main function
int main(){
	
	// Variable declaration
	int number;

	printf("Masukan banyaknya bintang:\n");

	// Get input from console
	scanf("%d", &number);

	// Print star ladder pattern
	starLadder(number);

	return 0;   
}

// Procedure for print star ladder pattern
void starLadder(int number){

	// Variable declaration
	int incrementRow, incrementColumn;

	// Loop for star print look like stair
	for (incrementRow = 0; incrementRow < number; incrementRow++)
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
}