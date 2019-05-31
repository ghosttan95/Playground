import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 * Write a description of ValidatingIpAndDate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String ipAddress = input.next();
        String date = input.next();
        System.out.println(ipAddress+" is valid? "+ Main.validatingIPAddress(ipAddress));
        System.out.println("Is "+date+" a valid date format? "+ Main.validatingDate(date));
    }
    
    public static boolean validatingIPAddress( String ipAddress){
        Pattern ipPattern = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher matcher = ipPattern.matcher(ipAddress);
        return matcher.find();
    }
    
    public static boolean validatingDate( String date){
        Pattern datePattern = Pattern.compile("(0?[1-9]|[12][0-9]|[3][01])/(0?[1-9]|1[0-2])/([1-9]\\d\\d\\d)");
        Matcher matcher = datePattern.matcher(date);
        return matcher.find();
    }
}
