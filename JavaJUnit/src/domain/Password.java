package domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    
    /**
     * strong password is compliant to all of these conditions
     * a lenght equal or greater tha 8 characters
     * at least one capital letter
     * at least one special character
     * @param password input by the user
     * @return true if the password is compliant or false if it isn't.
     */
    public static boolean strong(String password) {
        return password.length() >= 8 && doesItHaveCapitals(password) && doesIthaveSpecialCharacters(password);
    }
    
    static boolean doesItHaveCapitals(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                return true;
            }            
        }
        return false;
    }
    
    static boolean doesIthaveSpecialCharacters(String string) {
        Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);
        return matcher.find();
    }
}
