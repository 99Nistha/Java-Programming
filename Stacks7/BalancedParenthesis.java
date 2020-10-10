package Stacks7;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String s="{5+9}";
        if(check(s)) System.out.println("Its valid");
        else System.out.println("its Invalid");
    }

    public static boolean check(String s){
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if(!stack.isEmpty()&& stack.peek()=='(') stack.pop();
                    else return false;
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek()=='{') stack.pop();
                    else return false;
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek()=='[') stack.pop();
                    else return false;
                    break;
                default:break;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
