import java.util.Scanner;

public class MaxOccurChar {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String s= scn.nextLine();
        int[] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
        }
        int m=0;
        char ch= 'a';
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m= arr[i];
                ch=(char)(97+i);
            }
        }
        System.out.println(ch);
    }
}
