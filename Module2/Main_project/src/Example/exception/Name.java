package Example.exception;

import String_Regex.thuc_hanh.valid_name_class;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Name {

    private static valid_name_class nameClass;

    public void checking() throws UserException {
        Scanner in = new Scanner(System.in);
        valid_name_class valid_name_class = new valid_name_class();
        nameClass = new valid_name_class();
        System.out.println("input your email");
        boolean check;
        while (check=true) {
            try {
                int email = Integer.parseInt(in.nextLine());
                System.out.println(email);
                check = false;
                break;
            } catch (Exception e) {

            }
        }
            System.out.println("Xong chương trình");


}
}
