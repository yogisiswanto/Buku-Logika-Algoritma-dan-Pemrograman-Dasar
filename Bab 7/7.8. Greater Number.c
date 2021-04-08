#include <stdio.h>

int main(){

    int angkaPertama, angkaKedua, angkaKetiga;

    printf("Masukan ketiga bilangan\n");

    scanf("%d", &angkaPertama);
    scanf("%d", &angkaKedua);
    scanf("%d", &angkaKetiga);

    if((angkaPertama > angkaKedua) && (angkaKedua > angkaKetiga)){

        printf("Angka Pertama paling besar\n");
    
    }else if((angkaKedua > angkaPertama) && (angkaPertama > angkaKetiga)){

        printf("Angka Kedua paling besar\n");

    }else if((angkaKetiga > angkaPertama) && (angkaKetiga > angkaKedua)){

        printf("Angka Ketiga paling besar\n");
    
    }else{

        printf("Ada dua atau tiga masukan memiliki nilai sama\n");
    }

    return 0;
}