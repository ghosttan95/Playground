import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in= new Scanner(System.in);
    String str= new String(in.nextLine());
    StringBuilder sb= new StringBuilder();
    for(int i=0; i<str.length(); i++){
      char ch= str.charAt(i);
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        continue;
      }
      else sb.append(ch);
    }
    System.out.print(sb);
  }
}