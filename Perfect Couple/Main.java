import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in= new Scanner(System.in);
      int size= in.nextInt();
      int array[]= new int[size];
      for(int i=0; i<size; i++)
        array[i]= in.nextInt();
      int value= in.nextInt();
      Pair(size, array, value);
    }
  public static void Pair(int size, int array[], int value){
    for(int i=0; i<size-1; i++){
      for(int j=i+1; j<size; j++ ){
        if( (array[i]+array[j]) == value ){
          System.out.println(array[i]+", "+array[j]); 
        }
      }
    }
  }
  
}