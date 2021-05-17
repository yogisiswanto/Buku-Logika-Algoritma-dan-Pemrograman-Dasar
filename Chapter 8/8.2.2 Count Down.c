/*
 *  Name Program    : Count Down
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
 * 	10
 * 	9
 * 	8
 * 	7
 * 	6
 * 	5
 * 	4
 * 	3
 * 	2
 * 	1
 */

#include <stdio.h>

// Main function
int main(){
	
	// Variable declaration
	int increment;
	
	// Loop for print down to
	for (increment = 10; increment >= 1; increment--)
	{
		printf("%d\n", increment);
	}

	return 0;   
}