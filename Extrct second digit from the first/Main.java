import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int rem=0;
      int count=0, count2=0;
      int temp=n;
      while(n!=0){
        rem= n%10;
        n= n/10;
        count = count+1;
      }
      while(temp!=0){
        rem= temp%10;
        temp= temp/10;
        count2= count2+1;
        if(count2 == (count-1)){
          System.out.println(rem);
          break;
        }
      }
    }
}