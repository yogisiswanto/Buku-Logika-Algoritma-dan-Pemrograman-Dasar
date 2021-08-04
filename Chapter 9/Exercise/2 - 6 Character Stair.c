/*
 *  Name Program    : Character Stair
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  akuadalah
 * 
 *  Output
 *  ------
 *  a
 *   k
 *    u
 *     a
 *      d
 *       a
 *        l
 *         a
 *          h
 */

#include <stdio.h>
#include <string.h>
void characterStair(char []);

// Main function
int main()
{
	// Variable declaration
	char string[50];

	printf("Masukan kata:\n");
	
	// Get input from console
	scanf("%s", &string);

	// Print character look like stair
	characterStair(string);

	return 0;
}

// Procedure for print character look like stair
void characterStair(char string[]){

	// Variable declaration
	int incrementRow, incrementColumn;

	// Loop for print character like stair
	for (incrementRow = 0; incrementRow < strlen(string); incrementRow++)
	{
		for (incrementColumn = 0; incrementColumn < incrementRow; incrementColumn++)
		{
			printf(" ");
		}

		printf("%c\n", string[incrementRow]);
	}
}