package Queue;

public class QueueUsing2StackDequeEff {
    private DynamicStack primary;
    private DynamicStack secondary;
    //constructor
    public QueueUsing2StackDequeEff() throws Exception{
        this.primary= new DynamicStack();
        this.secondary=new DynamicStack();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public int size(){
        return this.primary.size();
    }
    public void enqueue(int data) throws Exception{
        while(!primary.isEmpty())secondary.push(primary.pop());
        primary.push(data);
        while(!secondary.isEmpty())primary.push(secondary.pop());
    }
    public int dequeue() throws Exception{
        int rv= primary.top();
        primary.pop();
        return rv;
    }
    public int front() throws Exception{
        return primary.top();
    }
    public void display(){
        primary.display();
    }
}
