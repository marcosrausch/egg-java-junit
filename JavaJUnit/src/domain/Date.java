package domain;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
    
    public static boolean isValid(String date) {
        DateFormat stringDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        stringDateFormat.setLenient(false);
        try {
            stringDateFormat.parse(date);
        } catch (ParseException exception) {
            return false;
        }
        return true;
    }
    
}
