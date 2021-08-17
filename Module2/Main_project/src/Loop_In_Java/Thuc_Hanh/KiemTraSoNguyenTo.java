package Loop_In_Java.Thuc_Hanh;
import java.util.Scanner;
public class KiemTraSoNguyenTo {
    public static void main(String[] args){
        int a;
        System.out.println("Nhập số để kiểm tra xem nó có phải là số nguyên tố hay không");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        if (a==1){
            System.out.println("Đây không phải số nguyên tố");
        } else{
            if (a==2||a==3||a==5||a==7){
                System.out.println("Đây là số nguyên tố "+a);
            }
            else if (a%2!=0&&a%3!=0&&a%5!=0&&a%7!=0){
                System.out.println("đây là số nguyên tố: "+a);
            } else {
                System.out.println("Đây không phải số nguyên tố");
            }
        }


    }
}
