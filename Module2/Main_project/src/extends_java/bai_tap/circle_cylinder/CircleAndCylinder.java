package extends_java.bai_tap.circle_cylinder;

public class CircleAndCylinder {

    public static void main(String[] args) {
        Circle circle=new Circle(3.5,"blue");
        Cylinder cylinder=new Cylinder(5,3.5,"red");
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}

