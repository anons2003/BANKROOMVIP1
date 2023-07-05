package View;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validate {
        static boolean checkID(String id) {
        Pattern pattern = Pattern.compile("^[0-9]+$");
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
}
