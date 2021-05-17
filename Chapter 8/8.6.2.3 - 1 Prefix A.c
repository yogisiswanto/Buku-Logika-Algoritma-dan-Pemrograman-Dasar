/*
 *  Name Program    : Prefix A
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 8
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 22th April 2021
 *  Language        : C Language
 * 
 *  Input
 *  -----
 *  aku
 *  adalah
 *  anak
 *  gemabal
 *  selalu
 *  riang
 *  serta
 *  gembira
 *  karena
 *  aku
 * 
 *  Output
 *  ------
 *  aku
 *  adalah
 *  anak
 *  aku
 */

#include <stdio.h>
#include <string.h>

// Main function
int main()
{
	// Variable declaration
	char string[10][50];
	int penghitung;

	// Loop getting input from console
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		printf("Masukan kata:\n");
		scanf("%s", &string[penghitung]);

	}

	// Loop for string print which have a prefix a in array of string
	for (penghitung = 0; penghitung < 10; penghitung++)
	{
		
		if ((string[penghitung][0] == 'A') || (string[penghitung][0] == 'a'))
		{
			printf("%s\n", string[penghitung]);
		}

	}

	return 0;
}