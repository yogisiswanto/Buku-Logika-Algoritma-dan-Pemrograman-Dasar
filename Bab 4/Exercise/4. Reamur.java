import java.util.Scanner;

public class Main{

    public static void main(String[] args){

    int celcius;
    int reamur;

    System.out.println("Masukan derajat celcius");

    Scanner sc = new Scanner(System.in);

    try{
        
        celcius = sc.nextInt();
    
    }catch(Exception e){

    }

    reamur = (4 * celcius) / 5;
    
    System.out.println(reamur);

    }
}