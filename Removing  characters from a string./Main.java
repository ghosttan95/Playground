import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String string= in.nextLine();
        String sub_string= in.nextLine();
        StringBuilder sb= new StringBuilder(string);
        for( int i=0; i<sub_string.length(); i++ ){
            char sub_ch= sub_string.charAt(i);
            for(int j=0; j<string.length(); j++){
                char string_ch= string.charAt(j);
                if( sub_ch==string_ch ){
                    sb.setCharAt(j,'$');
                }
            }
        }
        
        for(int i=0; i<sb.length(); i++){
            char ch= sb.charAt(i);
            if( ch!='$' )
                System.out.print(ch);
        }
    }
}