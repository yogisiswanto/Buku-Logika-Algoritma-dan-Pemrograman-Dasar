import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int angkaPertama, angkaKedua, angkaKetiga;

        System.out.println("Masukan dua buah bilangan bulat lalu tekan enter untuk setiap angkanya");

        Scanner sc = new Scanner(System.in);

        try{

            angkaPertama = sc.nextInt();
            angkaKedua = sc.nextInt();
            angkaKetiga = sc.nextInt();

        }catch(Exception e){

        }

        
        if((angkaPertama > angkaKedua) && (angkaKedua > angkaKetiga)){

            System.out.println("Angka Pertama paling besar");
        
        }else if((angkaKedua > angkaPertama) && (angkaPertama > angkaKetiga)){

            System.out.println("Angka Kedua paling besar");

        }else if((angkaKetiga > angkaPertama) && (angkaKetiga > angkaKedua)){

            System.out.println("Angka Ketiga paling besar");
        
        }else{

            System.out.println("Ada dua atau tiga masukan memiliki nilai sama");
        }

    }
}