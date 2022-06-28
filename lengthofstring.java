import java.util.Scanner;

public class lengthofstring {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String name[]=new String[size];
         int totlength=0;
        for(int i=0;i<size;i++){
            name[i]=sc.next();
            totlength=totlength+name[i].length();

        }
        
        System.out.println( "total length of string is ="+totlength);
        
    }
}
