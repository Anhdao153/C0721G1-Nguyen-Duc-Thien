package Array_In_Jave.thuc_hanh;
import java.util.Scanner;
public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args){
        int b=0;
        System.out.println("Nhập tài sản cho những người giàu");
        Scanner scanner=new Scanner(System.in);
        int[] taisan=new int[20];
        for (int i=0;i<taisan.length;i++){
            taisan[i]=scanner.nextInt();
        }
        for (int i=0;i<taisan.length;i++){
            if (taisan[i]>b){
                b=taisan[i];
            }
        }
        System.out.println("Người giàu nhất có tài sản: "+b);




    }
}
