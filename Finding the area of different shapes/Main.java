import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      switch( n ){
        case 1: 
          		int side = in.nextInt();
                System.out.println((side*side));
                break;
        case 2: 
          		int side1 = in.nextInt();
                int side2 = in.nextInt();
                System.out.println((side1*side2));
                break;
       case 3: 
          		side1 = in.nextInt();
                side2 = in.nextInt();
                System.out.println((side1*side2)/2);
                break;
       case 4: 
          		side1 = in.nextInt();
                System.out.println( (3.14*side1*side1) );
                break;
      }
    }
}