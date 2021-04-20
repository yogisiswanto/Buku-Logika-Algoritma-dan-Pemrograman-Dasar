/*
 *  Name Program    : Mini Kalkulator
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

        // Variable declaration
        int angkaPertama, angkaKedua, hasil, menu;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan dua buah angka, untuk setiap angka tekan enter");

        // Get input from console
        try{

            angkaPertama = sc.nextInt();
            angkaKedua = sc.nextInt();

        }catch(Exception e){

        }

        System.out.println("Menu:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");

        try{

            menu = sc.nextInt();

        }catch(Exception e){

        }

        // Sanitize input
        if((menu >= 1) && (menu <= 3)){

            switch(menu){

                // Condition when menu is equal with 1
                case 1 : {
                    
                    hasil = angkaPertama + angkaKedua;
                    break;
                }

                // Condition when menu is equal with 2
                case 2 : {

                    hasil = angkaPertama - angkaKedua;
                    break;
                }

                // Condition when menu is equal with 3
                case 3 : {

                    hasil = angkaPertama * angkaKedua;
                    break;
                }
            }
        
        // Condition when menu is not in list
        }else{

            hasil = 0;
            System.out.println("Menu tidak valid\n");
        }

        // Print to console
        System.out.println(hasil);
    }
}