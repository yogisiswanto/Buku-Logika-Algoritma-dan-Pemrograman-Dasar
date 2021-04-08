import java.util.Scanner;

public class Main{

    public static void main(String[] args){

    int celcius;
    int fahrenheit;

    System.out.println("Masukan derajat celcius");

    Scanner sc = new Scanner(System.in);

    try{
        
        celcius = sc.nextInt();
    
    }catch(Exception e){

    }

    fahrenheit = ((9 * celcius) / 5) + 32;
    
    System.out.println(fahrenheit);

    }
}