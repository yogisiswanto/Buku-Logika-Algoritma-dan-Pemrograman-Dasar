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

	for (penghitung = 0; penghitung < 5; penghitung++)
	{

		if (arrayInteger[penghitung] % 2 == 1)
		{
			printf("%d\n", arrayInteger[penghitung]);
		}
	}

	return 0;
}