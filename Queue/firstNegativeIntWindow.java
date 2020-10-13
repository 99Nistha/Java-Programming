package Queue;

import java.util.LinkedList;

public class firstNegativeIntWindow {
    public static void main(String[] args) {
        int[] arr={12,-1,-7,8,-15,30,16,28};
        int k=3;
        int i;
        LinkedList<Integer> q= new LinkedList<>();
        for(i=0;i<k;i++){
            if(arr[i]<0) q.addLast((i));
        }
        for(;i<arr.length;i++){
            if(!q.isEmpty()) System.out.print(arr[q.peek()]+" ");
            else System.out.print("0");
            while(!q.isEmpty() && q.peek()<=i-k) q.removeFirst();
            if(arr[i]<0) q.addLast(i);
        }
        if(!q.isEmpty()) System.out.print(arr[q.peek()]);
        else System.out.println("0");
    }
}
