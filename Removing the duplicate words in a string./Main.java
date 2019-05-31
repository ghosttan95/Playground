import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in= new Scanner(System.in);
    String str= in.nextLine();
    str= str.trim();
    String array[]= str.split(" ");
    StringBuilder sb= new StringBuilder();
    String replace= "$";
    //System.out.print(java.util.Arrays.toString(array));
    for(int i=0; i<array.length; i++){
      String str1= array[i];
      for(int j=i+1; j<array.length; j++){
        String str2= array[j];
        if( str1.equals(str2) ){
          array[j]=replace;
        }
      }
    }
    for(String s: array){
      if(s!=replace){
        System.out.print(s+" ");
      }
    }
  }
}