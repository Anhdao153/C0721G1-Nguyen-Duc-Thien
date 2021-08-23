package extends_java.thuc_hanh;



public class ThucHanh1 {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        shape=new Shape("red",false);
        System.out.println(shape);
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(3.5,"indigo",false);
        System.out.println(circle);

    }


}
class Shape{
    String color="green";
    boolean filled=true;
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public Shape() {
        // tại sao phải tạo thêm 1 contructor ở đây để làm cái gì?
        // Contructor ở dòng thứ 13 tại sao lại không được sử dụng?
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean getFilled(){
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of{" +
                "color='" + getColor() + '\'' +
                ", filled=" + getFilled() +
                '}';
    }


}
class Circle extends Shape{
    double radius=1.0;
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(){

    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
   public double getArea(){
        return radius*radius*Math.PI;
   }
   public double getPerimeter(){
        return radius*2*Math.PI;
   }

    @Override
    public String toString() {
        return "A Circle with radius{" +
                "radius='" + getRadius() + '\'' +
                super.toString()+ //(chưa hiểu đoạn code tại vị trí này)
                '}';
    }
}
