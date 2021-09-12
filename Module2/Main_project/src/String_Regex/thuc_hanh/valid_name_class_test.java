package String_Regex.thuc_hanh;

public class valid_name_class_test {
    private static valid_name_class nameClass;
    public static final String[] validName = new String[] { "C2345H", "A3476M", "P7668G" };
    public static final String[] invalidName = new String[] { "J3456A", "DF334T", "GFHDXG" };

    public static void main(String args[]) {
        nameClass = new valid_name_class();
        for (String name : validName) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Name class is " + name + " is valid: " + isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Name class is " + name + " is valid: " + isvalid);
        }
    }
}
