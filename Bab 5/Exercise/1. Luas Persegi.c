#include <stdio.h>

int main(){

    int luas, panjang, lebar;

    printf("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan\n");

    scanf("%d", &panjang);
    scanf("%d", &lebar);

    luas = panjang * lebar;

    printf("Luas Persegi = %d\n", luas);

    return 0;
}