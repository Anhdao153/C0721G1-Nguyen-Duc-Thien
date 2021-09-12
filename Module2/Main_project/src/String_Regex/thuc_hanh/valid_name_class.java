package String_Regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid_name_class {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAMECLASS_REGEX = "^[CAP]{1}\\d{4}[GHIKLM]";
    public valid_name_class () {
        pattern = Pattern.compile(NAMECLASS_REGEX);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
