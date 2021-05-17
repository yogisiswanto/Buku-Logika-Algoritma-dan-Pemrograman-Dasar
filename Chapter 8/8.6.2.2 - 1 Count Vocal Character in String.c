/*
 *  Name Program    : Count Vocal Character in String
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  akuadalah
 * 
 *  Output
 *  ------
 *  5
 */

#include <stdio.h>
#include <string.h>

// Main function
int main()
{
	// Variable declaration
	char string[50];
	int penghitung, jumlah;

	printf("Masukan kata:\n");

	// Get input from console
	scanf("%s", &string);

	// Varibale inisialization
	jumlah = 0;

	// Loop for countung vocal character in a string
	for (penghitung = 0; penghitung < strlen(string); penghitung++)
	{
		if ((string[penghitung] == 'a') || (string[penghitung] == 'i') || (string[penghitung] == 'u') || (string[penghitung] == 'e') || (string[penghitung] == 'o'))
		{
			jumlah++;
		}
	}

	// Print to console
	printf("%d\n", jumlah);

	return 0;
}