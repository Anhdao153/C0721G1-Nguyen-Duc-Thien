package extends_java.bai_tap.circle_cylinder;

class Cylinder extends Circle{
    double height;
    public Cylinder(double height,double radius,String color){
        super(radius, color);
        this.height=height;

    }
    public Cylinder(double height){

    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double VolumeOfCylinder(){
        return getArea()*getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() + " Volume of Cylinder= " + VolumeOfCylinder()+ " radius " + getRadius() +
                 '}';
    }
}
