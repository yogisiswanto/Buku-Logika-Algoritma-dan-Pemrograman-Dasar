#include <stdio.h>
int main(){
 
	int penghitung, bintang;

	printf("Masukan banyaknya bintang:\n");

	scanf("%d", &bintang);

	for (penghitung = 0; penghitung < bintang; penghitung++)
	{
		
		printf("*");
	}

	return 0;   
}