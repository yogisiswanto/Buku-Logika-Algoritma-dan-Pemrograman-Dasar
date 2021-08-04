/*
 *  Name Program    : Reverse Character Print
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
 * 	     a
 *       l
 *      a
 *     b
 *    m
 *   e
 *  g
 */

#include <stdio.h>
#include <string.h>
void reverseCharacterPrint(char []);

// Main function
int main()
{
	// Variable declaration
	char string[99];
	
	// Get input from console
	scanf("%s", &string);

	// Print reverse character
	reverseCharacterPrint(string);

	return 0;
}

// Procedure for print reverse character
void reverseCharacterPrint(char string[]){

	// Variable declaration
	int incrementRow, incrementColumn, space, length;

	// Length inisialization
	length =  strlen(string) - 1;
	space = length - 1;

	// Loop for print pattern
	for (incrementRow = length; incrementRow >= 0; incrementRow--)
	{
		// Decrement white space
		if (incrementRow < length - 1)
		{
			space--;
		}

		// Print white space
		for (incrementColumn = 0; incrementColumn < space; incrementColumn++)
		{
			printf(" ");
		}

		printf("%c\n", string[incrementRow]);
	}
}