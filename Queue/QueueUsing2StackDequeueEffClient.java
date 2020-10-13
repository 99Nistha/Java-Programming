package Queue;

public class QueueUsing2StackDequeueEffClient {
    public static void main(String[] args) throws Exception{
        QueueUsing2StackDequeEff q= new QueueUsing2StackDequeEff();
        for(int i=1;i<=6;i++) q.enqueue(i*10);
        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.front());
    }
}
