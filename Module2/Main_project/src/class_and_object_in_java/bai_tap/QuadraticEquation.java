package class_and_object_in_java.bai_tap;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double delta(){
        return ((this.b*this.b)-(4*this.a*this.c));
    }
    public double nghiemkep(){
        return (-this.b/(2*this.a));
    }
    public double nghiemdoi1(){
        return ((-this.b+Math.pow(delta(),0.5))/(2*this.a));
    }
    public double nghiemdoi2(){
        return ((-this.b-Math.pow(delta(),0.5))/(2*this.a));
    }
}
