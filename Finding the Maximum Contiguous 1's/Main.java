import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++)
            array[i]= in.nextInt();
        int seq_array[]= new int[2*size];
        int start_index=0, seq_index=0;
        for(int i=0; i<size-1; i++){
            if( array[i]>array[i+1] ){
                seq_array[seq_index]= start_index;
                seq_index++;
                seq_array[seq_index]= i;
                seq_index++;
                start_index= i+1;
            }
        }
        if(start_index!=size-1){
            seq_array[seq_index]= start_index;
            seq_index++;
            seq_array[seq_index]= array.length-1;
            seq_index++;
        }
        if(start_index==size-1){
            seq_array[seq_index]= start_index;
            seq_index++;
            seq_array[seq_index]= array.length-1;
            seq_index++;
        }
        int sum1=0;
        for(int i=0; i<seq_index; i=i+2){
            int start= seq_array[i];
            int end= seq_array[i+1];
            int sum2=0;
            for(int j=start; j<=end; j++){
                //System.out.print(array[j]);
                sum2= sum2+array[j];
            }
            //System.out.print("\n");
            if(sum1<sum2){
                sum1= sum2;
            }
        }
        System.out.print(sum1);
    }
}