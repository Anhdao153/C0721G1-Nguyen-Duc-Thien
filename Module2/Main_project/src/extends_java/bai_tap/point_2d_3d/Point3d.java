package extends_java.bai_tap.point_2d_3d;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3d extends Point2d {

    float z;
    public Point3d(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] XYZ=new float[3];
        XYZ[0]=this.x;
        XYZ[1]=this.y;
        XYZ[2]=this.z;
        return XYZ;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y + " XYZ= "+ Arrays.toString(getXYZ())+
                '}';
    }
}
