package extends_java.bai_tap.point_moveable;

public class main {
    public static void main(String[] args) {
        Point point=new Point(3,5);
        System.out.println(point);
        MoveablePoint a=new MoveablePoint(3,5,7,9);
        System.out.println(a);
        a.move();
    }
}
