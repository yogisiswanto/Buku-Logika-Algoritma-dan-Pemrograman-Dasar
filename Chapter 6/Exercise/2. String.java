/*
 *  Name Program    : String
 *  Purpose         : Answer question from exercise Chapter 6 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable declaration
        String[] input = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan lima buah karakter satu persatu, tekan enter setiap selesai memasukkan");

        // Get input from console
        /* 
            Example
            aku
            adalah
            anak
            gembala
            selalu
        */
        try{
            
            input[0] = sc.next();
            input[1] = sc.next();
            input[2] = sc.next();
            input[3] = sc.next();
            input[4] = sc.next();
        
        }catch(Exception e){

        }

        // Print to console
        System.out.println("Kata ke 1 = " + input[0]);
        System.out.println("Kata ke 2 = " + input[1]);
        System.out.println("Kata ke 3 = " + input[2]);
        System.out.println("Kata ke 4 = " + input[3]);
        System.out.println("Kata ke 5 = " + input[4]);
    }
}