/*
 *  Name Program    : Maximum Value in Array
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  1
 *  2
 *  3
 *  4
 *  5
 * 
 *  Output
 *  ------
 *  5
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int arrayInteger[5];
	int penghitung;
	int maksimal;

	// Loop for getting input from console
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);
	}

	// Variable inisialization
	maksimal = arrayInteger[0];

	// Loop for searching the maximum value from array of integer
	for (penghitung = 1; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] > maksimal)
		{
			maksimal = arrayInteger[penghitung];
		}
	}

	// Print to console
	printf("%d\n", maksimal);

	return 0;
}