#include <stdio.h>
int main(){
 
	int baris, kolom, bintang;

	printf("Masukan banyaknya bintang:\n");

	scanf("%d", &bintang);

	for (baris = 0; baris < (bintang / 2); baris++)
	{
		
		for (kolom = 0; kolom < baris; kolom++)
		{
			
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	if (bintang % 2 == 1)
	{
		
		for (kolom = 0; kolom < (bintang / 2); kolom++)
		{
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}

		printf("\n");
	}

	for (baris = 0; baris < (bintang / 2); baris++)
	{
		
		for (kolom = ((bintang / 2) - baris); kolom > 1; kolom--)
		{
			
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	return 0;   
}