/*
 *  Name Program    : Volume
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
        int p;
        int l;
        int t;
        int v;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan panjang, lebar, tinggi lalu tekan enter untuk setiap angka");
       
        // Get input from console
        try{
            
            p = sc.nextInt();
            l = sc.nextInt();
            t = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate volume
        v = p * l * t;
        
        // Print to console
        System.out.println(v);

    }
}