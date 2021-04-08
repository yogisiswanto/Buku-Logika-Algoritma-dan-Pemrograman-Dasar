#include <stdio.h>

int main(){

    double a;
    int depan, belakang;

    printf("Masukan bilangan riil\n");
    scanf("%f", &a);

    depan = a;
    belakang = (a - depan) * 100;

    if((depan % 3 == 0) && (belakang % 3 == 0)){

        printf("Memenuhi syarat\n");
    
    }else{

        printf("Tidak memenuhi syarat\n");
    }

    return 0;
}