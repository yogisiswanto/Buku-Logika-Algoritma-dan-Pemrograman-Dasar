/*
 *  Name Program    : Sum
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
        int a = 0;
        int b = 0;
        int c = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan");

        // Get input from console
        try{
            
            a = sc.nextInt(); // Example = 2
            b = sc.nextInt(); // Example = 3
        
        }catch(Exception e){

        }

        // Calculate sum
        c = a + b;
        
        // Print to console
        System.out.println(c);

    }
}