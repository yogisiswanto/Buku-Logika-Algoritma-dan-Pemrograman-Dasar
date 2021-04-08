import java.util.Scanner;

public class Main{

    public static void main(String[] args){

    int a;
    int b;
    int c;

    System.out.println("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan");

    Scanner sc = new Scanner(System.in);

    try{
        
        a = sc.nextInt();
    
    }catch(Exception e){

    }

    try{
        
        b = sc.nextInt();
    
    }catch(Exception e){

    }

    c = a + b;
    
    System.out.println(c);

    }
}