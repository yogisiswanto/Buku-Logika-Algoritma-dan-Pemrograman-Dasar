/*
 *  Name Program    : Stair Word
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  aku
 *  adalah
 *  anak
 *  gemabala
 *  selalu
 *  riang
 *  serta
 *  gembira
 *  karena
 * 
 *  Output
 *  ------
 *  aku
 *     adalah
 *           anak
 *               gembala
 *                      selalu
 *                            riang 
 *                                 serta
 *                                      gembira
 *                                             karena
 */

#include <stdio.h>
#include <string.h>
void wordStair(char [][50]);

// Main function
int main()
{
	
	// Variable declaration
	char string[9][50];
	int increment;

	// Loop getting input from console
	for (increment = 0; increment < 9; increment++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &string[increment]);
		
	}
	
	// Print word like stair
	wordStair(string);

	return 0;
}

// Procedure for print word like stair
void wordStair(char string[][50]){

	// Variable declaration
	int incrementRow, incrementColumn, space;

	// Variable inisialization
	space = 0;

	// Loop for string print look like stair
	for (incrementRow = 0; incrementRow < 9; incrementRow++)
	{
		for (incrementColumn = 0; incrementColumn < space; incrementColumn++)
		{
			printf(" ");
		}

		printf("%s\n", string[incrementRow]);

		space = space + strlen(string[incrementRow]);
	}
}