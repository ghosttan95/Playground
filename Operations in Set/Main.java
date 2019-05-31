import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet set = new LinkedHashSet();
      String str = reader.readLine();
      String arr[] = str.split(",");
      for( String newStr: arr ){
        set.add(newStr);
      }
      System.out.println(set);
      str = reader.readLine();
      System.out.println("Enter the value to be deleted: "+ str);
      set.remove(str);
      System.out.println(set);
      str = reader.readLine();
      System.out.println("Enter the value to be added: "+str);
      set.add(str);
      System.out.println(set);
    }
}