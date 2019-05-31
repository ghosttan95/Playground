import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String string= in.nextLine();
        String str[]= string.split(" ");
        for( int i=0; i<str.length; i++ ){
            String s= String_Reverse(str[i]);
            System.out.print(s+" ");
        }
    }
    
    public static String String_Reverse( String string ){
        String new_str="";
        for( int i=string.length()-1; i>=0; i-- ){
            new_str= new_str+string.charAt(i);
        }
        return new_str;
    }
}