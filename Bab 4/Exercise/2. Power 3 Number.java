/*
 *  Name Program    : Power 3 Number
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 3
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
        int a;
        int b;
        int c;
        int d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan tiga angka satu persatu, lalu tekan enter setelahnya");
        
        // Get input from console
        try{
            
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate Sum 3 Number
        d = a * b * c;
        
        // Print to console
        System.out.println(d);

    }
}