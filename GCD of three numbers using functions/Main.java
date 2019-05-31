import java.util.Scanner;
public class Main{
  public static int GCD(int num1, int num2){
    int small=0, gcd=0;
    // checking small number among given numbers
    if(num1<num2)
      small= num1;
    else 
      small= num2;
    
    // checking GCD of given numbers
    while(small>=1){
      if(num1%small==0 && num2%small==0){
        gcd= small;
        break;
      }
      small--;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num1= in.nextInt();
      int num2= in.nextInt();
      int num3= in.nextInt();
      int gcd= GCD(num1, num2);
      gcd= GCD(num3, gcd);
      System.out.println(gcd);
	}
}