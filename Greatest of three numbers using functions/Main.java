import java.util.Scanner;
class Main{
  public static int greatestNumber(int num1, int num2){
    int greatest_num=0;
    if(num1>num2)
      greatest_num= num1;
    else 
      greatest_num=num2;
    
    return greatest_num;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int num1= in.nextInt();
      int num2= in.nextInt();
      int num3= in.nextInt();
      int greatest_num= greatestNumber(num1, num2);
      greatest_num= greatestNumber(num3, greatest_num);
      System.out.println(greatest_num);
	}
}