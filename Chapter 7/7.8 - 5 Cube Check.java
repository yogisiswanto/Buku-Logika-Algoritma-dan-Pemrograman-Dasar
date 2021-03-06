/*
 *  Name Program    : Cube Check
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
        int sisiPertama, sisiKedua, sisiKetiga;

        // Variable instantiation
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan ketiga sisi");

        // Get input from console
        /* 
            Example
            2
            2
            2

            or 

            1
            2
            3
        */
        try{

            sisiPertama = sc.nextInt();
            sisiKedua = sc.nextInt();
            sisiKetiga = sc.nextInt();

        }catch(Exception e){

        }

        // Condition when sisi pertama is equal with sisi kedua and sisi kedua is equal with sisi ketiga
        if((sisiPertama == sisiKedua) && (sisiKedua == sisiKetiga)){

            System.out.println("Termasuk kubus");

        // alternate condition
        }else{

            System.out.println("Bukan termasuk kubus");
        }
    }
}