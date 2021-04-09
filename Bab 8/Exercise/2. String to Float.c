#include <stdio.h>
#include <string.h>

int main()
{
	
	char string[99];
	int banyak, baris, kolom, before;
	float jumlah, temp, total;

	total = 0;

	scanf("%d", &banyak);

	for (baris = 0; baris < banyak; baris++)
	{
		scanf("%s", &string);

		before = 0;
		jumlah = 0;
		kolom = 0;

		while((string[kolom] != '.') && (kolom < strlen(string))){

			if (string[kolom] == '1')
			{
				temp = 1;
			}

			else if (string[kolom] == '2')
			{
				temp = 2;
			}

			else if (string[kolom] == '3')
			{
				temp = 3;
			}

			else if (string[kolom] == '4')
			{
				temp = 4;
			}

			else if (string[kolom] == '5')
			{
				temp = 5;
			}

			else if (string[kolom] == '6')
			{
				temp = 6;
			}

			else if (string[kolom] == '7')
			{
				temp = 7;
			}

			else if (string[kolom] == '8')
			{
				temp = 8;
			}

			else if (string[kolom] == '9')
			{
				temp = 9;
			}

			else{
				temp = 0;
			}

			if (kolom == 1)
			{
				temp = temp * 10;
			}

			else if (kolom == 2)
			{
				temp = temp * 100;
			}

			jumlah = jumlah + temp;

			before++;
			kolom++;
		}

		temp = 0;

		for (kolom = before + 1; kolom < strlen(string); kolom++)
		{
			
			if (string[kolom] == '1')
			{
				temp = 1;
			}

			else if (string[kolom] == '2')
			{
				temp = 2;
			}

			else if (string[kolom] == '3')
			{
				temp = 3;
			}

			else if (string[kolom] == '4')
			{
				temp = 4;
			}

			else if (string[kolom] == '5')
			{
				temp = 5;
			}

			else if (string[kolom] == '6')
			{
				temp = 6;
			}

			else if (string[kolom] == '7')
			{
				temp = 7;
			}

			else if (string[kolom] == '8')
			{
				temp = 8;
			}

			else if (string[kolom] == '9')
			{
				temp = 9;
			}

			else{
				temp = 0;
			}

			if (kolom == before + 1)
			{
				temp = temp / 10;
			}

			else if (kolom == before + 2)
			{
				temp = temp / 100;
			}

			jumlah = jumlah + temp;

		}

		total = total + jumlah;
	}

	printf("%0.2f\n", total);

	return 0;
}