import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      TreeSet set = new TreeSet();
      String str = reader.readLine();
      String arr[] = str.split(",");
      for(String s : arr){
        set.add(s);
      }
      System.out.println(set);
      Object array[] = set.toArray();
      int size = array.length;
      for( int i=size-1; i>=0; i-- ){
        Object m = array[i];
        set.remove(m);
        System.out.println(set);
      }
    }
}