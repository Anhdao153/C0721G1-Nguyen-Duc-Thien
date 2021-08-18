package Array_In_Jave.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 6, 7, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Nhập trị trí muốn sửa cho mảng");
        int b = scanner.nextInt();
        if (b >= a.length || b <= -1) {
            System.out.println("hông thể nhập hoặc sửa tại những vị trí này");
        } else {
            for (int i = 0; i < a.length; i++) {
                if (i == b) {
                    System.out.println("Hãy thêm số bạn muốn vào chỗ: " + i + "này");
                    for (int j = a.length-1; b < j; j--) {
                        a[j] = a[j - 1];
                        System.out.println("mảng thay đổi: " + a[j]);
                    }
                    a[i] = scanner.nextInt();
                }
            }
            for (int i = 0; i < a.length; i++){
                System.out.println("mảng mới thay đổi là: " +a[i]);}

        }


    }
}

