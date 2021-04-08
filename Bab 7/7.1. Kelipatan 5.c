#include <stdio.h>

int main(){

    int bilangan;

    printf("Masukan bilangan: \n");

    scanf("%d", &bilangan);

    if(bilangan % 5 == 0){

        printf("kelipatan 5\n");
    }

    return 0;
}