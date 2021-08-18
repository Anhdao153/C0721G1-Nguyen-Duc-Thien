package Array_In_Jave.bai_tap;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a[]= new int[5];
        int b[]=new int [5];
        System.out.println("nhập giá trị mảng 1");
        for (int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
        System.out.println("nhập giá trị mảng 2");
        for (int i=0;i<b.length;i++){
            b[i]=scanner.nextInt();
        }
        int c[]= new int[10];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for (int i=0;i<b.length;i++){
            c[5+i]=b[i];
        }
    for (int i=0;i<c.length;i++){
        System.out.println(c[i]);
    }
    }
}
