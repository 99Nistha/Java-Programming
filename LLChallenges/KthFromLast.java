package LLChallenges;

import java.util.LinkedList;
import java.util.Scanner;

public class KthFromLast {
    public static void main(String[] args) {
        LinkedList<Integer> l= new LinkedList<>();
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        l.addFirst(x);
        while(true){
            x=scn.nextInt();
            if(x!=-1) l.addLast(x);
            else break;
        }
        int k= scn.nextInt();
        int length=l.size()-k;
        System.out.println("lol= "+l.get(length));
    }
}
