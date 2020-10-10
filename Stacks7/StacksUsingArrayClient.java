package Stacks7;

public class StacksUsingArrayClient {
    public static void main(String[] args) throws Exception{
        StacksUsingArray s= new StacksUsingArray(5);
        for(int i=1;i<=5;i++){
            //s.top();
            s.push(i*10);
            s.display();
            System.out.println(s.top());
        }
        //s.push(70);
        while(!s.isEmpty()){
            System.out.println(s.top());
            s.pop();
            s.display();
            //System.out.println(s.top());
        }
        //s.pop();
    }

}
