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
    Upper_Matrix(array, row, column);
  }
  
  public static void Upper_Matrix( int[][] array, int row, int column ){
    int j=0, i=0;
    for( int k=0; k<column; k++){
      for(i=0, j=k; j<column; i++, j++ ){
        System.out.print(array[i][j]+" ");
      }
    }
  }
}