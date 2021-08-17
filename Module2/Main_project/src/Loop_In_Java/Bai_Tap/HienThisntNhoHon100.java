package Loop_In_Java.Bai_Tap;

// import java.util.Scanner;

public class HienThisntNhoHon100 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong snt muon hien");
        System.out.print("2 3 5 7");
        for (int i = 2; ; i++) {
            if (i < 100) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    System.out.print(" " + i);
                }
            } else {
                break;
            }
        }

    }
}
