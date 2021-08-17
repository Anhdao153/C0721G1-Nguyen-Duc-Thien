package Introduction_to_Java.bai_tap;
import java.util.Scanner;
public class HienThiLoiChao {
    String name;
    public static void main (String[] args){
        System.out.println("Nhập tên của bạn vào đây");
        Scanner input=new Scanner(System.in);
        HienThiLoiChao output=new HienThiLoiChao();
        output.name= input.nextLine();
        System.out.println(output.name);
    }
}
