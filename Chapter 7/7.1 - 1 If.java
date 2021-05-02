/*
 *  Name Program    : If
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
        char nilai = '\0';

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan karakter:");

        // Get input from console
        try{

            nilai = sc.next().charAt(0);
        
        }catch(Exception e){

        }

        // Condition when nilai is equal with A, or B, or C
        if((nilai == 'A') || (nilai == 'B') || (nilai == 'C')){
                
            System.out.println("lulus");
        }
    }
}