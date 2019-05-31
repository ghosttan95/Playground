import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> list = new ArrayList<String>();
      int num = 1;
      while( num != 4){
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        num = Integer.parseInt(reader.readLine());
        switch(num){
            case 1:
                String str = reader.readLine();
                String arr[] = str.split(",");
                for( int i=0; i<arr.length; i++ )
                  list.add(arr[i]);
                break;
            case 2: 
                int index = Integer.parseInt(reader.readLine());
                System.out.println("Enter the index value to be deleted:"+index);
                list.remove(index);
                break;
            case 3: 
                System.out.println(list);
                break;
            case 4:
              	break;
        }
      }
    }
}