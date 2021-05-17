/*
 *  Name Program    : Fill Array of Integer
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 21th April 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	-
 * 
 * 	Output
 * 	------
 * 	0
 * 	1
 * 	2
 * 	3
 * 	4
 */

#include <stdio.h>

// Main function
int main()
{
	// Variable declaration
	int arrayInteger[5], penghitung;

	// Loop for fill array of integer
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		arrayInteger[penghitung] = penghitung;
	}

	// Loop for print to console value from array of integer
	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("%d\n", arrayInteger[penghitung]);
	}	

	return 0;
}