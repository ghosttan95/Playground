import java.util.Scanner;class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in= new Scanner(System.in);
    int num= in.nextInt();
    char num_type='P';
    if(num<0){
      num= -1*num;
      num_type= 'N';
    }
    int count=0;
    int temp= num;
    while(temp!=0){
      temp= temp/10;
      count++;
    }
    char str[]= new char[count];
    while(num!=0){
      int rem= num%10;
      str[count-1]=(char)(rem+'0');
      num= num/10;
      count--;
    }
    
    if(num_type =='N')
      System.out.print("-");
    System.out.print(str);
  }
}