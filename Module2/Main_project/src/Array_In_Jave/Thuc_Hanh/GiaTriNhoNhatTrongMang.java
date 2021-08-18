package Array_In_Jave.thuc_hanh;

import java.util.Scanner;

public class GiaTriNhoNhatTrongMang {
    public static void main(String[] args){
        long b=0;
        System.out.println("Nhập giá trị cho mảng");
        Scanner scanner=new Scanner(System.in);
        int[] mang=new int[20];
        for (int i=0;i<mang.length;i++){
            mang[i]=scanner.nextInt();
        }
        for (int i=0;i<mang.length;i++){
            if (mang[i]>b){
                b=mang[i];
            }
        }
        for (int i=0;i<mang.length;i++){
            if (mang[i]<b){
                b=mang[i];
            }
        }
        System.out.println("Giá trị bé nhất của mảng là: "+b);
    }
}
