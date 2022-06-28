import java.util.Scanner;

public class replace {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(ch[i]=='e'){
                ch[i]='i';
            }

        }
        System.out.println(ch);
    

        
    }
}
