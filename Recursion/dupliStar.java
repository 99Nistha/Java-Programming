import org.omg.CosNaming.IstringHelper;

import java.util.Scanner;

public class dupliStar {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s= scn.next();
        dupli(s,"");
    }

    public static void dupli(String s, String ans) {
        if(s.length()==1){
            System.out.print(ans+s.charAt(0));
            return;
        }
        if(s.charAt(0)== s.charAt(1)) dupli(s.substring(1),ans+s.charAt(0)+"*");
        else dupli(s.substring(1),ans+s.charAt(0));
    }
}
