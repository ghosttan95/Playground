import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int numOfValues = Integer.parseInt(reader.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+numOfValues);
      TreeMap<String,String> map = new TreeMap<String,String>();
      for( int i=0; i<numOfValues; i++ ){
        String key = reader.readLine();
        String value = reader.readLine();
        map.put(key, value);
      }
      System.out.println(map);
      String key = reader.readLine();
      System.out.println("Enter the index to be removed:"+key);
      map.remove(key);
      System.out.println(map);
      key = reader.readLine();
      System.out.println("Enter the index to insert:"+key);
      map.put(key,null);
      String value = reader.readLine();
      System.out.println("Enter the value to be inserted:"+value);
      map.put(key,value);
      System.out.println(map);
    }
}