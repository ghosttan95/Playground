import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in= new Scanner(System.in);
      int num= in.nextInt();
      int arr[] = new int[num];
      // inserting elements in array
      for(int i=0; i<num; i++){
        arr[i]= in.nextInt();
      }
       // taking two data items from user to search
      int element_1= in.nextInt();
      int element_2= in.nextInt();
      int element_1_index=-1, element_2_index=-1;
      boolean found1= false, found2= false;
      for(int i=0; i<num; i++){
        if(arr[i]==element_1){
          found1=true;
          element_1_index=i;
        }
        if(arr[i]==element_2){
          found2= true;
          element_2_index=i;
        }
      }
      if(found1==true)
        System.out.println(element_1_index);
      else 
        System.out.println(element_1_index);
      
      if(found2==true)
        System.out.println(element_2_index);
      else 
        System.out.println(element_2_index);
    }
}