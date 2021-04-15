/*
 *  Name Program    : Area of Triangle
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
        int t;
        int l;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan alas dan tinggi lalu tekan enter untuk setiap angka");
       
        // Get input from console
        try{
            
            a = sc.nextInt();
            t = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate area of triangle
        l = 0.5 * (float)a * (float)t;
        
        // Print to console
        System.out.println(l);

    }
}