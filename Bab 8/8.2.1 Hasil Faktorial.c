#include <stdio.h>

int main()
{
	
	int fak_berapa, penghitung, hasil_faktorial;

	printf("Masukan angka faktorial yang akan dihitung:\n");

	scanf("%d", &fak_berapa);

	printf("\n");

	hasil_faktorial = 1;

	for (penghitung = 2; penghitung <= fak_berapa; penghitung++)
	{
		hasil_faktorial = hasil_faktorial * penghitung;
	}

	printf("%d\n", hasil_faktorial);

	return 0;
}