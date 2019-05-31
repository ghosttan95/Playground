import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int size= in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++)
            array[i]= in.nextInt();
        int repeat_num=0, frequency=0;
        for(int i=0; i<size; i++){
            int count=0;
            for(int j=0; j<size; j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
            if(frequency<count){
                frequency= count;
                repeat_num= array[i];
            }
        }
        System.out.print(repeat_num);
        
    }
}
