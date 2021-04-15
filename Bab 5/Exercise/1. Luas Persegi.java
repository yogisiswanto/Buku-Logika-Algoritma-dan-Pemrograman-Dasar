/*
 *  Name Program    : Luas Persegi
 *  Purpose         : Answer question from exercise Chapter 5 from Logic Algorithm and Basic Programming Book
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
        int luas, panjang, lebar;

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan dua angka satu persatu, tekan enter setiap selesai memasukkan");
        
        // Get input from console
        try{
            
            panjang = sc.nextInt();
            lebar = sc.nextInt();
        
        }catch(Exception e){

        }

        // Calculate large of square
        luas = panjang * lebar;
        
        // Print to console
        System.out.println("Luas Persegi = " + luas);

    }
}