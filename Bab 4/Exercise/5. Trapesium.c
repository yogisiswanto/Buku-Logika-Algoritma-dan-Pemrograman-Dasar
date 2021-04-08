#include <stdio.h>

int main(){

    int alas;
    int atas;
    int tinggi;
    int luas;

    printf("Masukan sisi alas, sisi atas, tinggi satu persatu, lalu tekan enter\n");

    scanf("%d", &alas);
    scanf("%d", &atas);
    scanf("%d", &tinggi);

    luas = 0.5 * (alas + atas) * tinggi;

    printf("%d", luas);
    
    return 0;
}