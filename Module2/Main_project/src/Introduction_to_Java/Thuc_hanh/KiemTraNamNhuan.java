package Introduction_to_Java.Thuc_hanh;
import java.util.Scanner;
public class KiemTraNamNhuan {
    int a;

    public static void main(String[] args){
        KiemTraNamNhuan check=new KiemTraNamNhuan();
        System.out.println("Hãy nhập số năm muốn kiểm tra, xem nó có phải năm nhuận không");
        Scanner scanner =new Scanner(System.in);
        check.a=scanner.nextInt();
        if (check.a%4==0){
            if (check.a%100==0){
                if (check.a%400==0){
                    System.out.println("Đây là năm nhuận");
                }
            } else {
                System.out.println("Đây là năm nhuận");
            }
        } else {
            System.out.println("Đây không phải là năm nhuận");
        }







    }
}
