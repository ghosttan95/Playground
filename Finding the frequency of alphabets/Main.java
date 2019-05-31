import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in= new Scanner(System.in);
    String string= new String(in.nextLine()).toLowerCase();
    String str="";
    int array[]= new int[26];
    for(int i=0; i<string.length(); i++){
      char ch= string.charAt(i);
      if( ch>='a' && ch<='z' ){
        int alpha_index= ch-'a';
        array[alpha_index]++;
        String str_ch= Character.toString(ch);
        if(!(str.contains(str_ch))){
        str= str+ str_ch;
        }
      }
    }
    
    for(int i=0; i<str.length(); i++){
      char ch= str.charAt(i);
      int index= ch-'a';
      System.out.print(ch+""+array[index]+" ");
    }
  }
}