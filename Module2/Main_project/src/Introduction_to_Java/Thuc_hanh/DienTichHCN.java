package Introduction_to_Java.Thuc_hanh;
import java.util.Scanner;
public class DienTichHCN {
    int a=0;
    int b=0;
    int c=0;
    public static void main(String[] args){
        DienTichHCN dientichhcn= new DienTichHCN();
        System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật");
        Scanner scanner=new Scanner(System.in);
        dientichhcn.a=Integer.parseInt(scanner.nextLine());
        dientichhcn.b=Integer.parseInt(scanner.nextLine());
        dientichhcn.c=dientichhcn.a*dientichhcn.b;
        System.out.println("Diện tích hình chữ nhật mà bạn muốn tính là: "+dientichhcn.c);
    }
}
