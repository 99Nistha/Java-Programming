package ChallengeSQ;

import Queue.QueueUsingArrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class StrongestFighter {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Deque<Integer> q=new LinkedList<>();
        int n= scn.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++) a[i]=scn.nextInt();
        int k= scn.nextInt();
        int i=0;
        for(;i<k;i++){
            while(!q.isEmpty() && a[i]>a[q.getLast()]) q.removeLast();
            q.addLast(i);
        }
        for(;i<a.length;i++){
            System.out.print(a[q.getFirst()]+" ");
            while(!q.isEmpty() && q.getFirst()<=i-k) q.removeFirst();
            while(!q.isEmpty() && a[i]>a[q.getLast()]) q.removeLast();
            q.addLast(i);
        }
        System.out.println(a[q.getFirst()]);
    }
}
