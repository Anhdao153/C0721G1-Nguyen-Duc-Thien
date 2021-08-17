package Loop_In_Java.Bai_Tap;

import java.util.Scanner;

public class HienThi20SoNguyentoDauTien {
    public static void main(String[] args) {
        int num;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong snt muon hien");
        num = input.nextInt();
        System.out.print("2 3 5 7");
        for (int i = 2; ; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(" " + i);
                count++;
                if (count == num-5) {
                    break;
                }
            }
        }


    }
}
