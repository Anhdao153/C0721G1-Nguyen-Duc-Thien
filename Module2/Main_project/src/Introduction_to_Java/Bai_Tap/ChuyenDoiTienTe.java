package Introduction_to_Java.bai_tap;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tỉ giá giữa VND và $ hiện này là 23k");
        System.out.println("chọn 2 để đổi VND sang $, chọn 1 để đổi $ sang VND");
        int a;
        a=scanner.nextInt();
        if (a==1) {
            System.out.print("Hãy nhập giá tiền mà bạn muốn quy đổi: ");
            int money;
            money = scanner.nextInt();
            int change;
            change = money * 23000;
            System.out.println(change);
        } else if (a==2){
            System.out.print("Hãy nhập giá tiền mà bạn muốn quy đổi: ");
            int money;
            money = scanner.nextInt();
            int change;
            change = money / 23000;
            System.out.println(change);
        }
    }
}
