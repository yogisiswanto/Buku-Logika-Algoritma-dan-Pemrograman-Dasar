/*
 *  Name Program    : Mini Calculator
  *  Purpose        : Answer question from exercise Chapter 7 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 19th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable declaration
        int angkaPertama, angkaKedua, hasil, menu;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        angkaPertama = 0;
        angkaKedua = 0;
        hasil = 0;
        menu = 0;

        System.out.println("Masukan dua buah angka, untuk setiap angka tekan enter");

        // Get input from console
        /* 
            Example
            2
            2
        */
        try{

            angkaPertama = sc.nextInt();
            angkaKedua = sc.nextInt();

        }catch(Exception e){

        }

        System.out.println("Menu:");
        System.out.println("1. Tambah");
        System.out.println("2. Kali");
        System.out.println("3. Kurang");

        // Get input from console
        try{

            menu = sc.nextInt();

        }catch(Exception e){

        }

        // Sanitize input
        if((menu >= 1) && (menu <= 3)){

            switch(menu){

                // Condition when menu is equals with 1
                case 1 : {
                    
                    hasil = angkaPertama + angkaKedua;
                    break;
                }

                // Condition when menu is equals with 2
                case 2 : {

                    hasil = angkaPertama * angkaKedua;
                    break;
                }

                // Condition when menu is equals with 3
                case 3 : {

                    hasil = angkaPertama - angkaKedua;
                    break;
                }
            }
        
        // Condition when input is not sanitize
        }else{

            hasil = 0;
            System.out.println("Menu tidak valid\n");
        }

        // Print to console
        System.out.println(hasil);


    }
}