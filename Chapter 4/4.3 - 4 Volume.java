/*
 *  Name Program    : Volume
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 4
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Volume{

    // Main function
    public static void main(String[] args){

        // Variable instantiation
        int p = 0;
        int l = 0;
        int t = 0;
        int v = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan panjang, lebar, tinggi lalu tekan enter untuk setiap angka");
       
        // Get input from console
        /*
            Example
            2
            3
            4
        */
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