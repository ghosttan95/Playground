import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year=in.nextInt();
      if(year%100==0){
        if(year%400==0)
        System.out.println("Leap year");
        else 
          System.out.println("Non Leap year");
      }
      else if(year%4==0)
        System.out.println("Leap year");
      else 
        System.out.println("Non Leap year");
    }
}