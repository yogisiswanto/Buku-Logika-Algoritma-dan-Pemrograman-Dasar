/*
 *  Name Program    : Class Example 2
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 3
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 14th April 2021
 *  Language        : Java Language
 */

public class Pukul{

    // Variable declaration
    private int jam;
    private int menit;
    private int detik;

    // Constructor
    Pukul(){

    }

    // Method to assignment jam
    public void setJam(int jam){

        this.jam = jam;
    }

    // Method to get jam
    public float getJam(){

        return this.jam;
    }

    // Method to assignment menit
    public void setMenit(int menit){

        this.menit = menit;
    }

    // Method to get menit
    public float getMenit(){

        return this.menit;
    }

    // Method to assignment detik
    public void setDetik(int detik){

        this.detik = detik;
    }

    // Method to get detik
    public float getDetik(){

        return this.detik;
    }
}