import java.util.Scanner;

public class DiffInAscii {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s= scn.nextLine();
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            s1.append(s.charAt(i));
            s1.append(s.charAt(i+1)-s.charAt(i));
        }
        s1.append(s.charAt(s.length()-1));
        System.out.println(s1);
    }
}
