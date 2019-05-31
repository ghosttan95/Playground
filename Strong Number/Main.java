import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int temp=n;
      int fact=1;
      int sum_fact=0;
      while(temp!=0){
        int rem= temp%10;
        for(int i=1; i<=rem; i++){
          fact= fact*i;
        }
        sum_fact = sum_fact + fact;
        fact=1;
        temp = temp/10;
      }
      
      if(sum_fact == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}