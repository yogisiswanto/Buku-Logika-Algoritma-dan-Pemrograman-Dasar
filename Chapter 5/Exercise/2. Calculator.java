/*
 *  Name Program    : Calculator
 *  Purpose         : Answer question from exercise Chapter 5 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable declaration and inisialization
        int firstInput = 0, secondInput = 0, add = 0, substraction = 0, multiplication = 0, divide = 0;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan");
        
        // Get input from console
        try{
            
            firstInput = sc.nextInt();
            secondInput = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate input
        add = firstInput + secondInput;
        substraction = firstInput - secondInput;
        multiplication = firstInput * secondInput;

        if(secondInput != 0){

            divide = firstInput / secondInput;
        
        }else{
            
            divide = 0;
            System.out.println("Pembagi adalah 0\n");
        }
        
        // Print to console
        System.out.println("Pertambahan = " + add);
        System.out.println("Pengurangan = " + substraction);
        System.out.println("Perkalian = " + multiplication);
        System.out.println("Pembagian = " + divide);

    }
}