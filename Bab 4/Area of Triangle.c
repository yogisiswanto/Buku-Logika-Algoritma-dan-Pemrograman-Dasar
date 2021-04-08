#include <stdio.h>

int main(){

    int a;
    int t;
    int l;

    printf("Masukan alas dan tinggi lalu tekan enter untuk setiap angka\n");

    scanf("%d", &a);
    scanf("%d", &t);

    l = 0.5 * (float)a * (float)t;

    printf("%d", l);
    
    return 0;
}