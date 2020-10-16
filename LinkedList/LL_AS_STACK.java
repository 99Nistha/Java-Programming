package LinkedList;

public class LL_AS_STACK {
    private LinkedList stack;
    //constructor
    public LL_AS_STACK(){
        this.stack= new LinkedList();
    }
    public void push(int data){
        this.stack.addFirst(data);
    }
    public int pop() throws Exception{
        return this.stack.removeFirst();
    }
    public int top() throws Exception{
        return this.stack.getFirst();
    }
    public int size(){
        return this.stack.size();
    }
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }
    public void display(){
        this.stack.display();
    }
}
