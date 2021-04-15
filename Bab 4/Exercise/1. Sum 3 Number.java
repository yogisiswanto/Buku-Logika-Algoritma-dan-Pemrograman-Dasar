/*
 *  Name Program    : Sum 3 Number
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

        // Variable instantiation
        int a;
        int b;
        int c;
        int d;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan tiga angka satu persatu, tekan enter setiap selesai memasukkan");

        // Get input from console
        try{
            
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate Sum 3 Number
        d = a + b + c;
        
        // Print to console
        System.out.println(d);

    }
}