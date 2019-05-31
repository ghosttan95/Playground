import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in= new Scanner(System.in);
    int size= in.nextInt();
    int array[]= new int[size];
    int result_batch[]= new int[size/3];
    for(int i=0; i<size; i++)
      array[i]= in.nextInt();
    result_batch= batch_calculator(array);
    int batch_value= result_batch[0], count=0;
    for(int i=1; i<result_batch.length; i++){
      if(batch_value!=result_batch[i]){
        count++;
      }
    }
    if(count==0)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
  
  public static int[] batch_calculator(int array[]){
    int sum=0, j=0;
    int result[]= new int[array.length/3];
    for(int i=0; i<array.length; i++){
      sum= sum + array[i];
      if((i+1)%3==0 && j<result.length){
        result[j]= sum;
        sum=0;
        j++;
      }
    }
    return result;
  }
}