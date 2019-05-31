import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in= new Scanner(System.in);
      String str= new String(in.nextLine());
      String array[]= str.split("\\s+");
      for(int i=array.length-1; i>=0; i--){
        System.out.print(array[i]+" ");
      }
        
    }
    // Function to reverse a string
    /*public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
    }*/
}