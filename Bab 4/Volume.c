#include <stdio.h>

int main(){

    int p;
    int l;
    int t;
    int v;

    printf("Masukan panjang, lebar, tinggi lalu tekan enter untuk setiap angka\n");

    scanf("%d", &p);
    scanf("%d", &l);
    scanf("%d", &t);

    v = p * l * t;

    printf("%d", v);
    
    return 0;
}