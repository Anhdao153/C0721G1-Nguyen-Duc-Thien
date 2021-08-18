package class_and_object_in_java.bai_tap;

import java.util.Scanner;

public class LopPhuongTrinhBac2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập giá trị a,b,c: ");
        double a,b,c;
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        PhuonTrinhBac2 phuonTrinhBac2=new PhuonTrinhBac2(a,b,c);
        System.out.println(phuonTrinhBac2.a);
        System.out.println(phuonTrinhBac2.b);
        System.out.println(phuonTrinhBac2.c);
        System.out.println(phuonTrinhBac2.delta());
        if (phuonTrinhBac2.delta()>0){
            System.out.println("phương trình có 2 nghiệm: "+phuonTrinhBac2.nghiemdoi1()+" và: "+phuonTrinhBac2.nghiemdoi2());
        } else if (phuonTrinhBac2.delta()==0){
            System.out.println("Phương trình có nghiệm kép: "+phuonTrinhBac2.nghiemkep());
        } else {
            System.out.println("phương trình vô nghiệm nhé ahihi :)))");
        }







    }
}
