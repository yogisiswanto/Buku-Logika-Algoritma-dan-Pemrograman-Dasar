/*
 *  Name Program    : Count Odd Value in Array
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
	int banyak;

	// Loop for getting input from console
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	// Variable inisialization
	banyak = 0;

	// Loop for counting odd value from array of integer
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] % 2 == 1)
		{
			banyak++;
		}
	}

	// Print to console
	printf("%d\n", banyak);

	return 0;
}