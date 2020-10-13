package Queue;

public class StackUsing2QueuePopEffCode {
    public static void main(String[] args) throws Exception{
        StackUsing2QueuePopEff s= new StackUsing2QueuePopEff();
        for(int i=1;i<=6;i++) s.push(i*10);
        s.display();
        s.pop();
        s.display();
        System.out.println(s.top());
    }
}
