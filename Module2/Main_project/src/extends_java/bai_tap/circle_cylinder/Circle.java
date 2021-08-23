package extends_java.bai_tap.circle_cylinder;

class Circle{
    double radius;
    String color;
    public Circle(double radius,String color){
        this.color=color;
        this.radius=radius;
    }
    public Circle(){
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public double getArea(){
       return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' + " dien tich "+ getArea()+ " chu vi "+ getPerimeter()+
                '}';
    }
}
