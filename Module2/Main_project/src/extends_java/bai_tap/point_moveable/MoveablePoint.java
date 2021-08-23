package extends_java.bai_tap.point_moveable;

import java.util.Arrays;

public class MoveablePoint extends Point {
    float xSpeed;
    float ySpeed;
public MoveablePoint(){}
public MoveablePoint(float x, float y,float xSpeed, float ySpeed){
    super(x,y);
    this.xSpeed=xSpeed;
    this.ySpeed=ySpeed;
}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
            this.xSpeed=xSpeed;
            this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] XYSpeed=new float[2];
        XYSpeed[0]=xSpeed;
        XYSpeed[1]=ySpeed;
        return XYSpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y + " Speed ARR " + Arrays.toString(getSpeed()) +
                '}';
    }
    public void move(){
    x+=xSpeed;
    y+=ySpeed;

    }
}
