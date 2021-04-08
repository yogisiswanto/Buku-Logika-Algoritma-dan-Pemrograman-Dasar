Class Titik{

    double x;
    double y;
    
    Titik(){

    }

    void setX(double x){
    
        this.x = x;
    }

    double getX(){
    
        return x;
    }

    void setY(double y){
    
        this.y = y;
    }

    double getY(){
    
        return y;
    }
}

public class Main{

    public static void main(String[] args){

        Titik[] ikatan_titik = new Titik[2];

        ikatan_titik[0] = new Titik();

        ikatan_titik[0].x = 9;
    }
}