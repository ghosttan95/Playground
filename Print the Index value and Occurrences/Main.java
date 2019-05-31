import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
       String stringToFind = null;
       String string = null;
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try{
           stringToFind = reader.readLine();
           string = reader.readLine();
       }
       catch( Exception e ){
           System.out.println("Exception occured while taking input");
       }
       Pattern pattern = Pattern.compile(stringToFind);
       Matcher matcher = pattern.matcher(string);
       int count = 0;
       while( matcher.find() ){
           count++;
           System.out.println("found: "+count+" : "+matcher.start()+" - "+matcher.end());
        }
       if( count==0 ){
           System.out.println("The given word is not present in the string");
       }
       else 
          System.out.println(count);
    }
}