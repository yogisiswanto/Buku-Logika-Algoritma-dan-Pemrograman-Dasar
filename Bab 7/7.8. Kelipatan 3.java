import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        double a = 0;
        int depan = 0, belakang = 0;

        System.out.println("Masukan bilangan riil");

        Scanner sc = new Scanner(System.in);

        try{

            a = sc.nextDouble();

        }catch(Exception e){

        }

        depan = a;
        belakang = (a - depan) * 100;

        if((depan % 3 == 0) && (belakang % 3 == 0)){

            System.out.println("Memenuhi syarat");
        
        }else{

            System.out.println("Tidak memenuhi syarat");
        }

    }
}