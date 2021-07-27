/*
 *  Name Program    : Multiple of 3
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

        // Variable declaration & inisialization
        double a = 0;
        int depan = 0, belakang = 0;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan bilangan riil");
        
        // Get input from console. Example 1.33
        try{

            a = sc.nextDouble();

        }catch(Exception e){

        }

        // Convert float to integer
        depan = (int) a;

        // Get number after decimal point
        belakang = (int) (a - depan) * 100;

        // Condition when front number is multiple of 3 and back number is multiple of 3
        if((depan % 3 == 0) && (belakang % 3 == 0)){

            System.out.println("Memenuhi syarat");
        
        // Alternate condition
        }else{

            System.out.println("Tidak memenuhi syarat");
        }

    }
}