package access_modifier_static_method_static_property.bai_tap;

public class TestCircle {
    public double radius;
    public String color;

    public TestCircle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public TestCircle() {
        radius=1;
        color="red";
    }
    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return (radius*radius*Math.PI);
    }
}
