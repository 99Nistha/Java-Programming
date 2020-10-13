package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static Queue<Integer> q;
    public static void main(String[] args) {
        q= new LinkedList<Integer>();
        for(int i=1;i<=6;i++) q.add(i*10);
        reverse();
        System.out.print("after: ");
        display();
    }
    public static void display(){
        while(!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
    public static void reverse(){
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.add(q.peek());
            q.remove();
        }
        while (!stack.isEmpty()) {
            q.add(stack.peek());
            stack.pop();
        }
    }
}
