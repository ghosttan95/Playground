import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in= new Scanner(System.in);
      int size= in.nextInt();
      int num1=0, num2=0;
      int array[]= new int[size];
      for(int i=0; i<size; i++){
        array[i]= in.nextInt();
        num1= num1*10+array[i];
      }
      for(int i= array.length-1; i>=0; i--){
        num2= num2*10+array[i];
      }
      if(num1==num2){
        System.out.print("Yes");
      }
      else 
        System.out.print("No");
      
    }
}