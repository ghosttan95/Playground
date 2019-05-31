import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in= new Scanner(System.in);
      int size= in.nextInt();
      int array[]= new int[size];
      for(int i=0; i<size; i++)
        array[i]= in.nextInt();
      int found=0;
      for(int i=1; i<=size; i++){
        for(int j=0; j<size; j++){
          if(i==array[j]){
            found=1;
            break;
          }
          else found=0;
        }
        if(found==0){
          System.out.print(i);
          break;
        }
      }
    }
}