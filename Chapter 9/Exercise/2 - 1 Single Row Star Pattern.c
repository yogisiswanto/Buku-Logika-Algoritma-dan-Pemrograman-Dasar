/*
 *  Name Program    : Single Row Star Pattern
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
 */

#include <stdio.h>
void pattern(int);

// Main function
int main(){
	
	// Variable declaration
	int number;

	printf("Masukan banyaknya number:\n");

	// Get input from console
	scanf("%d", &number);

	// Print pattern
	pattern(number);

	return 0;   
}

// Procedure for print start pattern
void pattern(int number){

	// Variable declaration
	int increment;

	// Loop for print to console the start pattern
	for (increment = 0; increment < number; increment++)
	{
		
		printf("*");
	}

}