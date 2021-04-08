#include <stdio.h>

int main(){

    int firstInput, secondInput, add, substraction, multiplication, divide;

    printf("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan\n");

    scanf("%d", &firstInput);
    scanf("%d", &secondInput);

    add = firstInput + secondInput;
    substraction = firstInput - secondInput;
    multiplication = firstInput * secondInput;

    if(secondInput != 0){

        divide = firstInput / secondInput;
    
    }else{
        
        divide = 0;
        printf("Pembagi adalah 0\n");
    }

    printf("Pertambahan = %d\n", add);
    printf("Pengurangan = %d\n", substraction);
    printf("Perkalian = %d\n", multiplication);
    printf("Pembagian = %d\n", divide);

    return 0;
}