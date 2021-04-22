/*
 *  Name Program    : Prefix A with Struct
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
	int penghitung;

	// Loop getting input from console
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &arrayString[penghitung].string);

	}

	// Loop for string print which have a prefix a in array of string
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		if ((arrayString[penghitung].string[0] == 'A') || (arrayString[penghitung].string[0] == 'a'))
		{
			printf("%s\n", arrayString[penghitung].string);
		}

	}

	return 0;
}