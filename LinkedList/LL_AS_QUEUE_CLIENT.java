package LinkedList;

public class LL_AS_QUEUE_CLIENT {
    public static void main(String[] args) throws Exception {
        LL_AS_QUEUE q= new LL_AS_QUEUE();
        for(int i=1;i<=5;i++){
            q.enqueue(i*10);
            q.display();
        }
        for(int i=1;i<=3;i++){
            System.out.println(q.dequeue());
            q.display();
        }
        System.out.println(q.front());
        System.out.println(q.size());
    }
}
