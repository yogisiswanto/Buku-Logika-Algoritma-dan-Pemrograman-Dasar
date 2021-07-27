/*
 *  Name Program    : Trapesium
 *  Purpose         : Answer question from exercise Chapter 4 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable declaration & inisialization
        int alas = 0;
        int atas = 0;
        int tinggi = 0;
        double luas = 0;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan sisi alas, sisi atas, tinggi satu persatu, lalu tekan enter");

        // Get input from console
        /* 
            Example
            2
            3
            4
         */
        try{
            
            alas = sc.nextInt();
            atas = sc.nextInt();
            tinggi = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate area of trapesium
        luas = 0.5 * (alas + atas) * tinggi;
        
        // Print to console
        System.out.println(luas);

    }
}