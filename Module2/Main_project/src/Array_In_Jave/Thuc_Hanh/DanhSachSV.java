package Array_In_Jave.thuc_hanh;
import java.util.Scanner;
public class DanhSachSV {
    public static void main(String[] args){
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập tên của học sinh vào: " );
        String input_name=scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            //equals là dùng để so sánh 2 chuỗi trong java.
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }






    }
}
