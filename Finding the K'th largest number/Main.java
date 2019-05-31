import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++)
            array[i]= in.nextInt();
        int k= in.nextInt();
        array= Sort_Fun(array);
        System.out.print(array[k-1]);
    }
    
    public static int[] Sort_Fun(int array[]){
        for(int i=0; i<array.length-1; i++){
            int max= array[i];
            int index=i;
            for(int j=i+1; j<array.length; j++){
                if(array[i]<array[j]){
                    max= array[j];
                    index=j;
                }
            }
            array[index]= array[i];
            array[i]= max;
        }
        return array;
    }
}