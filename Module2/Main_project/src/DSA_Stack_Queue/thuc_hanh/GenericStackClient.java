package DSA_Stack_Queue.thuc_hanh;

import static DSA_Stack_Queue.thuc_hanh.MyGenericStack.stackOfIStrings;
import static DSA_Stack_Queue.thuc_hanh.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
