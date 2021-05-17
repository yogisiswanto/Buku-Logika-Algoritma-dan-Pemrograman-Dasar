/*
 *  Name Program    : Triangle
 *  Purpose         : Answer question from exercise Chapter 8 from Logic Algorithm and Basic Programming Book
 *  Author          : Yogi Siswanto
 *  Email           : yogisiswanto.c2@gmail.com
 *  Date Created    : 9th May 2021
 *  Language        : Java Language
 */

import java.lang.Math;

class Triangle{

	// Variable declaration
	private int x;
	private int y;

	// Constructor
	Triangle(){

	}

	// Method to assignment x
	public void setX(int x){
		this.x = x;
	}

	// Method to get x
	public int getX(){
		return this.x;
	}

	// Method to assignment y
	public void setY(int y){
		this.y = y;
	}

	// Method to get y
	public int getY(){
		return this.y;
	}

	// Method to get r
	public double getR(){
		return Math.sqrt((this.x * this.x) + (this.y * this.y));
	}
}