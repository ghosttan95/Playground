import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
   public static void main(String args[])
   {
      // type your code here
     Scanner input = new Scanner(System.in);
     try{
       if(input.hasNextInt())
         System.out.println(input.nextInt());
       else 
         throw new InputMismatchException();
     }
     catch(InputMismatchException e){
       System.out.println("Input Mismatch Exception occurred");
     }
   }
}