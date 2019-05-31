import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++)
            array[i]= in.nextInt();
        int rotations= in.nextInt();
        //System.out.println(java.util.Arrays.toString(array));
        array=Merge_Demerge(size, array, rotations);
        //System.out.print(java.util.Arrays.toString(array));
      for(int i: array)
        System.out.print(i+" ");
    }
    
    public static int[] Merge_Demerge(int size, int array[], int rotations){
        // demerging array
        int even_array[]= new int[size];
        int odd_array[]= new int[size];
        int even_index=0, odd_index=0;
        //forming even and odd array
        int count=0;
        while(count<array.length){
            if( (count+1)%2==0 ){
                even_array[even_index]= array[count];
                even_index++;
            }
            else{
                odd_array[odd_index]= array[count];
                odd_index++;
            }
            count++;
        }
        //System.out.println("Even: "+ java.util.Arrays.toString(even_array)+" with size:"+(even_index));
        //System.out.println("Odd: "+ java.util.Arrays.toString(odd_array)+" with size:"+(odd_index));
        even_array= Rotation_fun(even_index, even_array, rotations, "even");
        odd_array= Rotation_fun(odd_index, odd_array, rotations, "odd");
        
        // merging array
        count=0; even_index=0; odd_index=0;
        while(count<size){
            if( (count+1)%2==0 ){
                array[count]= even_array[even_index];
                even_index++;
            }
            else {
                array[count]= odd_array[odd_index];
                odd_index++;
            }
            count++;
        }
        return array;
    }
    
    public static int[] Rotation_fun(int size, int array[], int rotations, String from){
        for(int i=0; i<rotations; i++){
            if( from.equals("even") ){
                int temp= array[0];
                for(int j=0; j<size; j++){
                    if( j==(size-1) ){
                        array[j]= temp;
                    }
                    else
                        array[j]= array[j+1];
                }
            }
            if( from.equals("odd") ){
                int temp= array[size-1];
                for(int j=size-1; j>=0; j--){
                    if( j==0 ){
                        array[j]= temp;
                    }
                    else
                        array[j]= array[j-1];
                }
            }
        }
        return array;
    }

}