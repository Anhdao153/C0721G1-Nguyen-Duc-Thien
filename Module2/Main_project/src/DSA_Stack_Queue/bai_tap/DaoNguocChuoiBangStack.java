package DSA_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoiBangStack {
    public static void main(String[] args) {
        Stack<Character> strings=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        String content=scanner.nextLine();
        for (int i=0;i<content.length();i++){
            strings.push(content.charAt(i));
            System.out.println("chữ tại vị trí: "+i+" là: "+strings);
        }
        Stack<Character> chars=new Stack<>();
        for (int i=0;i<content.length();i++){
            chars.push(strings.pop());
            System.out.println("chữ tại vị trí: "+i+" là: "+chars);
        }

    }
}
