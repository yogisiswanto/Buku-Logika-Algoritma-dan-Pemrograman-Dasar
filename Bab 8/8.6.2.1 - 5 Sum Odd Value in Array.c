/*
 *  Name Program    : Sum Odd Value in Array
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
	int jumlah;

	// Loop for getting input from console
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	// Variable inisialization
	jumlah = 0;

	// Loop for sum odd value from array of integer
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] % 2 == 1)
		{
			jumlah = jumlah + arrayInteger[penghitung];
		}
	}

	// Print to console
	printf("%d\n", jumlah);

	return 0;
}