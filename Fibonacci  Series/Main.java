import java.io.*;
class Fibonacci extends Thread
{
  // type your code here
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  public void run(){
      try{
          int a=0, b=1, c=0;
          System.out.print("Enter the limit for Fibonacci: ");
          int limit = Integer.parseInt(reader.readLine());
          System.out.println(limit);
          if( limit<=0 ){
              throw new Exception("Exception");
          }
          else{
              System.out.print("The Fibonacci series is :");
              while( limit>0 ){
                 System.out.print(c+" ");
                 a= b; 
                 b= c;
                 c= a+b;
                 limit = limit-1;
              }
          }
      }
      catch(Exception e){
          System.out.println("Exception occurred");
        }
  }
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
        Fibonacci f = new Fibonacci();
        f.start();
     }
}