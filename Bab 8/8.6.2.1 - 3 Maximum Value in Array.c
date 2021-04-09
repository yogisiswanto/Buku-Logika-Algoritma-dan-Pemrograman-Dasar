#include <stdio.h>

int main()
{
	
	int arrayInteger[5];
	int penghitung;
	int maksimal;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	maksimal = arrayInteger[0];

	for (penghitung = 1; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] > maksimal)
		{
			maksimal = arrayInteger[penghitung];
		}
	}

	printf("%d\n", maksimal);

	return 0;
}