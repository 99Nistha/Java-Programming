package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

class MaximumElementInWindow {
    public static void Maximum(int[]a, int k){
        Deque<Integer> q=new LinkedList<>();
        int i;
        for(i=0;i<k;i++){
            while(!q.isEmpty() && a[i]>a[q.getLast()]) q.removeLast();
            q.addLast(i);
        }
        for(;i<a.length;i++){
            System.out.println(a[q.getFirst()]+", ");
            while(!q.isEmpty() && q.getFirst()<=i-k) q.removeFirst();
            while(!q.isEmpty() && a[i]>a[q.getLast()]) q.removeLast();
            q.addLast(i);
        }
        System.out.println(a[q.getFirst()]);
    }

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=scn.nextInt();
        int k=scn.nextInt();
        Maximum(arr,k);
    }
}
