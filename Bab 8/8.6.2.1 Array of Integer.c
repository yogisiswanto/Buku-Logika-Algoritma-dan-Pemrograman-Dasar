#include <stdio.h>

int main()
{
	
	int banyak;

	printf("Masukan banyaknya angka:\n");

	scanf("%d", &banyak);

	int arrayInteger[banyak];
	int penghitung;

	for (penghitung = 0; penghitung < banyak; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	for (penghitung = 0; penghitung < banyak; penghitung++)
	{
		
		printf("%d\n", arrayInteger[penghitung]);
	}

	return 0;
}