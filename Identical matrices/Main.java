import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in= new Scanner(System.in);
    int row= in.nextInt();
    int column= in.nextInt();
    int array1[][]= new int[row][column];
    for( int i=0; i<row; i++ )
      for( int j=0; j<column; j++ )
        array1[i][j]= in.nextInt();
    
    int array2[][]= new int[row][column];
    for( int i=0; i<row; i++ )
      for( int j=0; j<column; j++ )
        array2[i][j]= in.nextInt();
    boolean match= false;
    for( int i=0; i<row; i++ ){
      for( int j=0; j<column; j++ ){
        if( array1[i][j]==array2[i][j]){
          match= true;
        }
        else {
          match=false; 
          break;
        }
      }
      if( match== false){
        System.out.print("No");
        break;
      }
    }
    if( match==true ){
      System.out.print("Yes");
    }
  }
}