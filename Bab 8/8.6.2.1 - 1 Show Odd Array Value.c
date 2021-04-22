/*
 *  Name Program    : Show Odd Array Value
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int arrayInteger[5];
	int penghitung;

	// Loop for getting input from console
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	// Loop for print to console the odd value from array of integer
	for (penghitung = 0; penghitung < 5; penghitung++)
	{

		if (arrayInteger[penghitung] % 2 == 1)
		{
			printf("%d\n", arrayInteger[penghitung]);
		}
	}

	return 0;
}