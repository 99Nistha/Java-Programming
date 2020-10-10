package Stacks7;

public class DynamicStaticClient {
    public static void main(String[] args) throws Exception{
        StacksUsingArray s= new DynamicStack(5);
        for(int i=1;i<=5;i++) {
            s.push(i*10);
            s.display();
        }
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.display();
        System.out.println(s.top());
        while(!s.isEmpty()){
            s.display();
            s.pop();
        }
    }
}
