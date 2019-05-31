import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner input = new Scanner(System.in);
      int row = input.nextInt();
      int column = input.nextInt();
      int array[][] = new int[row][column];
      for( int i=0; i<row; i++ ){
        for( int j=i; j<row; j++ ){
          array[i][j] = column;
          array[j][i] = column;
        }
        column--;
      }
      for( int i=0; i<row;i++ ){
        for(int j=0; j<row; j++ ){
          System.out.print(array[i][j]);
        }
        System.out.print("\n");
      }
    }
}