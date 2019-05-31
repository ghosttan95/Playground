import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in= new Scanner(System.in);
    int row= in.nextInt();
    int column= in.nextInt();
    int matrix[][]= new int[row][column];
    for( int i=0; i<row; i++ )
      for( int j=0; j<column; j++)
        matrix[i][j]= in.nextInt();
    int transpose_matrix[][]= new int[column][row];
    Transpose(row, column, matrix, transpose_matrix);
    
    for( int i=0; i<transpose_matrix.length; i++ ){
      for( int j=0; j<transpose_matrix[i].length; j++){
        System.out.print(transpose_matrix[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
  
  public static void Transpose(int row, int column, int[][] matrix, int[][] transpose_matrix){
    for( int i=0; i<row; i++ )
      for( int j=0; j<column; j++)
        transpose_matrix[j][i]= matrix[i][j];
  }
}