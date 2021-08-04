/*
 *  Name Program    : Modified Character
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	4
 *  anilsa
 *  igoy
 *  ulfa
 *  enigma
 * 
 * 	Output
 * 	------
 * 	aslina
 *  gioy
 *  aflu
 *  enigma
 */

#include <stdio.h>
#include <string.h>
void modifiedCharacter(int, char [][99]);

// Main function
int main()
{

	// Variable declaration	
	char string[99][99];
	int number, increment;

	// Get input from console
	scanf("%d", &number);

	for (increment = 0; increment < number; increment++)
	{
		scanf(" %s", &string[increment]);
	}

	// Modified character
	modifiedCharacter(number, string);

	return 0;
}

// Procedure for modified character
void modifiedCharacter(int number, char string[][99]){

	// Variable declaration
	int incrementRow, incrementColumn;

	// Looping for checking string
	for (incrementRow = 0; incrementRow < number; incrementRow++)
	{

		// Condition when string has prefix A or a. From anilsa into aslina 
		if ((string[incrementRow][0] == 'A') || (string[incrementRow][0] == 'a'))
		{
			
			for (incrementColumn = strlen(string[incrementRow]) - 1; incrementColumn >= 0; incrementColumn--)
			{
				printf("%c", string[incrementRow][incrementColumn]);
			}

			printf("\n");
		
		}

		// Condition when string has prefix I or i. From igoy into gioy
		else if ((string[incrementRow][0] == 'I') || (string[incrementRow][0] == 'i'))
		{
			// Variable declaration & inisialization
			int length = 0;
			int start = 0;
			int middle = 0;

			// Set length from current string
			length = strlen(string[incrementRow]);

			// Condition when length of current string is even
			if (length % 2 == 0)
			{
				start = (length / 2) - 1;
				middle = length / 2;
			}

			// Condition when length of current string is odd
			else{
				
				start = length / 2;
				middle = (length / 2) + 1;
			}

			for (incrementColumn = start; incrementColumn >= 0; incrementColumn--)
			{
				printf("%c", string[incrementRow][incrementColumn]);
			}

			for (incrementColumn = middle; incrementColumn < length; incrementColumn++)
			{
				printf("%c", string[incrementRow][incrementColumn]);
			}

			printf("\n");
		}

		// Condition when string has prefix U or u. From ulfa into aflu
		else if ((string[incrementRow][0] == 'U') || (string[incrementRow][0] == 'u'))
		{
			for (incrementColumn = strlen(string[incrementRow]) - 1; incrementColumn >= 0; incrementColumn--)
			{
				printf("%c", string[incrementRow][incrementColumn]);
			}

			printf("\n");
		}

		// Alternate condition
		else{
			
			printf("%s\n", string[incrementRow]);
		}
		
	}
}