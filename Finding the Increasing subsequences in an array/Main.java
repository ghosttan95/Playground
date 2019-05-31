import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for( int i=0; i<size; i++ )
            array[i]= in.nextInt();
        Increasing_Sequence( size, array );
    }
    public static void Increasing_Sequence( int size, int array[] ){
        for( int i=0; i<size; i++ ){
            for( int j=i; j<size; j++ ){
                if(array[i]<array[j]){
                    System.out.print(array[i]+","+array[j]+"\n");
                }
            }
        }
    }
}