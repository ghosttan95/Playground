import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in= new Scanner(System.in);
      String str= in.nextLine().toLowerCase();
      int array[]= new int[26];
      for(int i=0; i<str.length(); i++){
        char ch= str.charAt(i);
        if( ch>='a' && ch<='z' ){
          int index= ch-'a';
          array[index]++;
        }
      }
      
      for(int i=0; i<array.length; i++){
        if( array[i]==0 )
          System.out.print((char)('a'+i)+" ");
      }
    }
}