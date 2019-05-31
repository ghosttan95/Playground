import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in= new Scanner(System.in);
  int n=in.nextInt();
  int second_star_j=0;
  for(int i=1; i<=n; i++){
    second_star_j= n-i+1;
    for(int k=1; k<=n; k++){
      if(i==k)
        System.out.print("*");
      else if(second_star_j==k)
        System.out.print("*");
      else 
        System.out.print(" ");
    }
    System.out.print("\n");
        // Type your code here
	}
  
  }
}