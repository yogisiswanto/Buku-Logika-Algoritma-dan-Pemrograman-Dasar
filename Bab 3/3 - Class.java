public class Titik{

    private float x;
    private float y;

    Titik(){

    }

    public void setX(float x){

        this.x = x;
    }

    public float getX(){

        return this.x;
    }

    public void setY(float y){

        this.y = y;
    }

    public float getY(){

        return this.y;
    }
}

public class Main{

    public static void main(String[] args){

        Titik p1 = new Titik();

        p1.setX(0);

        p1.setY(0);
    }
}