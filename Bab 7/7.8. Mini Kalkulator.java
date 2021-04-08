import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int angkaPertama, angkaKedua, hasil, menu;

        System.out.println("Masukan dua buah angka, untuk setiap angka tekan enter");

        Scanner sc = new Scanner(System.in);

        try{

            angkaPertama = sc.nextInt();
            angkaKedua = sc.nextInt();

        }catch(Exception e){

        }

        System.out.println("Menu:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");

        try{

            menu = sc.nextInt();

        }catch(Exception e){

        }

        
        if((menu >= 1) && (menu <= 3)){

            switch(menu){

                case 1 : {
                    
                    hasil = angkaPertama + angkaKedua;
                    break;
                }

                case 2 : {

                    hasil = angkaPertama - angkaKedua;
                    break;
                }

                case 3 : {

                    hasil = angkaPertama * angkaKedua;
                    break;
                }
            }
        
        }else{

            hasil = 0;
            System.out.println("Menu tidak valid\n");
        }

        System.out.println(hasil);


    }
}