#include <stdio.h>
#include <string.h>

int main()
{

	char string[99][99];
	int banyak, baris, kolom, panjang;

	panjang = 0;

	scanf("%d", &banyak);

	for (baris = 0; baris < banyak; baris++)
	{
		scanf("%s", &string[baris]);

		if (panjang < strlen(string[baris]))
		{
			panjang = strlen(string[baris]);
		}
	}


	for (baris = 0; baris < panjang; baris++)
	{
		for (kolom = 0; kolom < banyak; kolom++)
		{
		
			if (baris < strlen(string[kolom]))
			{
				if (kolom == banyak - 1)
				{
					printf("%c", string[kolom][baris]);
				}

				else{		

					printf("%c ", string[kolom][baris]);
				}	
			
			}else{

				printf("  ");
			}					
					
		}

		printf("\n");
	}
	
	return 0;
}

/*
11
hidup
adalah
anugerah
msti
kita
lakukan
yang
terbaik
dan
tetap
semangat
*/