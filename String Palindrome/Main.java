import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in= new Scanner(System.in);
      String str= new String(in.nextLine());
      StringBuilder str1= new StringBuilder(str);
      str1.reverse();
      if(str.equals(str1.toString()))
        System.out.print("Yes");
      else 
        System.out.print("No");
    } 
}