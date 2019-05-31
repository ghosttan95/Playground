import java.util.Scanner;
class Main
{
  public static int squareFunction(int n){
    int square= n*n;
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int square= squareFunction(n);
      System.out.print(square);
	} 
}