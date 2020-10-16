package LinkedList;

public class LL_AS_STACK_CLIENT {
    public static void main(String[] args) throws Exception {
        LL_AS_STACK s= new LL_AS_STACK();
        for(int i=1;i<=5;i++){
            s.push(i*10);
            s.display();
        }
        for(int i=1;i<=2;i++){
            System.out.println(s.pop());
            s.display();
        }
        System.out.println(s.top());
        System.out.println(s.size());
    }
}
