package class_and_object_in_java.thuc_hanh;

import java.util.Scanner;

public class LopHCN {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("nhập chiều dài của hình chữ nhật");
        double dai= scanner.nextDouble();
        System.out.println("Hãy nhập chiều rộng của hình chữ nhật");
        double rong=scanner.nextDouble();
        HCN hinhchunhat=new HCN(rong,dai);
        System.out.println("diện tích của hình chữ nhật là: "+hinhchunhat.getArea());
        System.out.println("chu vi của hình chữ nhật là: "+hinhchunhat.getPertimeter());
        System.out.println("số đo hình chữ nhật là: "+hinhchunhat.display());
    }
}
