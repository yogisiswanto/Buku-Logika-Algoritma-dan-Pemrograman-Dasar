/*
 *  Name Program    : Ganjil atau Genap
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 20th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable instantiation
        int angkaPertama, angkaKedua, hasil;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan dua buah bilangan bulat lalu tekan enter untuk setiap angkanya");

        // Get input from console
        try{

            angkaPertama = sc.nextInt();
            angkaKedua = sc.nextInt();

        }catch(Exception e){

        }

        // Condition when first number is even and second number is even, then both number will be add each other
        if((angkaPertama % 2 == 0) && (angkaKedua % 2 == 0)){

            hasil = angkaPertama + angkaKedua;
        
        // Condition when first number is odd and second number is odd, then both number will be multiple each other
        }else{

            hasil = angkaPertama * angkaKedua;
        }

        // Print to console
        System.out.println("Hasilnya adalah = " + hasil);
    }
}