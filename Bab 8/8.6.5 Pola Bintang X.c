#include <stdio.h>
int main(){
 
	int baris, kolom, bintang, batas, bagianBawah;

	printf("Masukan banyaknya bintang:\n");

	scanf("%d", &bintang);

	if (bintang % 2 == 0)
	{
		bagianBawah = bintang / 2;
		batas = bintang - 2;
	
	}else{

		bagianBawah = (bintang / 2) + 1;
		batas = bintang - 1;
	}

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

		for (kolom = 0; kolom < (batas - (baris * 2)); kolom++)
		{
			
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	for (baris = 0; baris < bagianBawah; baris++)
	{
		
		for (kolom = bagianBawah - baris; kolom > 1; kolom--)
		{
			
			printf(" ");
		}

		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}

		for (kolom = 0; kolom < (baris * 2); kolom++)
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