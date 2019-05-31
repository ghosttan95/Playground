import java.util.Scanner;
class Main{
    
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String string= in.nextLine().trim();
        int column= in.nextInt();
        string= Remove_Spaces(string);
        int row= Row_Count(string.length(), column);
        //System.out.println(row);
        //System.out.println("String after removing spaces: "+string);
        String padded_string= Padding_String(string, string.length(), column);
        //System.out.println("Padded String"+padded_string);
        String padded_string_sequence= Padded_String_Rearrange_Sequence(padded_string, row, column);
        //System.out.println(padded_string_sequence);
        for( int i=0; i<column; i++){
            for( int j=i; j<padded_string_sequence.length(); j=j+column){
                System.out.print(padded_string_sequence.charAt(j));
            }
        }
    }
    
    public static int Row_Count(int string_length, int column){
        //System.out.println("length: "+string_length);
        if( string_length%column==0 )
            return string_length/column;
        return ((string_length/column)+1);
    }
    
    public static String Remove_Spaces( String string){
        StringBuilder str=new StringBuilder();
        for( int i=0; i<string.length(); i++ ){
            if( string.charAt(i)!=' ')
                str.append(string.charAt(i));
        }
        return str.toString();
    }
    
    public static String Padding_String( String string, int string_length, int column ){
        if( string_length%column==0 ){
            return string;
        }
        else {
            int padding_x= column-(string_length%column);
            for( int i=0; i<padding_x; i++){
                string= string+'X';
            }
        }
        return string;
    }
    
    public static String Padded_String_Rearrange_Sequence( String padded_string, int row, int column){
        StringBuilder sb= new StringBuilder();
        //System.out.print("Padded String in Padded_String_Rearrange_Sequence function: "+padded_string+" Length: "+padded_string.length());
        int start=0, end= column;
        for( int i=1; i<=row; i++){
            //System.out.println("Row: "+i);
            if(end<=padded_string.length()){
                if( i%2 !=0){
                    //System.out.println("   Odd:");
                    //System.out.print("    Start: "+start+" End"+end);
                    sb.append(padded_string.substring(start, end));
                    //System.out.println("    String: "+sb);
                }
                else {
                    StringBuilder sb1= new StringBuilder(padded_string.substring(start, end));
                    sb1.reverse();
                   // System.out.println("    even");
                    //System.out.print("    Start: "+start+" End"+end);
                    sb.append(sb1);
                   // System.out.println("    String: "+sb);
                    
                }
                start= end;
                end= start+column;
            }
       }
        return sb.toString();
    }
}