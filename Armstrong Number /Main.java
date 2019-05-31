import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      double count_digit=0;
      double armstrong_number=0;
      //loop to count digits in given number
      int temp1=n;
      int temp2=n;
      while(temp1!=0){
        temp1= temp1/10;
        count_digit++;
      }
      //System.out.println(count_digit);
      // loop determines armstrong number
      while(temp2!=0){
        double rem= temp2%10;
        armstrong_number= armstrong_number + Math.pow(rem, count_digit);
        temp2= temp2/10;
      }
      
      if(armstrong_number == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}