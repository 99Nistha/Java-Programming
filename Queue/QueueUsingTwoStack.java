package Queue;

public class QueueUsingTwoStack {
    private DynamicStack primary;
    private DynamicStack secondary;
    //constructor
    public QueueUsingTwoStack() throws Exception {
        this.primary=new DynamicStack();
        this.secondary=new DynamicStack();
    }
    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public int size(){
        return this.primary.size();
    }
    public void enqueue(int data) throws Exception{
        this.primary.push(data);
    }
    public int dequeue() throws Exception{
        while(primary.size()!=1) secondary.push(primary.pop());
        int rv= primary.pop();
        while(!secondary.isEmpty()){primary.push(secondary.pop());}
        return rv;
    }
    public int front() throws Exception{
        while(primary.size()!=1) secondary.push(primary.pop());
        int rv= primary.top();
        while(!secondary.isEmpty()){primary.push(secondary.pop());}
        return rv;
    }
    public void display() throws Exception {
        reverse(primary,secondary,0);
        primary.display();
        reverse(primary,secondary,0);
    }
    private void reverse(DynamicStack stack, DynamicStack helper, int index) throws Exception {
        if(stack.isEmpty()) return;
        int item= stack.pop();
        reverse(stack,helper,index+1);
        helper.push(item);
        if(index==0){
            while(!helper.isEmpty()){
                stack.push(helper.pop());
            }
        }
    }

}
