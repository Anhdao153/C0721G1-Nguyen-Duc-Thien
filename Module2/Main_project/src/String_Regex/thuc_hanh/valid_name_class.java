package String_Regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class valid_name_class {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[a-zA-Z][\\\\w-]+@([\\\\w]+\\\\.[\\\\w]+|[\\\\w]+\\\\.[\\\\w]{2,}\\\\.[\\\\w]{2,})$";
    public valid_name_class () {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
