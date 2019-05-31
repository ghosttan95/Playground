import java.util.Scanner;
public class Main {
    public static void main( String args[]){
        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        int mid= (str.length()/2);
        int length= str.length();
        StringBuilder sb= new StringBuilder(str);
        for( int i=0; i<mid; i++ ){
            char ch= sb.charAt(0);
            //System.out.println("Index 'i': "+i+" char ch: "+ch);
            for( int j=0; j<length; j++ ){
                //System.out.println("Index 'j': "+j);
                if(j==length-1){
                    sb.setCharAt(j,ch);
                    //System.out.println(sb);
                }
                else {
                    sb.setCharAt(j, sb.charAt(j+1));
                    //System.out.println(sb);
                }
            }
        }
      //sb= sb.toString().trim();
        //System.out.print(sb);
        for( int i= 0; i<length; i++ ){
            //loop for giving spaces
            for( int j= i; j<length-1; j++){
                System.out.print(" ");
            }
            //loop for printing characters
            for( int k=0; k<=i; k++ ){
                System.out.print(sb.charAt(k));
            }
            System.out.print("\n");
        }
    }
}