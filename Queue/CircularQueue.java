package Queue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.bind.annotation.XmlType;

public class CircularQueue {
    private int[] arr;
    private int cs;
    private int ms;
    private int front;
    private int rear;
    public static final int DEFAULT_CAPACITY=10;
    //constructor
    CircularQueue() throws Exception{
        this(DEFAULT_CAPACITY);
    }
    CircularQueue(int capacity) throws Exception{
        if(capacity<1) System.out.println("Invalid Capacity");
        this.arr= new int[capacity];
        int cs=0;
        int ms=capacity;
        int front=0;
        int rear= capacity-1;
    }
    public int size() {
        return this.cs;
    }
    public boolean isFull(){
        return this.size()==this.arr.length;
    }
    public boolean isEmpty(){
        return this.size()==0;
    }
    public void enqueue(int data) throws Exception {
        if(isFull()) throw new Exception(" Queue is full");
        else{
            int ai=(this.front+this.cs)%this.arr.length;
            this.arr[ai]=data;
            this.cs++;
        }
    }
    public int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("Queue is Empty");
        else{
            this.front=(this.front+1)%this.arr.length;
            int rv= this.arr[front];
            this.cs--;
            return rv;
        }
    }
    public int getFront() throws Exception{
        if(this.size()==0) throw new Exception("Queue is Empty");
        return this.arr[this.front];
    }
    public void display(){
        for(int i=0;i<this.cs;i++) {
            int ai=(this.front+i)%this.arr.length;
            System.out.print(this.arr[ai]+", ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception{
        CircularQueue q= new CircularQueue();
        for(int i=1;i<=6;i++) {
            q.enqueue(i);
            q.display();
        }
        q.dequeue();
        q.dequeue();
        q.enqueue(8);
        q.display();
        while(!q.isEmpty()){
            System.out.print(q.getFront()+", ");
            q.dequeue();
        }
    }
}
