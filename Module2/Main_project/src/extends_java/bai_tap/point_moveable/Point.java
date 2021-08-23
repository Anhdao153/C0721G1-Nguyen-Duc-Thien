package extends_java.bai_tap.point_moveable;

import java.util.Arrays;

public class Point {
    float x;
    float y;
    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    public Point(){

    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public float[] getXY(){
        float []XY=new float[2];
                XY[0]=x;
                XY[1]=y;
                return XY;
    }
    public void setXY(float X, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y + " XY= " + Arrays.toString(getXY()) +
                '}';
    }
}

