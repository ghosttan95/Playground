import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      Set set = new TreeSet();
      String str = reader.readLine();
      String arr[] = str.split(",");
      System.out.println("Duplicate Entry is:");
      for( int i=0; i<arr.length; i++ ){
        boolean value = set.add(arr[i]);
        if( value==false )
          System.out.println(arr[i]);
      }
      System.out.println("TreeSet is : "+set);
    }
}