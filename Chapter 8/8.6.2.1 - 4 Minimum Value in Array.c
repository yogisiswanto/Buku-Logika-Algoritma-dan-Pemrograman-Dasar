/*
 *  Name Program    : Minimum Value in Array
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  5
 *  4
 *  3
 *  2
 *  1
 * 
 *  Output
 *  ------
 *  1
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int arrayInteger[5];
	int penghitung;
	int minimal;

	// Loop for getting input from console
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);
	}

	// Variable inisialization
	minimal = arrayInteger[0];

	// Loop for searching the minimum value from array of integer
	for (penghitung = 1; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] < minimal)
		{
			minimal = arrayInteger[penghitung];
		}
	}

	// Print to console
	printf("%d\n", minimal);

	return 0;
}