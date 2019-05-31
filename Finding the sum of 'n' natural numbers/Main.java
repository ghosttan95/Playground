import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in= new Scanner(System.in);
      int num= in.nextInt();
      System.out.print(Sum(num));
    }
  public static int Sum(int num){
    if( num==1 ){
      return 1;
    }
    return num+Sum(num-1);
  }
}