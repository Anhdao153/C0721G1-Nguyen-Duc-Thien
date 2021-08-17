package Introduction_to_Java.Thuc_hanh;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class TinhSoNgayTrongThang {
    public static void main(String[] args){
        System.out.println("hãy nhập tháng bạn muốn kiểm tra số ngày");
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        switch(a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 12:
                    System.out.println("tháng này có 31 ngày");
                    break;
            case 2:
                System.out.println("Tháng này có 28 hoặc 29 ngày");
                break;

            default:
                System.out.println("Tháng này có 30 ngày");
        }
    }
}
