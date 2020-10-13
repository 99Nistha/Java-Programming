package Queue;

import java.util.LinkedList;

public class QueueLinkedList {
    LinkedList<Integer> q;
    //constructor
    QueueLinkedList(){
        q=new LinkedList<>();
    }
    public boolean isEmpty(){
        return q.isEmpty();
    }
    public void enqueue(int data){
        q.addLast(data);
    }
    public void dequeue(){
        q.removeFirst();
    }
    public int getFront(){
        return q.getFirst();
    }

    public static void main(String[] args) {
        QueueLinkedList q=new QueueLinkedList();
        for(int i=1;i<=5;i++) q.enqueue(i*10);
        q.dequeue();
        q.dequeue();
        q.enqueue(100);
        while(!q.isEmpty()){
            System.out.println(q.getFront());
            q.dequeue();
        }
    }

}
