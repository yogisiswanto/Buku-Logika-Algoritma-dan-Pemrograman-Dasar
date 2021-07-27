/*
 *  Name Program    : Depend On
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
        int hari = 0;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        // Get input from console. Example 7
        try{

            hari = sc.nextInt();
        
        }catch(Exception e){

        }

        switch(hari){

            // Condition when hari is equal with 1
            case 1 :
                System.out.println("Hari Senin");
            break;
            
            // Condition when hari is equal with 2
            case 2 :
                System.out.println("Hari Selasa");
            break;
            
            // Condition when hari is equal with 3
            case 3 :
                System.out.println("Hari Rabu");
            break;

            // Condition when hari is equal with 4
            case 4 :
                System.out.println("Hari Kamis");
            break;

            // Condition when hari is equal with 5
            case 5 :
                System.out.println("Hari Jum'at");
            break;

            // Condition when hari is equal with 6
            case 6 :
                System.out.println("Hari Sabtu");
            break;
            
            // Condition when hari is equal with 7
            case 7 :
                System.out.println("Hari Ahad");
            break;

            // Condition when hari is not in the list
            default :
                System.out.println("Tidak ada hari ke - " + hari);
            break;
        }
    }
}