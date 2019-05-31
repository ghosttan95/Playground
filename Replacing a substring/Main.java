import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String string= in.nextLine();
        //String string="Give me some sunshine";
        String str_old= in.nextLine();
        String str_new= in.nextLine();
        //String temp=string.replace(str_old, str_new);
        System.out.print(string.replace(str_old, str_new));
    }

}