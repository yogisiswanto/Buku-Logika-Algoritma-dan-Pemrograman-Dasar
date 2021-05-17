/*
 *  Name Program    : Print Character
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
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

// Main function
int main()
{

	// Variable declaration	
	char string[99][99];
	int banyak, baris, kolom;

	// Get input from console
	scanf("%d", &banyak);

	for (baris = 0; baris < banyak; baris++)
	{
		scanf(" %s", &string[baris]);
	}

	// Looping for checking string
	for (baris = 0; baris < banyak; baris++)
	{

		// Condition when string has prefix A or a. From anilsa into aslina 
		if ((string[baris][0] == 'A') || (string[baris][0] == 'a'))
		{
			
			for (kolom = strlen(string[baris]) - 1; kolom >= 0; kolom--)
			{
				printf("%c", string[baris][kolom]);
			}

			printf("\n");
		
		}

		// Condition when string has prefix I or i. From igoy into gioy
		else if ((string[baris][0] == 'I') || (string[baris][0] == 'i'))
		{
			int length = 0;
			int start = 0;
			int middle = 0;

			length = strlen(string[baris]);

			if (length % 2 == 0)
			{
				start = (length / 2) - 1;
				middle = length / 2;
			}

			else{
				start = length / 2;
				middle = (length / 2) + 1;
			}

			for (kolom = start; kolom >= 0; kolom--)
			{
				printf("%c", string[baris][kolom]);
			}

			for (kolom = middle; kolom < length; kolom++)
			{
				printf("%c", string[baris][kolom]);
			}

			printf("\n");
		}

		// Condition when string has prefix U or u. From ulfa into aflu
		else if ((string[baris][0] == 'U') || (string[baris][0] == 'u'))
		{
			for (kolom = strlen(string[baris]) - 1; kolom >= 0; kolom--)
			{
				printf("%c", string[baris][kolom]);
			}

			printf("\n");
		}

		// Alternate condition
		else{
			
			printf("%s\n", string[baris]);
		}
		
	}

	return 0;
}