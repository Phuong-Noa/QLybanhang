package banhang.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class XDate {

    public static final String PATTERN_FULL = "dd/MM/yyyy HH:mm:ss";
    public static final String PATTERN_SHORT = "dd/MM/yyyy";
    
     private static final SimpleDateFormat formater = new SimpleDateFormat("", new Locale("vi", "VN"));
    
    public static Date now(){
        return new Date();
    }

    public static Date parse(String dateTime, String pattern) {
        formater.applyLocalizedPattern(pattern);
        try {
            return formater.parse(dateTime);
        } catch (ParseException e) {
            return null;
        }
    }
    
    public static Date parse(String dateTime) {
        return parse(dateTime, PATTERN_SHORT);
    }

    public static String format(Date dateTime, String pattern) {
        if (dateTime == null) {
            return "";
        }
        formater.applyPattern(pattern);
        return formater.format(dateTime);
    }

    public static String format(Date dateTime){
        return format(dateTime, PATTERN_SHORT);
    }
            
    public static void main(String[] args) {
        Date date = XDate.parse("Jan 21, 2024", "MMM dd, yyyy");
        String text = XDate.format(date, "dd-MMM-yyyy");
        System.out.println(text); // => 21-Jan-2024
    }

    public static String toString(Date ngvl, String yyyyMMdd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Date toDate(String text, String yyyyMMdd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}