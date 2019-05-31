import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in= new Scanner(System.in);
      int size= in.nextInt();
      int k= in.nextInt();
      int array[]= new int[size];
      for(int i=0; i<size; i++)
        array[i]= in.nextInt();
      int count=0;
      for(int i=1; i<=k; i++){
        for(int j=0; j<size; j++){
          if( array[j]==i )
            count++;
        }
        System.out.println(i+" "+count);
        count=0;
      }
    }
}