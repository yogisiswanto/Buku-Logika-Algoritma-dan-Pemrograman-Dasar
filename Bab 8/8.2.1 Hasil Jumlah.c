#include <stdio.h>

int main()
{
	
	int berapa_kali, hasil_jumlah, penghitung;

	hasil_jumlah = 0;

	printf("masukan angka berapa kali akan diulang:\n");

	scanf("%d", &berapa_kali);

	printf("\n");

	for (penghitung = 0; penghitung < berapa_kali; penghitung++)
	{
		hasil_jumlah = hasil_jumlah + penghitung;
	}

	printf("%d\n", hasil_jumlah);

	return 0;
}