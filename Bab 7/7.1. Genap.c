#include <stdio.h>

int main(){

    int bilangan;

    printf("Masukan bilangan: \n");

    scanf("%d", &bilangan);

    if(bilangan % 2 == 0){

        printf("bilangan genap\n");
    }

    return 0;
}