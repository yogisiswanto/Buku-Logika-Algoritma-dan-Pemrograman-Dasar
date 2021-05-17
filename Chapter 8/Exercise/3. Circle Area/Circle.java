/*
 *  Name Program    : Triangle
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 9th May 2021
 *  Language        : Java Language
 */

class Circle{

	// Variable declaration
	private int r;

	// Constructor
	Circle(){

	}

	// Method to assignment x
	public void setR(int r){
		this.r = r;
	}

	// Method to get x
	public int getR(){
		return this.r;
	}

	// Method to get circle area
	public double getArea(){
		return 3.14 * this.r * this.r;
	}
}