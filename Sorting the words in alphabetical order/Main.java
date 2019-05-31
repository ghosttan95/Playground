import java.util.Scanner;
public class Main {
    public static void main( String args[] ){
        Scanner in= new Scanner(System.in);
        int num= in.nextInt();
        String string[]= new String[num];
        for( int i=0; i<num; i++ )
            string[i]= in.next().toLowerCase();
        for( int i=0; i<num; i++ ){
            //taking out 1st string from string array
            String str_i= string[i];//storing 1st string in str_i variable
            //System.out.println("String i: "+str_i);
            String min=str_i;//taking min string as str_i
            int minIndex=0;
            //System.out.println("   Assumed min string :"+min);
            for( int j=i+1; j<num; j++ ){
                //taking out 2nd string from string array 
                String str_j= string[j];//storing next string of ith string from array of string
                //System.out.println("String j: "+str_j);
                int counter=i;//to count which string is lesser in length
                if( min.length()<str_j.length())
                    counter= min.length();
                else 
                    counter= str_j.length();
                for( int k=0; k<counter; k++ ){
                    char ch_min= min.charAt(k), ch_j= str_j.charAt(k);
                    if( ch_j<ch_min ){
                        min= str_j;
                        minIndex=j;
                        break;
                    }
                    else if( ch_min<ch_j ){
                        min= min;
                        break;
                    }
                    else if( ch_min==ch_j ){
                        continue;
                    }
                }
            }
            //System.out.println("   Before swap: "+java.util.Arrays.toString(string));
            if( !(str_i.equals(min)) ){
                    string[minIndex]= string[i];
                    string[i]=min;
            }
            //System.out.println("   Min string now: "+min);
            //System.out.println("   after swap: "+java.util.Arrays.toString(string));
        }
        for( String str: string ){
            System.out.println(str);
        }
    }
}