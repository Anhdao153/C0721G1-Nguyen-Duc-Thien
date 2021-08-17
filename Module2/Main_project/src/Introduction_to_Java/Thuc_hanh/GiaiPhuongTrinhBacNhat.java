package Introduction_to_Java.Thuc_hanh;
import java.util.Scanner;
public class GiaiPhuongTrinhBacNhat {
    float a;
    float b=0f;
    float c=0f;
    public static void main(String[] args){
        GiaiPhuongTrinhBacNhat giaiphuongtrinhbacnhat= new GiaiPhuongTrinhBacNhat();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số A và B để giải phương trình bậc nhất aX+b=0");
        giaiphuongtrinhbacnhat.a= Integer.parseInt(scanner.nextLine());
        giaiphuongtrinhbacnhat.b= Integer.parseInt(scanner.nextLine());
        if (giaiphuongtrinhbacnhat.a==0){
            System.out.println("phương trình vô nghiệm khi a=0");
        } else {
            giaiphuongtrinhbacnhat.c=(-giaiphuongtrinhbacnhat.b)/giaiphuongtrinhbacnhat.a;
            System.out.println("Đáp số x= "+giaiphuongtrinhbacnhat.c);
        }


    }



}
