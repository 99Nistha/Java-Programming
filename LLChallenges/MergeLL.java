package LLChallenges;

import java.util.*;
class MergeLL {

    private class Node {

        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return head.data;
    }

    public int getLast() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return tail.data;
    }

    public void addLast(int item) {
        // create a new node
        Node nn = new Node();

        nn.data = item;
        nn.next = null;

        // update summary
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else

        {
            this.tail.next = nn;
            this.tail = nn;

            size++;
        }

    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            size++;
        }

    }

    public int removeFirst() throws Exception {
        Node fn = this.head;

        if (this.size == 0)
            throw new Exception("linked list is empty");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size = 0;
        } else {
            Node np1 = this.head.next;
            this.head = np1;
            size--;
        }
        return fn.data;
    }

    public void merge_sorted_list(MergeLL other) throws Exception {
        // write your code here
        MergeLL l= new MergeLL();
        while(this.head!=null && other.head!=null){
            if(this.getFirst()<=other.getFirst()){
                l.addLast(this.getFirst());
                this.head= this.head.next;
            }else{
                l.addLast(other.getFirst());
                other.head= other.head.next;
            }
        }
        while(this.head!=null){
            l.addLast(this.getFirst());
            this.head=this.head.next;
        }
        while(other.head!=null){
            l.addLast(other.getFirst());
            other.head= other.head.next;
        }
        l.display();
        System.out.println();
    }

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        int t = scn.nextInt();

        while(t > 0){

            MergeLL list1 = new MergeLL();
            int n1 = scn.nextInt();

            for (int j = 0; j < n1; j++) {
                int item = scn.nextInt();
                list1.addLast(item);
            }

            MergeLL list2 = new MergeLL();
            int n2 = scn.nextInt();

            for (int j = 0; j < n2; j++) {
                int item = scn.nextInt();
                list2.addLast(item);
            }
            list1.merge_sorted_list(list2);

            t--;
        }

    }
}
