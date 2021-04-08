#include <stdio.h>

int main(){

    int alas, tinggi, sisiMiring;

    printf("Masukan alas, tinggi, sisi miring dari segitiga, tekan enter setiap memasukan angka\n");

    scanf("%d", &alas);
    scanf("%d", &tinggi);
    scanf("%d", &sisiMiring);

    if((sisiMiring * sisiMiring) == ((alas * alas) + (tinggi * tinggi))){

        printf("Segitiga siku-siku\n");
    
    }else{

        printf("Bukan Segitiga siku-siku\n");
    }


    return 0;
}