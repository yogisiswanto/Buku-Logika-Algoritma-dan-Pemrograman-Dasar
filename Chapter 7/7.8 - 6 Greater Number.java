/*
 *  Name Program    : Greater Number
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
        int angkaPertama, angkaKedua, angkaKetiga;

        Scanner sc = new Scanner(System.in);

        angkaPertama = 0;
        angkaKedua = 0;
        angkaKetiga = 0;

        System.out.println("Masukan ketiga bilangan");

        // Get input from console
        /* 
            Example
            1
            2
            3
        */
        try{

            angkaPertama = sc.nextInt();
            angkaKedua = sc.nextInt();
            angkaKetiga = sc.nextInt();

        }catch(Exception e){

        }

        // Condition when first number is greater second number, and second number is greater third number
        if((angkaPertama > angkaKedua) && (angkaKedua > angkaKetiga)){

            System.out.println("Angka Pertama paling besar");
        
        // Condition when second number is greater first number, and first number is greater third number
        }else if((angkaKedua > angkaPertama) && (angkaPertama > angkaKetiga)){

            System.out.println("Angka Kedua paling besar");

        // Condition when third number is greater first number, and third number is greater second number
        }else if((angkaKetiga > angkaPertama) && (angkaKetiga > angkaKedua)){

            System.out.println("Angka Ketiga paling besar");
        
        // alternate condition
        }else{

            System.out.println("Ada dua atau tiga masukan memiliki nilai sama");
        }

    }
}