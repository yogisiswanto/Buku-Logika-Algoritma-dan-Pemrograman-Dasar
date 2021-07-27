/*
 *  Name Program    : Karakter
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

        // Variable instantiation
        char[] input = new char[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan lima buah karakter satu persatu, tekan enter setiap selesai memasukkan");

        // Get input from console
        /* 
            Example
            a
            b
            c
            d
            e
            f
        */
        try{
            
            input[0] = sc.next().charAt(0);
            input[1] = sc.next().charAt(0);
            input[2] = sc.next().charAt(0);
            input[3] = sc.next().charAt(0);
            input[4] = sc.next().charAt(0);
        
        }catch(Exception e){

        }

        // Print to console
        System.out.println("Karakter ke 1 = " + input[0]);
        System.out.println("Karakter ke 2 = " + input[1]);
        System.out.println("Karakter ke 3 = " + input[2]);
        System.out.println("Karakter ke 4 = " + input[3]);
        System.out.println("Karakter ke 5 = " + input[4]);
    }
}