#include <stdio.h>

int main(){

    int angkaPertama, angkaKedua, hasil;

    printf("Masukan dua buah bilangan bulat lalu tekan enter untuk setiap angkanya\n");
    scanf("%d", &angkaPertama);
    scanf("%d", &angkaKedua);
    
    if((angkaPertama % 2 == 0) && (angkaKedua % 2 == 0)){

        hasil = angkaPertama + angkaKedua;
    
    }else{

        hasil = angkaPertama * angkaKedua;
    }

    printf("Hasilnya adalah = %d", hasil);

    return 0;
}