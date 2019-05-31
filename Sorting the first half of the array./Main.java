import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for( int i=0; i<size; i++ )
            array[i]= in.nextInt();
        int mid= size/2;
        Insertion_Sort( mid, array );
    }
    
    public static void Insertion_Sort( int mid, int array[] ){
        for( int index1=1; index1<mid; index1++){
            int index2= index1-1;
            int element= array[index1];
            while( index2>=0 && array[index2]>element){
                array[index2+1]= array[index2];
                index2--;
            }
            array[index2+1]=element;
        }
        
        for(int i: array)
            System.out.print(i+" ");
    }
}