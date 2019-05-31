import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in= new Scanner(System.in);
    int row= in.nextInt();
    int column= in.nextInt();
    int array[][]= new int[row][column];
    for( int i=0; i<row; i++ )
      for( int j=0; j<column; j++ )
        array[i][j]= in.nextInt();
    for( int j=column-1; j>=0; j-- ){
      for( int i=0; i<row; i++ ){
        System.out.print(array[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}