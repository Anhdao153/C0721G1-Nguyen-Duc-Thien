package class_and_object_in_java.bai_tap;

public class Fan {
    private boolean on = false;
    final int slow = 1;
    final static int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private double radius = 5;
    private String color = "blue";

    public void fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;

    }

    public int getspeed() {
        return this.speed;
    }

    public void setspeed(int speed) {
        this.speed = speed;
    }

    public boolean geton() {
        return this.on;
    }

    public void seton(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return speed + " " + on + " " + radius + " " + color;
    }

}
