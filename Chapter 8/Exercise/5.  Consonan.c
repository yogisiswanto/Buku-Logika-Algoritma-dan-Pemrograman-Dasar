/*
 *  Name Program    : Consonan
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	6
 *  s
 *  t
 *  r
 *  i
 *  n
 *  g
 * 
 * 	Output
 * 	------
 * 	s
 *  t
 *  r
 *  n
 *  g
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	char character[99];
	int banyak, baris;

	// Get input from console
	scanf("%d", &banyak);

	for (baris = 0; baris < banyak; baris++)
	{
		scanf(" %c", &character[baris]);
	}

	// Looping for checking character
	for (baris = 0; baris < banyak; baris++)
	{	
		// Condition when character is not equal with vocal
		if ((character[baris] != 'A') && (character[baris] != 'a') &&
			(character[baris] != 'I') && (character[baris] != 'i') &&
			(character[baris] != 'U') && (character[baris] != 'u') &&
			(character[baris] != 'E') && (character[baris] != 'e') &&
			(character[baris] != 'O') && (character[baris] != 'o'))
		{
			printf("%c\n", character[baris]);
		}
	}

	return 0;
}