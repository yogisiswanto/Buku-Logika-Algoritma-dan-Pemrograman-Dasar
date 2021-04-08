#include <stdio.h>

int main(){

    int angkaPertama, angkaKedua, hasil, menu;

    printf("Masukan dua buah angka, untuk setiap angka tekan enter\n");

    scanf("%d", &angkaPertama);
    scanf("%d", &angkaKedua);

    printf("Menu:\n
    1. Tambah\n
    2. Kurang\n
    3. Kali\n");

    scanf("%d", &menu);

    if((menu >= 1) && (menu <= 3)){

        switch(menu){

            case 1 : {
                
                hasil = angkaPertama + angkaKedua;
            }

            case 2 : {

                hasil = angkaPertama - angkaKedua;
            }

            case 3 : {

                hasil = angkaPertama * angkaKedua;
            }
        }
    
    }else{

        hasil = 0;
        printf("Menu tidak valid\n");
    }

    printf("%d\n", hasil);

    return 0;
}