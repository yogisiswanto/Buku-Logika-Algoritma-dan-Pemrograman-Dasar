/*
 *  Name Program    : Keyboard Input
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
        int bilBulat = 0;
        Scanner sc = new Scanner(System.in);

        // Get input from console. Example = 5
        try{
            
            bilBulat = sc.nextInt();
        
        }catch(Exception e){

        }

        // Print to console
        System.out.println("bilangan bulat masukan adalah: " + bilBulat);
    }
}