import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in= new Scanner(System.in);
    int size= in.nextInt();
    int array[]= new int[size];
    int max=0, maxIndex=0;
    for(int i=0; i<size; i++){
      array[i]= in.nextInt();
      if(max < array[i]){
        max= array[i];
        maxIndex= i;
      }
    }
    System.out.print(maxIndex);
  }
}