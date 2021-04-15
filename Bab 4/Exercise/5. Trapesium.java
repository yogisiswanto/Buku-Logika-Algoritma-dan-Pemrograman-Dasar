/*
 *  Name Program    : Trapesium
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
        int alas;
        int atas;
        int tinggi;
        int luas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan sisi alas, sisi atas, tinggi satu persatu, lalu tekan enter");

        // Get input from console
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