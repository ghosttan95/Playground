import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int num= in.nextInt();
        int array[][]= new int[num][num];
        Print_Spiral( num, array );
        for( int i=0; i<num; i++ ){
            for( int j=0; j<num; j++ ){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Print_Spiral( int num, int array[][] ){
        int row_min=0, col_min=0;
        int row_max= num-1, col_max= num-1;
        int value=1;
        while( row_min<=row_max && col_min<=col_max ){
            //traversing from right to left
            for( int i=col_max; i>=col_min; i-- )
                array[row_min][i]= value++;
            //traversing from top to bottom
            for( int i=row_min+1; i<=row_max; i++ )
                array[i][col_min]= value++;
            //traversing left to right
            for( int i=col_min+1; i<=col_max; i++ )
                array[row_max][i]= value++;
            //traversing from bottom to up
            for( int i=row_max-1; i>=row_min+1; i-- )
                array[i][col_max]= value++;
                
            row_min++;
            col_min++;
            row_max--;
            col_max--;
        }
    }
}