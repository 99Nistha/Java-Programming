import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s= scn.next();
        int base=1;
        for(int i=0;i<s.length()-1;i++) base= base*10;
        System.out.print(stoi(s,0, base));
    }

    public static int stoi(String s,int val, int base) {
        if(s.length()==0) return val;
        val+=((int)(s.charAt(0))-48)*base;
        base=base/10;
        return stoi(s.substring(1),val,base);
    }
}
