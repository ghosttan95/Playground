import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for( int i=0; i<size; i++ )
            array[i]= in.nextInt();
        Strictly_Increasing_Sequence( size, array );
    }
    
    public static void Strictly_Increasing_Sequence( int size, int[] array ){
        for( int i=0; i<size; i++ ){
            for( int j=i; j<size; j++ ){
                if( array[i]<array[j] ){
                    if( array[j-1]<array[j] ){
                        System.out.print(array[i]+","+array[j]+"\n");
                    }
                }
            }
        }
    }
}