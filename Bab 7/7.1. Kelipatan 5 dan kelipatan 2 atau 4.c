#include <stdio.h>

int main(){

    int bilangan;

    printf("Masukan bilangan: \n");

    scanf("%d", &bilangan);

    if(((bilangan % 5 == 0) && (bilangan % 2 == 0)) || (bilangan % 4 == 0)){

        printf("kelipatan 5 dan 2 atau 4\n");
    }

    return 0;
}