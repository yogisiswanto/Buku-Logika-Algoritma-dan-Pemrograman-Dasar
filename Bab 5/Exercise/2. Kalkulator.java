import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        int firstInput, secondInput, add, substraction, multiplication, divide;

        System.out.println("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan");

        Scanner sc = new Scanner(System.in);

        try{
            
            firstInput = sc.nextInt();
            secondInput = sc.nextInt();
        
        }catch(Exception e){

        }

        add = firstInput + secondInput;
        substraction = firstInput - secondInput;
        multiplication = firstInput * secondInput;

        if(secondInput != 0){

            divide = firstInput / secondInput;
        
        }else{
            
            divide = 0;
            System.out.println("Pembagi adalah 0\n");
        }
        
        System.out.println("Pertambahan = " + add);
        System.out.println("Pengurangan = " + substraction);
        System.out.println("Perkalian = " + multiplication);
        System.out.println("Pembagian = " + divide);

    }
}