package LinkedList;

public class LinkedList {
    private class node{
        int data;
        node next; //address
    }
    private node head;
    private node tail;
    private int size;
    //o(n)
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public void display(){
        System.out.println("-------------------------");
        node temp= this.head;
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("-------------------------");
    }
    //o(1)
    public void addLast(int data){
        node n= new node();
        n.data=data;
        n.next=null;
        //if head already exist
        if(this.size>=1){
            this.tail.next=n;
        }
        //summary
        if(size==0){
            head=n;
        }
        this.tail=n;
        this.size++;
    }
    //o(1)
    public void addFirst(int data){
        node n= new node();
        n.data=data;
        n.next=null;
        if(size>=1){
            n.next=head;
        }
        if(size==0) tail=n;
        this.head=n;
        this.size++;
    }
    //o(1)
    public int getFirst() throws Exception{
        if(this.size==0) throw new Exception("ll is empty");
        return this.head.data;
    }
    //o(1)
    public int getLast() throws Exception{
        if(this.size==0) throw new Exception("ll is Empty");
        return this.tail.data;
    }
    //O(n)
    public int getAt(int idx) throws Exception{
        if(this.size==0) throw new Exception("ll is empty");
        if(idx<0 || this.size<=idx) throw new Exception("Invalid Index");
        node temp=this.head;
        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp.data;
    }//O(n)
    private node getNodeAt(int idx) throws Exception{
        if(this.size==0) throw new Exception("ll is Empty");
        if(idx<0 || this.size<=idx) throw new Exception("Invalid Index");
        node temp=this.head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    //O(n)
    public void addAt(int idx, int data) throws Exception{
        if(0>idx|| idx>this.size) throw new Exception("Invalid Index");
        if(idx==0) addFirst(data);
        else if(idx==size) addLast(data);
        else{
            node n= new node();
            n.data=data;
            n.next=null;
            node n1=getNodeAt(idx-1);
            node n2=getNodeAt(idx);
            n1.next=n;
            n.next=n2;
            this.size++;
        }
    }
    public int removeFirst() throws Exception{
        if(this.size==0) throw new Exception("ll is Empty");
        int rv=head.data;
        if(this.size==1){
            this.head=null;
            this.tail=null;
            this.size=0;
        }else{
            this.head=this.head.next;
            this.size--;
        }
        return rv;
    }
    public int removeLast() throws Exception{
        if(this.size==0) throw new Exception("ll is Empty");
        int rv=this.tail.data;
        if(this.size==1) {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }else{
            node n2=getNodeAt(this.size-2);
            this.tail=n2;
            this.tail.next=null;
            this.size--;
        }
        return rv;
    }
    public int removeAt(int idx) throws Exception{
        if(this.size==0) throw new Exception("ll is Empty");
        if(idx<0 || this.size<=idx) throw new Exception("Invalid Index");
        int rv;
        if(idx==0) rv=removeFirst();
        else if(idx==this.size-1) rv=removeLast();
        else{
            node np= getNodeAt(idx-2);
            node n=np.next;
            node nn= n.next;
            rv=n.data;
            np.next=nn;
            this.size--;
        }
        return rv;
    }
    public void reverseData() throws Exception{
        int start=0;
        int end= this.size-1;
        while(end>start){
            node ll= getNodeAt(start);
            node rl= getNodeAt(end);
            int temp= ll.data;
            ll.data=rl.data;
            rl.data=temp;
            start++;
            end--;
        }
    }
    public void reversePointer(){
        node prev= this.head;
        node current=prev.next;
        while(current!=null){
            node ahead=current.next;
            current.next=prev;
            prev=current;
            current=ahead;
        }
        node temp=this.head;
        this.head= this.tail;
        this.tail= temp;
        this.tail.next=null;
    }
    public int mid(){
        node fast= this.head;
        node slow= this.head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
    public int KthNode(int idx) throws Exception{
        if(idx<=0 || this.size<idx) throw new Exception("Invalid Index");
        node fast= this.head;
        node slow=this.head;
        for(int i=0;i<idx;i++) fast = fast.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
}
