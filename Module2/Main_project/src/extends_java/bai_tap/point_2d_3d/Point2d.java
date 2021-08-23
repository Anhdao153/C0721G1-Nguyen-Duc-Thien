package extends_java.bai_tap.point_2d_3d;

import java.util.Arrays;

class Point2d{
    float x;
    float y;
    public Point2d(){
    }
    public Point2d(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY() {
        float[] XY=new float[2];
        XY[0]=this.x;
        XY[1]=this.y;
        return XY;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                ", XY=" + Arrays.toString(this.getXY()) +
                '}';
    }
}
