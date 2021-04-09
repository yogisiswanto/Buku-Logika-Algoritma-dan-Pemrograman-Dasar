#include <stdio.h>

int main()
{
	
	int arrayInteger[5];
	int penghitung;
	int banyak;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	banyak = 0;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] % 2 == 1)
		{
			banyak++;
		}
	}

	printf("%d\n", banyak);

	return 0;
}