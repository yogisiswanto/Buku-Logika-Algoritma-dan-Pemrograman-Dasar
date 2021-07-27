/*
 *  Name Program    : Integer
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
        int[] input = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan lima buah angka satu persatu, tekan enter setiap selesai memasukkan");

        // Get input from console
        /* 
            Example
            1
            2
            3
            4
            5
        */
        try{
            
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            input[2] = sc.nextInt();
            input[3] = sc.nextInt();
            input[4] = sc.nextInt();
        
        }catch(Exception e){

        }

        // Print to console
        System.out.println("Angka ke 1 = " + input[0]);
        System.out.println("Angka ke 2 = " + input[1]);
        System.out.println("Angka ke 3 = " + input[2]);
        System.out.println("Angka ke 4 = " + input[3]);
        System.out.println("Angka ke 5 = " + input[4]);
    }
}