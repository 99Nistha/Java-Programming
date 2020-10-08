import java.util.Scanner;

public class pue {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int t=scn.nextInt();
        while(t-->0){
            String s= scn.next();
            System.out.print(replace(s));
        }
    }
    public static String replace(String s){
        // base condition if the string is empty or of length one
        if(s.length()<=1) return s;
        // if the first character is 'p' and the first character of the part passed to recursion is 'i' then replace "pi" with "3.14"
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            return "3.14"+replace(s.substring(2));
        }
        // if the first character is not 'p' then just put that character in front of the answer which came from recursion
        return s.charAt(0)+ replace(s.substring(1));
    }
}
