import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner input = new Scanner(System.in);
      String str1 = input.nextLine();
      String str2 = input.nextLine();
      int noOfParts  = input.nextInt();
      str1 = str1.replace(str1,str2);
      String array[] = str2.split(" ",noOfParts);
      for(String string: array){
        System.out.println(string);
      }
    }
}