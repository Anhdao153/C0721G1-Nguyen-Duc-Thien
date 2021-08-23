package class_and_object_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập giá trị a,b,c: ");
        double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.a);
        System.out.println(quadraticEquation.b);
        System.out.println(quadraticEquation.c);
        System.out.println(quadraticEquation.delta());
        if (quadraticEquation.delta()>0){
            System.out.println("phương trình có 2 nghiệm: "+ quadraticEquation.nghiemdoi1()+" và: "+ quadraticEquation.nghiemdoi2());
        } else if (quadraticEquation.delta()==0){
            System.out.println("Phương trình có nghiệm kép: "+ quadraticEquation.nghiemkep());
        } else {
            System.out.println("phương trình vô nghiệm nhé ahihi :)))");
        }







    }
}
