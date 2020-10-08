import java.util.Scanner;

public class xInEnd {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s= scn.next();
        allx(s,"",0);
    }

    public static void allx(String s, String ans, int count) {
        if(s.length()==0){
            for(int i=0;i<count;i++) ans=ans+'x';
            System.out.println(ans);
            return;
        }
        if(s.charAt(0)=='x'){
            count++;
            allx(s.substring(1), ans,count);
        }else allx(s.substring(1), ans+s.charAt(0), count);
    }
}
