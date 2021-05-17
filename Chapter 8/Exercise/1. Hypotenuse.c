/*
 *  Name Program    : Hypotenuse
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 9th May 2021
 *  Language        : C Language
 * 
 *  Input
 * 	-----
 * 	3
 *  4
 * 
 * 	Output
 * 	------
 * 	5
 */

#include <stdio.h>
#include <math.h>

// Struct declaration
typedef struct
{
	int x;
	int y;
	int r;
}segitiga;

// Main function
int main()
{
	// Variable declaration
	segitiga triangle;

	// Get input from console
	scanf("%d", &triangle.x);
	scanf("%d", &triangle.y);

	// Calculate hypotenuse
	triangle.r = sqrt((triangle.x * triangle.x) + (triangle.y * triangle.y));

	// Print to console
	printf("%d\n", triangle.r);

	return 0;
}