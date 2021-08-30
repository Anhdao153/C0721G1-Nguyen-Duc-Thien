package DSA_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuTrongMangSoNguyenBangStack {

    public static void main(String[] args) {
        Stack<Integer> numbers=new Stack<>();
        Stack<Integer> numbers2=new Stack<>();
        System.out.println("Nhập số lượng phần tử");
        Scanner scanner=new Scanner(System.in);
        int catalog= Integer.parseInt(scanner.nextLine());
        for (int i=0;i<catalog;i++){
            System.out.print("Nhập giá trị tại vị trí thứ "+i+": ");
            numbers.push(scanner.nextInt());
        }
        System.out.println("Stack: "+numbers);
        for (int i=0;i<catalog;i++){
            numbers2.push(numbers.pop());
            System.out.println("Giá trị sau khi bị đảo ngược là: "+i+numbers2);
        }

    }
}
