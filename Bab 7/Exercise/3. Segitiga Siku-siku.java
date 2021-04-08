import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int alas, tinggi, sisiMiring;

        System.out.println("Masukan alas, tinggi, sisi miring dari segitiga, tekan enter setiap memasukan angka");

        Scanner sc = new Scanner(System.in);

        try{

            alas = sc.nextInt();
            tinggi = sc.nextInt();
            sisiMiring = sc.nextInt();

        }catch(Exception e){

        }

        if((sisiMiring * sisiMiring) == ((alas * alas) + (tinggi * tinggi))){

            System.out.println("Segitiga siku-siku");
        
        }else{

            System.out.println("Bukan Segitiga siku-siku");
        }

    }
}