package access_modifier_static_method_static_property.bai_tap;

public class AccessModifier {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(" dien tich hinh con co ban kinh "+circle.getRadius()+" la "+circle.getArea()+" co mau ");
        TestCircle circle1=new TestCircle();
        System.out.println(circle1.color+"  tich hinh con co ban kinh "+circle1.getRadius()+" la "+circle1.getArea());

    }
}
