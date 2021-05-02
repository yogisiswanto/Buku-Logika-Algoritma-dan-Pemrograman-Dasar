/*
 *  Name Program    : Even
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
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
        int bilangan = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan bilangan:");

        // Get input from console. Example 2
        try{

            bilangan = sc.nextInt();
        
        }catch(Exception e){

        }

        // Condition when input is even
        if(bilangan % 2 == 0){
                
            System.out.println("bilangan genap");
        }
    }
}