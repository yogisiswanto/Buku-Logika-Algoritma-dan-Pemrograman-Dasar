import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        String[] input = new String[5];

        System.out.println("Masukan lima buah karakter satu persatu, tekan enter setiap selesai memasukkan");

        Scanner sc = new Scanner(System.in);

        try{
            
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            input[2] = sc.nextInt();
            input[3] = sc.nextInt();
            input[4] = sc.nextInt();
        
        }catch(Exception e){

        }

        System.out.println("Kata ke 1 = " + input[0]);
        System.out.println("Kata ke 2 = " + input[1]);
        System.out.println("Kata ke 3 = " + input[2]);
        System.out.println("Kata ke 4 = " + input[3]);
        System.out.println("Kata ke 5 = " + input[4]);
    }
}