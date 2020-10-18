package LLChallenges;


import java.util.LinkedList;
import java.util.Scanner;

public class CircularLL {
    public static void main(String[] args) {
        LinkedList<Integer> l= new LinkedList<>();
        Scanner scn= new Scanner(System.in);
        int x;
        while(true){
            x=scn.nextInt();
            if(x!=-1) l.addLast(x);
            else break;
        }
        
    }
}
