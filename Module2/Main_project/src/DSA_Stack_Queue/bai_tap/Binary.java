package DSA_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> value=new Stack<>();
        int data=scanner.nextInt();
        while(data!=0){
            int num=data%2;
            value.push(num);
            data/=2;
        }
        System.out.println("giá trị của nhị phân là: ");
        while (value.isEmpty()==false){
            System.out.println(value.pop());
        }


    }
}
