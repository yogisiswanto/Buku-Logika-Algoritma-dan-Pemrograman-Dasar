/*
 *  Name Program    : Triangular Character
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	gembala
 * 
 * 	Output
 * 	------
 * 	g
 *   e
 *    m
 *     b
 *    a
 *   l
 *  a
 */

#include <stdio.h>
#include <string.h>
void triangularCharacter(char []);

// Main function
int main(){
 
	// Variable declaration
	char string[99];
	
	// Get input from console
	scanf("%s", &string);

	// Print triangular character
	triangularCharacter(string);

	return 0;   
}

// Procedure for print triangular character
void triangularCharacter(char string[]){

	// Variable declaration
	int incrementRow, incrementColumn, space, length;

	// Length inisialization
	length =  strlen(string);
	space = length / 2;

	// Loop for print pattern
	/* 
	 * 	g
 	 *   e
 	 *    m
	 */
	for (incrementRow = 0; incrementRow < space; incrementRow++)
	{
		
		for (incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++)
		{
			
			printf(" ");
		}

		printf("%c\n", string[incrementRow]);
	}

	// Loop for print pattern
	/* 
	 *     b
	 *    a
	 *   l
	 *  a
	 */
	for (incrementRow = space; incrementRow < length; incrementRow++)
	{
		
		for (incrementColumn = 1; incrementColumn < (length - incrementRow); incrementColumn++)
		{
			
			printf(" ");
		}

		printf("%c\n", string[incrementRow]);
	}
}