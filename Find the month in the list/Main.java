import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      List<String> list = new LinkedList<String>();
      String month = reader.readLine();
      String arrayMonth[] = month.split(",");
      for( int i=0; i<arrayMonth.length; i++ ){
        list.add(arrayMonth[i]);
      }
      month = reader.readLine();
      System.out.println(list);
      System.out.println("Size of the linked list: "+list.size());
      System.out.println("Is LinkedList empty? "+list.isEmpty());
      System.out.println("Does LinkedList contains "+month+"?");
      System.out.println(list.contains(month));
    }
}