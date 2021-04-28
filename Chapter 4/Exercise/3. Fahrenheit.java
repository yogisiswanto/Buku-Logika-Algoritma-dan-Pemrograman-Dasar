/*
 *  Name Program    : Fahrenheit
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
        int celcius = 0;
        int fahrenheit = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan derajat celcius");
        
        // Get input from console. Example = 5
        try{
            
            celcius = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate from celcius to fahrenheit
        fahrenheit = ((9 * celcius) / 5) + 32;
        
        // Print to console
        System.out.println(fahrenheit);

    }
}