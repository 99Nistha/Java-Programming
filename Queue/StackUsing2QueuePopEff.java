package Queue;

public class StackUsing2QueuePopEff {
    private DynamicQueue primary;
    private DynamicQueue secondary;
    //constructor
    public StackUsing2QueuePopEff() throws Exception{
        this.primary= new DynamicQueue();
        this.secondary= new DynamicQueue();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public int size(){
        return this.primary.size();
    }
    public void push(int value) throws Exception{
        while(!primary.isEmpty()) secondary.enqueue(primary.dequeue());
        primary.enqueue(value);
        while(!secondary.isEmpty()) primary.enqueue(secondary.dequeue());
    }
    public int pop() throws Exception{
        return this.primary.dequeue();
    }
    public int top() throws Exception{
        return this.primary.front();
    }
    public void display(){
        this.primary.display();
    }
}

