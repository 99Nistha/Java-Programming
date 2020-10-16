package ChallengeSQ;

import java.util.Scanner;
import java.util.Stack;

public class RedundantParentheses {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Stack<Character> stack= new Stack<>();
        int t=scn.nextInt();
        while(t-->0){
            int flag=1;
            String s=scn.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(') stack.push('(');
                else if(s.charAt(i)==')'){
                    if(stack.peek()=='('){
                        flag=0;
                        break;
                    }
                    while(stack.peek()!='(') stack.pop();
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
            if(flag==1) System.out.println("Not Duplicate");
            else System.out.println("Duplicate");
        }
    }
}
