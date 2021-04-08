import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int angkaPertama, angkaKedua, hasil;

        System.out.println("Masukan dua buah bilangan bulat lalu tekan enter untuk setiap angkanya");

        Scanner sc = new Scanner(System.in);

        try{

            angkaPertama = sc.nextInt();
            angkaKedua = sc.nextInt();

        }catch(Exception e){

        }

        if((angkaPertama % 2 == 0) && (angkaKedua % 2 == 0)){

            hasil = angkaPertama + angkaKedua;
        
        }else{

            hasil = angkaPertama * angkaKedua;
        }

        System.out.println("Hasilnya adalah = " + hasil);
    }
}