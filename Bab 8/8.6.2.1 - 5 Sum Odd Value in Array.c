#include <stdio.h>

int main()
{
	
	int arrayInteger[5];
	int penghitung;
	int jumlah;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	jumlah = 0;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] % 2 == 1)
		{
			jumlah = jumlah + arrayInteger[penghitung];
		}
	}

	printf("%d\n", jumlah);

	return 0;
}