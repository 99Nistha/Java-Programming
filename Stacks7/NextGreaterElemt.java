package Stacks7;

import java.util.Stack;

public class NextGreaterElemt {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 8, 6, 7, 5};
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[i] > s.peek()) System.out.println(s.pop() + "->" + arr[i]);
            s.push(arr[i]);
        }
        while (!s.isEmpty()) System.out.println(s.pop() + "->" + -1);
    }
}
