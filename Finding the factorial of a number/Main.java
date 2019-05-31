import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in= new Scanner(System.in);
    int num= in.nextInt();
    System.out.print(factorial(num));
  }
  public static int factorial( int num ){
    if( num==2 ){
      return 2;
    }
    return num*factorial(num-1);
  }
}