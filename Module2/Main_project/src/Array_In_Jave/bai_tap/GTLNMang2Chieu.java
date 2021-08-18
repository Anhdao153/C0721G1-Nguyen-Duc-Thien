package Array_In_Jave.bai_tap;
import java.util.Scanner;
public class GTLNMang2Chieu {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a[][] =new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        int b=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if (a[i][j]>b){
                    b=a[i][j];
                }
            }
        }
        System.out.println("số lớn nhất trong mảng là: "+b);
    }
}
