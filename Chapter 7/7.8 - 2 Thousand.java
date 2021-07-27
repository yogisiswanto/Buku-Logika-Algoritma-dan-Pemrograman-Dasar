/*
 *  Name Program    : Thousand
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
        int a, b, c;
        boolean tanda;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan 3 angka lalu tekan enter setiap setelah memasukan 1 huruf");

        // Get input from console
        /* 
            Example
            1000
            2000
            3000
        */
        try{

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
    
        }catch(Exception e){
        }

        // Variable inisialize
        tanda = false;

        // Check a is greater than 999 and less than 10000
        if((a > 999) && (a < 10000)){

            // Check b is greater than 999 and less than 10000
            if((b > 999) && (b < 10000)){

                // Check c is greater than 999 and less than 10000
                if((c > 999) && (c < 10000)){
                    
                    tanda = true;
                }
            }  
        }
    
    // Condition when tanda is equal with 1
    if(tanda == true){

        System.out.println("Semua angka masukan adalah ribuan");
    
    // Alternate condition
    }else{

        System.out.println("Tidak semua angka masukan adalah ribuan");
    }
    }
}