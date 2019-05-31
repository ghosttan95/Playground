import java.util.Scanner;
import java.lang.Math;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        int dot= str.indexOf(".");
        double num=0;
        if( dot==-1){
            for(int i=0; i<str.length(); i++){
                char ch= str.charAt(i);
                if( ch>=48 && ch<=57 ){
                    num= num*10+(double)(ch-'0');
                }
            }
            System.out.printf("%.6f",num);
        }
        else{
            //for integral part of float number
            double int_num= 0, dec_num=0;
            for(int i=0; i<dot; i++){
                char ch= str.charAt(i);
                if( ch>=48 && ch<=57 ){
                    int_num= int_num*10+(double)(ch-'0');
                }
            }
            //for decimal part of number
            int count=0;
            for(int i=dot+1; i<str.length(); i++){
                char ch= str.charAt(i);
                if( ch>=48 && ch<=57 ){
                    dec_num= dec_num*10+(double)(ch-'0');
                    count++;
                }
            }
            num= int_num+(dec_num/(Math.pow(10,count)));
            System.out.printf("%.6f",num);
        }
    }
}