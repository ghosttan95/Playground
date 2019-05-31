import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in= new Scanner(System.in);
    int row= in.nextInt();
    int column= in.nextInt();
    int matrix1[][]= new int[row][column];
    for( int i=0; i<row; i++ )
      for( int j=0; j<column; j++)
        matrix1[i][j]= in.nextInt();
    
    int matrix2[][]= new int[row][column];
    for( int i=0; i<row; i++ )
      for( int j=0; j<column; j++)
        matrix2[i][j]= in.nextInt();
    
    int subtract_matrix[][]= new int[row][column];
    Subtract( row, column,matrix1, matrix2, subtract_matrix );
    for( int i=0; i<row; i++ ){
      for( int j=0; j<column; j++){
        System.out.print(subtract_matrix[i][j]+" ");
      }
      System.out.print("\n");
    }
    
  }
  public static void Subtract( int row, int column, int matrix1[][], int matrix2[][], int subtract_matrix[][]){
    for( int i=0; i<row; i++ ){
      for( int j=0; j<column; j++){
        subtract_matrix[i][j]= matrix1[i][j]-matrix2[i][j];
      }
    }
  }
}