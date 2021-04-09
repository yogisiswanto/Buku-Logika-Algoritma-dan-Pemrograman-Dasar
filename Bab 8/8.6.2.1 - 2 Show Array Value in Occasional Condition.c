#include <stdio.h>

int main()
{
	
	int arrayInteger[5];
	int penghitung;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	penghitung = 0;

	while((arrayInteger[penghitung] != 999) && (penghitung < 5)){

		printf("%d\n", arrayInteger[penghitung]);

		penghitung++;
	}

	return 0;
}