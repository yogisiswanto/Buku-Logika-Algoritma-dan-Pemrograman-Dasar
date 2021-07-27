/*
 *  Name Program    : Consonan-Vocal-Consonan
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

        // Variable declaration
        char a, b, c;
        boolean tanda;

        // Variable inisialization
        a = '\0';
        b = '\0';
        c = '\0';

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan 3 huruf lalu tekan enter setiap setelah memasukan 1 huruf");

        // Get input from console
        /* 
            Example
            b
            a
            c
        */ 
        try{

            a = sc.next().charAt(0);
            b = sc.next().charAt(0);
            c = sc.next().charAt(0);
    
        }catch(Exception e){
        }

        // Variable inisialize
        tanda = false;

        // Check Consonan
        if((a != 'a') && (a != 'i') && (a != 'u') && (a != 'e') && (a != 'o')){

            // Check vokal
            if((b != 'a') || (b != 'i') || (b != 'u') || (b != 'e') || (b != 'o')){

                // Chek Consonan
                if((c != 'a') && (c != 'i') && (c != 'u') && (c != 'e') && (c != 'o')){
                
                    tanda = true;
                }
            }  
        }

        // Condition when tanda is equal with 1
        if(tanda == true){

            System.out.println("Konsonan-Vokal-Konsonan");
        
        // Alternate condition
        }else{

            System.out.println("Bukan Konsonan-Vokal-Konsonan");
        }
    }
}