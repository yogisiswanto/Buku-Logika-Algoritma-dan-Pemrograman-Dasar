/*
 *  Name Program    : Hitung Lembur
 *  Purpose         : Answer question from exercise Chapter 7 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 19th April 2021
 *  Language        : Java Language
 */

import java.util.Scanner;

public class Main{

    // Main function
    public static void main(String[] args){

        // Variable declaration
        int jamLembur;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Jam Lembur");

        // Get input from console
        try{

            jamLembur = sc.nextInt();

        }catch(Exception e){

        }
    
        // Condition when jam lembur less than 12 hour
        if(jamLembur < 12){

            System.out.println("Gaji Lembur sebesar Rp. 100.000\n");
        
        // Condition when jam lembur equals with 12 hour
        }else if(jamLembur == 12){

            System.out.println("Gaji Lembur sebesar Rp. 200.000\n");
        
        // Condition when jam lembur greater than 12 hour
        }else{

            System.out.println("Gaji Lembur sebesar Rp. 300.000\n");
        }

    }
}