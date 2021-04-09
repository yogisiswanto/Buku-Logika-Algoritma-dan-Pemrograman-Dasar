#include <stdio.h>
int main(){
 
	int baris, kolom, bintang;

	printf("Masukan banyaknya bintang:\n");

	scanf("%d", &bintang);

	for (baris = 0; baris < bintang; baris++)
	{
		
		for (kolom = 0; kolom < bintang; kolom++)
		{
			
			printf("*");
		}
		
		printf("\n");
	}

	return 0;   
}