/*
 *  Name Program    : Class Example 1
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 3
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 14th April 2021
 *  Language        : Java Language
 */

public class Titik{

    // Variable instantiation
    private float x;
    private float y;

    // Constructor
    Titik(){

    }

    // Method to assignment x
    public void setX(float x){

        this.x = x;
    }

    // Method to get x
    public float getX(){

        return this.x;
    }

    // Method to assignment y
    public void setY(float y){

        this.y = y;
    }

    // Method to get x
    public float getY(){

        return this.y;
    }
}

public class Main{

    // Main function
    public static void main(String[] args){

        // Class inisialization
        Titik p1 = new Titik();

        // Class inisialization
        p1.setX(0);
        p1.setY(0);
    }
}