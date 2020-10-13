package Queue;

public class StackUsing2QueuePushEff {
    private DynamicQueue primary;
    private DynamicQueue secondary;
    //constructor
    public StackUsing2QueuePushEff() throws Exception{
        this.primary=new DynamicQueue();
        this.secondary= new DynamicQueue();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public int size(){
        return this.primary.size();
    }
    public void push(int value) throws Exception {
        this.primary.enqueue(value);
    }
    public int pop() throws Exception{
        while(primary.size()!=1){
            secondary.enqueue(primary.dequeue());
        }
        int rv= primary.dequeue();
        while(!secondary.isEmpty()){
            primary.enqueue(secondary.dequeue());
        }
        return rv;
    }
    public int top() throws Exception{
        while(primary.size()!=1){
            secondary.enqueue(primary.dequeue());
        }
        int rv= primary.dequeue();
        this.secondary.enqueue(rv);
        while(!secondary.isEmpty()){
            primary.enqueue(secondary.dequeue());
        }
        return rv;
    }
    public void display() throws Exception {
        reverse(primary);
        primary.display();
        reverse(primary);
    }
    private void reverse(DynamicQueue queue) throws Exception{
        if(queue.isEmpty()) return;
        int element= queue.dequeue();
        reverse(queue);
        queue.enqueue(element);
    }
}
