/*
 *  Name Program    : Class Matrix
 *  Purpose         : Try Code from Logic Algorithm and Basic Programming Book chapter 11
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 29th September 2021
 *  Language        : Java Language
 * 
 *  Input
 * 	-----
 *  2
 *  2
 * 
 * 	Output
 * 	------
 *    Putih    Hijau  
 *    Putih    Putih
 */

import java.util.Scanner;

// Class pixel inisialization
class Pixel{

    // inisialization attribute
    private int red;
    private int green;
    private int blue;

    // Constructor
    Pixel() {

    }

    // Method for set red value
    void setRed(int red){
        
        this.red = red;
    }

    // Method for set green value
    void setGreen(int green){
        
        this.green = green;
    }

    // Method for set blue value
    void setBlue(int blue){
        
        this.blue = blue;
    }

    // Method to get red value
    int getRed(){

        return this.red;
    }

    // Method to get green value
    int getGreen(){

        return this.green;
    }

    // Method to get blue value
    int getBlue(){

        return this.blue;
    }
}

public class Main{

	// Main function
	public static void main(String[] args) {
		
		// Variable declaration & inisialization
        int row = 0, column = 0, incrementRow = 0, incrementColumn = 0;

		// Variable instantiation
		Scanner sc = new Scanner(System.in);

        // Get input from console
        try{

            row = sc.nextInt();
            column = sc.nextInt();

        }catch(Exception e){

        }

        // Class Pixel instantiation
        Pixel pixelArray[][] = new Pixel[row][column];

        // Instantiation pixel matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                pixelArray[incrementRow][incrementColumn] = new Pixel();
            }
        }

        // Inisialization pixel matrix
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                pixelArray[incrementRow][incrementColumn].setRed(255);
                pixelArray[incrementRow][incrementColumn].setGreen(255);
                pixelArray[incrementRow][incrementColumn].setBlue(255);
            }
        }

        // Inisialization pixel matrix on ordo 0,1
        pixelArray[0][1].setRed(0);
        pixelArray[0][1].setGreen(255);
        pixelArray[0][1].setBlue(0);

        // Print pixel matrix value
        for (incrementRow = 0; incrementRow < row; incrementRow++){
            
            for (incrementColumn = 0; incrementColumn < column; incrementColumn++){
                
                // Condition when pixel matrix on current ordo are colors equal with 255
                if ((pixelArray[incrementRow][incrementColumn].getRed() == 255) && (pixelArray[incrementRow][incrementColumn].getGreen() == 255) && (pixelArray[incrementRow][incrementColumn].getBlue()== 255)) {

                    System.out.print("  Putih  ");

                }

                // Condition when pixel matrix on current ordo is red color equal with 0 and green color is equal with 255 and blue color is equal with 0
                else if ((pixelArray[incrementRow][incrementColumn].getRed() == 0) && (pixelArray[incrementRow][incrementColumn].getGreen() == 255) && (pixelArray[incrementRow][incrementColumn].getBlue() == 0)) {
                    
                    System.out.print("  Hijau  ");
                }

            }

            System.out.println();
            
        }
	}
}