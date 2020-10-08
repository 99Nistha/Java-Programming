import java.util.*;
public class UltraFastMath {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        while(t-->0){
            String s=scn.next();
            String s2=scn.next();
            StringBuilder s1= new StringBuilder(s);
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)==s2.charAt(i)) s1.setCharAt(i,'0');
                else s1.setCharAt(i,'1');
            }
            System.out.println(s1);
        }
    }
}