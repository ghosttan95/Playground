import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        String string= in.nextLine();
        int key= in.nextInt();
        for( int i=0; i<string.length(); i++ ){
            char ch= string.charAt(i);
            //System.out.println("Index i: "+i+" Character ch: "+ch);
            if( ch>='a' && ch<='z'){
                int far_from_z= 'z'-ch;
                //System.out.println("    Far From z: "+far_from_z);
                far_from_z= (far_from_z+key)%26;
                //System.out.println("    Remainder: "+far_from_z);
                ch= (char)('z'-far_from_z);
                System.out.print(ch);
            }
            
            else if( ch>='A' && ch<='Z'){
                int far_from_Z= 'Z'-ch;
                //System.out.println("    Far From Z: "+far_from_Z);
                far_from_Z= (far_from_Z+key)%26;
                //System.out.println("    Remainder: "+far_from_Z);
                ch= (char)('Z'-far_from_Z);
                System.out.print(ch);
            }
            else{
                System.out.print(ch);
            } 
        }
    }
}