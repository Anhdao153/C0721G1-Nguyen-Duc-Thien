package Array_In_Jave.bai_tap;
import java.util.Scanner;
public class XoaPhanTuKhoiMang {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a[] =new int [5];
        System.out.println("Nhập giá trị cho mảng");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();

        }
        System.out.println("nhập giá trị cần xóa của mảng");
        int b;
        b=scanner.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                System.out.println("nhập lại giá trị cho phần tử thứ "+i+" có giá trị: "+a[i]);
                a[i]=scanner.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
        System.out.println("Tất cả các giá trị của mảng a: "+a[i]);}
    }
}
