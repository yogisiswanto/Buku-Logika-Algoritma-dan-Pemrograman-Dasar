import java.lang.Math;

class Triangle{

	private int x;
	private int y;

	Triangle(){

	}

	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return this.x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getY(){
		return this.y;
	}

	public double getR(){
		return Math.sqrt((this.x * this.x) + (this.y * this.y));
	}
}