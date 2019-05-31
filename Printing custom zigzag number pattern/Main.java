import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int num_odd=1, num_even=2;
      for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
          if(i%2==0){
            if(j==1)
              System.out.print(num_odd);
            else
              System.out.print(num_even);
          }
          else {
            if(j==n)
              System.out.print(num_even);
            else 
              System.out.print(num_odd);
          }
        }
        if(i%2==0)
          num_even= num_even+2;
        else 
          num_odd= num_odd+2;
        System.out.print("\n");
      }
	}
}