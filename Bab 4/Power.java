import java.util.Scanner;

public class Main{

    public static void main(String[] args){

    int a;
    int b;

    System.out.println("Masukan angka, lalu tekan enter");

    Scanner sc = new Scanner(System.in);

    try{
        
        a = sc.nextInt();
    
    }catch(Exception e){

    }

    b = a * a;
    
    System.out.println(b);

    }
}