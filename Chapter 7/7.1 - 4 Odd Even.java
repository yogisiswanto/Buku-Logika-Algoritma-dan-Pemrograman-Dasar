/*
 *  Name Program    : Odd Even
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 7
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 2nd Mei 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable declaration & inisialization
        int bilangan = 0;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan bilangan: ");

        // Get input from console. Example 2 or 3
        try{

            bilangan = sc.nextInt();
    
        }catch(Exception e){
        }

        // Condition when input is odd
        if(bilangan % 2 == 1){

            System.out.println("bilangan ganjil");
        
        // Condition when input is even
        }else{

            System.out.println("bilangan genap");
        }
    }
}