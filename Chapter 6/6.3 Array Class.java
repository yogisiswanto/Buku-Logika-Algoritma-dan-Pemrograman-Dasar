/*
 *  Name Program    : Array Class
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 6
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 15th April 2021
 *  Language        : Java Language
 */

//  Class of titik
class Titik{

    // Variable instantiation
    double x;
    double y;
    
    // Constuctor
    Titik(){

    }

    // Method to assignment x
    void setX(double x){
    
        this.x = x;
    }

    // Method to get x
    double getX(){
    
        return x;
    }

    // Method to assignment y
    void setY(double y){
    
        this.y = y;
    }

    // Method to get y
    double getY(){
    
        return y;
    }
}

public class Main{

    // Main function
    public static void main(String[] args){

        // Class Array inisialization
        Titik[] ikatan_titik = new Titik[2];

        // Class Assignment
        ikatan_titik[0] = new Titik();

        // Variable assignment
        ikatan_titik[0].x = 9;
    }
}