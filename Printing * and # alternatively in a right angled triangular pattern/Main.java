import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n= in.nextInt();
      char ch=0;
      for(int i= 1; i<=n; i++){
        for(int j=1; j<=i; j++){
          if(ch==0){
            System.out.print("*");
            ch='*';
          }
          else if(ch=='*'){
            System.out.print("#");
            ch='#';
          }
          else{
            System.out.print("*");
            ch='*';
          }   
        }
        System.out.print("\n");
      }
    }
}