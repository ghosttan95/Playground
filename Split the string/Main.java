import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String args[]){
          // type your code here
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          String string=null;
          try{
              string = reader.readLine();
          }
          catch(Exception e){
              System.out.println("Exception Occured while entering string as input");
          }
          String array[] = string.split("(and|or| |,)");
          for(String str:array){
              System.out.println(str);
          }
    }
}