import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int last_digit = n%10;
      int first_digit = 0;
      while(n!=0){
        first_digit = n%10;
        n = n/10;
      }
      System.out.println(first_digit+ last_digit);
	}
}