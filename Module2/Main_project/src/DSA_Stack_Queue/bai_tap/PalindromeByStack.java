package DSA_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeByStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("nhập gì đó");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        if (input.equals(reverse))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}

