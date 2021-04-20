/*
 *  Name Program    : Kelipatan 5 dan kelipatan 2
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 20th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable instantiation
        int bilangan = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan bilangan:");

        // Get input from console
        try{

            bilangan = sc.nextInt();
        
        }catch(Exception e){

        }

        // Condition when number multiple of 5 and 2
        if((bilangan % 5 == 0) && (bilangan % 2 == 0)){
            
            System.out.println("kelipatan 5 dan 2");
        }
    }
}