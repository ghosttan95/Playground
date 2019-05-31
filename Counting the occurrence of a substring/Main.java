import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in= new Scanner(System.in);
    String str1= new String(in.nextLine());
    String str2= new String(in.nextLine());
    int count=0, currIndex=0;
    for(int i=0; i<str1.length(); i=currIndex+str2.length()){
      currIndex= str1.indexOf(str2, i);
      if(currIndex!=-1)
        count++;
    }
    System.out.print(count);
  } 
}