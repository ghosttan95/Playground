import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
      int numOfValues = Integer.parseInt(reader.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+numOfValues);
      for( int i=0; i<numOfValues; i++ ){
        String key = reader.readLine();
        Integer value = Integer.parseInt(reader.readLine());
        map.put(key,value);
      }
      System.out.println(map);
      String index = reader.readLine();
      System.out.println("Enter the index to be removed:"+index);
      map.remove(index);
      System.out.println(map);
      System.out.println("Size of map is : "+map.size());
    }
}