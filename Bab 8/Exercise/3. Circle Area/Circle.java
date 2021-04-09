class Circle{

	private int r;

	Circle(){

	}

	public void setR(int r){
		this.r = r;
	}

	public int getR(){
		return this.r;
	}

	public double getArea(){
		return 3.14 * this.r * this.r;
	}
}