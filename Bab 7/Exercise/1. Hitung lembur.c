#include <stdio.h>

int main(){

    int jamLembur;

    printf("Masukan Jam Lembur\n");

    scanf("%d", &jamLembur);

    if(jamLembur < 12){

        printf("Gaji Lembur sebesar Rp. 100.000\n");
    
    }else if(jamLembur == 12){

        printf("Gaji Lembur sebesar Rp. 200.000\n");
    
    }else{

        printf("Gaji Lembur sebesar Rp. 300.000\n");
    }

    return 0;
}