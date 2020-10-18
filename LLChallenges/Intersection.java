package LLChallenges;

import java.util.*;

class Node {
    public int data;
    public Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
    public int length(Node temp){
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public Node helper(Node l1, Node l2, int d){
        //l1>l2
        while(d>0){
            l1=l1.next;
            d--;
        }
        while(l1.data!=l2.data && l1.next!=null){
            l1=l1.next;
            l2=l2.next;
        }
        if(l1.next==null) {
            Node sample= new Node(-1);
            return sample;
        }
        return l1;
    }
    // This function gets two arguments - the head pointers of the two linked lists
    // Return the node which is the intersection point of these linked lists
    // It is assured that the two lists intersect
    Node intersectionOfTwoLinkedLists(Node l1, Node l2) {
        /* Code here */
        int s1= length(l1);
        int s2= length(l2);
        int d= Math.abs(s2-s1);
        if(s2>s1){
            return helper(l2, l1,d);
        }else{
            return helper(l1,l2,d);
        }
    }

}

/*
 *
 *
 *   You do not need to refer or modify any code below this.
 *   Only modify the above class definition.
 *	Any modications to code below could lead to a 'Wrong Answer' verdict despite above code being correct.
 *	You do not even need to read or know about the code below.
 *
 *
 *
 */

public class Intersection {

    static Scanner sc = new Scanner(System.in);

    public static Node buildList(HashMap<Integer, Node> hash) {
        int x = sc.nextInt();
        Node head = new Node(x);
        Node current = head;
        hash.put(x, head);
        while (x != -1) {
            x = sc.nextInt();
            if (x == -1)
                break;
            Node n = new Node(x);
            hash.put(x, n);
            current.next = n;
            current = n;
        }
        current.next = null;
        return head;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        HashMap<Integer, Node> hash = new HashMap<Integer, Node>();
        Node l1 = buildList(hash);

        Node l2 = null;
        int x = sc.nextInt();
        l2 = new Node(x);
        Node temp = l2;

        while (x != -1) {
            x = sc.nextInt();
            if (x == -1)
                break;
            if (hash.containsKey(x)) {
                temp.next = hash.get(x);
                break;
            }
            Node n = new Node(x);
            temp.next = n;
            temp = n;
        }

        System.out.print("L1 - ");
        printLinkedList(l1);
        System.out.print("L2 - ");
        printLinkedList(l2);

        Solution s = new Solution();

        Node intersectionPoint = s.intersectionOfTwoLinkedLists(l1, l2);
        if(intersectionPoint.data==-1) System.out.println("Intersection at node with data = NULL");
        else System.out.println("Intersection at node with data = " + intersectionPoint.data);

    }
}