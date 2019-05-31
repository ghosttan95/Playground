import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String str= in.nextLine();
        String str2= in.nextLine();
        String temp=str+str;
        if(temp.contains(str2)){
            System.out.print("Yes");
        }
        else 
        System.out.print("No");
    }
}