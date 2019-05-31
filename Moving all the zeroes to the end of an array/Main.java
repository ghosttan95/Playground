import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++)
            array[i]= in.nextInt();
        array= end_zero_func(size, array);
        for(int i: array)
          System.out.print(i+" ");
    }
    
    public static int[] end_zero_func(int size, int array[]){
        int zero_count=0, j=0;
        int non_zero_array[]= new int[size];
        for(int i=0; i<size; i++){
            if( array[i]==0 )
                zero_count++;
            else{
                non_zero_array[j]= array[i];
                j++;
            }
        }
        for(int i=0; i<size; i++){
            if(i<j)
                array[i]= non_zero_array[i];
            else 
                array[i]=0;
        }
        return array;
    }

}
