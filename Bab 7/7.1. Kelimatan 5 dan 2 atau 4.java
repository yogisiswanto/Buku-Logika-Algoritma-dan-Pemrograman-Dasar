import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int bilangan = 0;

        System.out.println("masukkan bilangan:");

        Scanner sc = new Scanner(System.in);

        try{

            bilangan = sc.nextInt();
        
        }catch(Exception e){

            if(((bilangan % 5 == 0) && (bilangan % 2 == 0)) || (bilangan % 4 == 0)){
                
                System.out.println("kelipatan 5 dan 2 atau 4");
            }
        }
    }
}