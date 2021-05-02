/*
 *  Name Program    : Right Triangle
 *  Purpose         : Answer question from exercise Chapter 7 from Logic Algorithm and Basic Programming Book
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
        int alas, tinggi, sisiMiring;

        Scanner sc = new Scanner(System.in);

        alas = 0;
        tinggi = 0;
        sisiMiring = 0;

        System.out.println("Masukan alas, tinggi, sisi miring dari segitiga, tekan enter setiap memasukan angka");

        // Get input from console
        /* 
            Example
            3
            4
            5
        */
        try{

            alas = sc.nextInt();
            tinggi = sc.nextInt();
            sisiMiring = sc.nextInt();

        }catch(Exception e){

        }

        // Condition when square of sisi miring equals with square of alas plus square of tinggi
        if((sisiMiring * sisiMiring) == ((alas * alas) + (tinggi * tinggi))){

            System.out.println("Segitiga siku-siku");
        
        // another condition
        }else{

            System.out.println("Bukan Segitiga siku-siku");
        }

    }
}