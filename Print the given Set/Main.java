import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet set = new LinkedHashSet();
      String num = reader.readLine();
      String arr[] = num.split(",");
      for( int i=0; i<arr.length; i++ ){
        set.add(arr[i]);
      }
      System.out.println(set);
    }
}