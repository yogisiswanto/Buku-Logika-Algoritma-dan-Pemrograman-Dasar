/*
 *  Name Program    : String Pattern
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 17th May 2021
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

// Main function
int main()
{
	// Variable declaration
	char string[99][99];
	int banyak, baris, kolom, panjang;

	// Variable insialization
	panjang = 0;

	// Get input from console
	scanf("%d", &banyak);

	for (baris = 0; baris < banyak; baris++)
	{
		scanf("%s", &string[baris]);

		// Get the maximum string length
		if (panjang < strlen(string[baris]))
		{
			panjang = strlen(string[baris]);
		}
	}

	// Loop for print patter horizonaly
	for (baris = 0; baris < panjang; baris++)
	{
		// Loop for print patter verticaly
		for (kolom = 0; kolom < banyak; kolom++)
		{
			// Condition when baris is less than length of string column
			if (baris < strlen(string[kolom]))
			{
				// Condition when column is equal with banyak min 1
				if (kolom == banyak - 1)
				{
					printf("%c", string[kolom][baris]);
				}

				// Alternate condition
				else{		

					printf("%c ", string[kolom][baris]);
				}	
			
			// Alternate condition
			}else{

				printf("  ");
			}					
					
		}

		printf("\n");
	}
	
	return 0;
}

/*
11
hidup
adalah
anugerah
msti
kita
lakukan
yang
terbaik
dan
tetap
semangat
*/