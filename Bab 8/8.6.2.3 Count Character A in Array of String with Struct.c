/*
 *  Name Program    : Count Character A in Array of String with Struct
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 */

#include <stdio.h>
#include <string.h>

// Struct declaration
typedef struct{
	char string[50];
}str;

// Main function
int main()
{
	// Variable declaration
	str arrayString[10];
	int penghitung, huruf, jumlah;

	// Loop getting input from console
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &arrayString[penghitung].string);

	}

	// Variable inisialization
	jumlah = 0;

	// Loop for counting a character in array of string
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		for (huruf = 0; huruf < strlen(arrayString[penghitung].string); huruf++)
		{
			if ((arrayString[penghitung].string[huruf] == 'A') || (arrayString[penghitung].string[huruf] == 'a'))
			{
				jumlah++;
			}
		}
	}

	// Print to console
	printf("%d\n", jumlah);

	return 0;
}