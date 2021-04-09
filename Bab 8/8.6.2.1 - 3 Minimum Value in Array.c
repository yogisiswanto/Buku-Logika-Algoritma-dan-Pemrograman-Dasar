#include <stdio.h>

int main()
{
	
	int arrayInteger[5];
	int penghitung;
	int minimal;

	for (penghitung = 0; penghitung < 5; penghitung++)
	{
		printf("Masukan angka:\n");

		scanf("%d", &arrayInteger[penghitung]);

		printf("\n");
	}

	minimal = arrayInteger[0];

	for (penghitung = 1; penghitung < 5; penghitung++)
	{
		if (arrayInteger[penghitung] < minimal)
		{
			minimal = arrayInteger[penghitung];
		}
	}

	printf("%d\n", minimal);

	return 0;
}