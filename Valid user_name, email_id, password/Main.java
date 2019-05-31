import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
      // type your code here
      public static boolean validatingUserName(String userName){
          Pattern userNamePattern = Pattern.compile("^[a-zA-Z0-9_-]*$");
          Matcher matcher = userNamePattern.matcher(userName);
          if(matcher.matches()){
              return true;
          }
          return false;
      }
      
      public static boolean validatingPassword(String password){
          Pattern passwordPattern = Pattern.compile("^[a-zA-Z0-9@#$%]*$");
          Matcher matcher = passwordPattern.matcher(password);
          if(matcher.matches()){
              return true;
          }
          return false;
      }
      
      public static boolean validatingEmail(String email){
          Pattern emailPattern = Pattern.compile("^[a-z0-9@_.]*$");
          Matcher matcher = emailPattern.matcher(email);
          if(matcher.matches()){
              return true;
          }
          return false;
      }
      
      public static void main(String a[]){
          // type your code here
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String userName = null;
          String email = null;
          String password = null;
          try{
              userName = reader.readLine();
              email = reader.readLine();
              password = reader.readLine();
          }
          catch(Exception e){
              System.out.println("While entering input exception occured");
          }
          System.out.println("Is "+userName+" a valid user name? "+validatingUserName(userName));
          System.out.println("Is "+email+" a valid email address? "+validatingEmail(email));
          System.out.println("Is "+password+" a valid password? "+validatingPassword(password));
        }
}