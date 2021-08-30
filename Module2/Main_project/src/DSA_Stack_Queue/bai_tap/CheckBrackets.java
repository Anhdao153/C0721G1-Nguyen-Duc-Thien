package DSA_Stack_Queue.bai_tap;

import java.util.Stack;

public class CheckBrackets {
        public static boolean CheckBrackets(String chuoi){
            Stack<Character> stack=new Stack<Character>();
            for (int i=0;i<chuoi.length();i++){
                char c= chuoi.charAt(i);
                if (c=='['||c=='{'||c=='('){
                stack.push(c);
                } else if(c == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                } else if(c == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                } else if(c == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }


    public static void main(String[] args) {
        System.out.println("nếu ngoặc đúng hết thì trả true, nếu sai là fale");
        System.out.println("}– b + (b^2 – 4*a*c)^(0.5/ 2*a))");
        boolean a=CheckBrackets("}– b + (b^2 – 4*a*c)^(0.5/ 2*a)) ");
        System.out.println(a);
    }
}
