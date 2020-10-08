import java.util.Scanner;

public class isPal {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s1= scn.nextLine();
        StringBuilder s= new StringBuilder(s1);
        int left=0, right= s.length()-1;
        System.out.println(isPalindrome(s, left, right));
    }
    public static boolean isPalindrome(StringBuilder s, int left, int right){
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else return false;
        }
        return true;
    }
}
