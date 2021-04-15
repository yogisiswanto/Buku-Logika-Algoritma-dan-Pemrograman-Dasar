/*
 *  Name Program    : Power
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 4
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

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan angka, lalu tekan enter");
       
        // Get input from console
        try{
            
            a = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate power
        b = a * a;
        
        // Print to console
        System.out.println(b);

    }
}