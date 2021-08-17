package Loop_In_Java.Thuc_Hanh;

import java.util.Scanner;

public class UngDungTinhTienLaiVay {
    public static void main(String[] args) {
        int a;
        float b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng tiền muốn vay");
        a = scanner.nextInt();
        System.out.println(a);
        System.out.println("nhập tỉ lệ lãi suất");
        b = scanner.nextInt();
        b=b /100;
        System.out.println(b);
        System.out.println("Số tháng vay");
        c = scanner.nextInt();
        System.out.println(c);
        float d;
        d = a * b * c;
        System.out.println("Tổng số tiền lãi phải đóng là " + d);

    }
}
