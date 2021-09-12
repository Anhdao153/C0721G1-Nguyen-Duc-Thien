package String_Regex.thuc_hanh;

public class validate_email_test {
    private static validate_email validate_email;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        validate_email = new validate_email();
        for (String email : validEmail) {
            boolean isvalid = validate_email.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = validate_email.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
