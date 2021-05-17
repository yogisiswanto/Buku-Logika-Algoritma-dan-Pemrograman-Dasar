/*
 *  Name Program    : Show Array Value in Occasional Condition
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
 *  999
 *  3
 * 	4
 * 
 *  Output
 *  ------
 *  1
 *  2
 *  
 *  Input 2
 *  -----
 *  1
 *  2
 *  3
 *  4
 * 	5
 * 
 *  Output 2
 *  ------
 *  1
 *  2
 *  3
 *  4
 * 	5
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int arrayInteger[5];
	int penghitung;

	// loop for getting input from console
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);
	}

	// Variable inisialization
	penghitung = 0;

	// Loop for print to console while the value from array is occasional condition
	while((arrayInteger[penghitung] != 999) && (penghitung < 5)){

		printf("%d\n", arrayInteger[penghitung]);

		penghitung++;
	}

	return 0;
}