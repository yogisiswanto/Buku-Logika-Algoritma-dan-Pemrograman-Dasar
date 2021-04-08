#include <stdio.h>

int main(){

    int sisiPertama, sisiKedua, sisiKetiga;

    printf("Masukan ketiga sisi\n");
    scanf("%d", &sisiPertama);
    scanf("%d", &sisiKedua);
    scanf("%d", &sisiKetiga);
    
    if((sisiPertama == sisiKedua) && (sisiKedua == sisiKetiga)){

        printf("Termasuk kubus\n");
    
    }else{

        printf("Bukan termasuk kubus\n");
    }

    return 0;
}