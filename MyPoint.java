package day4;

public class MyPoint {
    public int x=0;
    public int y=0;


    public MyPoint(){}
public MyPoint(int x, int y){
    this.x=x;
    this.y=y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(int y){
       return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){
       int[] array ={1,2};
       return array;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

