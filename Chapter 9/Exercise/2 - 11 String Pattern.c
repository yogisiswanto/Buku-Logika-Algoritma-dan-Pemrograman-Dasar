/*
 *  Name Program    : String Pattern
 *  Purpose         : Answer question from exercise Chapter 9 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 4th August 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	4
 *  aku
 *  adalah
 *  anak
 *  gembala
 * 
 * 	Output
 * 	------
 * 	a a a g
 *  k d n e
 *  u a a m
 *    l k b
 *    a   a
 *    h   l
 *        a
 */

#include <stdio.h>
#include <string.h>
void stringPattern(int, int, char [][99]);

// Main function
int main()
{
	// Variable declaration
	char string[99][99];
	int number, increment, length;

	// Variable insialization
	length = 0;

	// Get input from console
	scanf("%d", &number);

	for (increment = 0; increment < number; increment++)
	{
		scanf("%s", &string[increment]);

		// Get the maximum string length
		if (length < strlen(string[increment]))
		{
			length = strlen(string[increment]);
		}
	}

	// Print string pattern
	stringPattern(number, length, string);
	
	return 0;
}

// Procedure for print string pattern
void stringPattern(int number, int length, char string[][99]){

	// Variable declaration
	int incrementRow, incrementColumn;

	// Loop for print patter horizonaly
	for (incrementRow = 0; incrementRow < length; incrementRow++)
	{
		// Loop for print patter verticaly
		for (incrementColumn = 0; incrementColumn < number; incrementColumn++)
		{
			// Condition when incrementRow is less than length of string column
			if (incrementRow < strlen(string[incrementColumn]))
			{
				// Condition when column is equal with number min 1
				if (incrementColumn == number - 1)
				{
					printf("%c", string[incrementColumn][incrementRow]);
				}

				// Alternate condition
				else{		

					printf("%c ", string[incrementColumn][incrementRow]);
				}	
			
			// Alternate condition
			}else{

				printf("  ");
			}					
					
		}

		printf("\n");
	}
}

/*
11
hidup
adalah
anugerah
mesti
kita
lakukan
yang
terbaik
dan
tetap
semangat
*/