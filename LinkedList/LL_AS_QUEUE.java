package LinkedList;

public class LL_AS_QUEUE {
    private LinkedList queue = new LinkedList();
    public void enqueue(int data){
        this.queue.addLast(data);
    }
    public int dequeue() throws Exception{
        return this.queue.removeFirst();
    }
    public int size(){
        int size = this.queue.size();
        return size;
    }
    public int front() throws Exception{
        return this.queue.getFirst();
    }
    public void display(){
        this.queue.display();
    }
}
