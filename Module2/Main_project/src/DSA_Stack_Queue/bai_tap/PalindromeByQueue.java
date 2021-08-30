package DSA_Stack_Queue.bai_tap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeByQueue {
    public static void main(String[] args) {
        System.out.println("nhập gì đó");
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();
        Queue queue=new LinkedList();
        for (int i= input.length()-1;i>=0;i++){
            queue.add(input.charAt(i));
        }
        String reverseString="";
        while (!queue.isEmpty()){
            reverseString=reverseString + queue.remove();
        }
        if (input.equals(reverseString)){
            System.out.println("đây là palindrome");
        } else {
            System.out.println("đây không phải palindrome");
        }
    }
}
