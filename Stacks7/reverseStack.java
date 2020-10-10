package Stacks7;

public class reverseStack {
    public static void main(String[] args) throws Exception{
        StacksUsingArray s= new StacksUsingArray(5);
        for(int i=1;i<=5;i++) s.push(i*10);
        s.display();
        StacksUsingArray helper= new StacksUsingArray(5);
        reverseFun(s, helper, 0);
        s.display();
    }
    public static void reverseFun(StacksUsingArray s, StacksUsingArray helper, int index) throws Exception {
        if(s.isEmpty()) return;
        int item=s.pop();
        reverseFun(s,helper,index+1);
        helper.push(item);
        if(index==0){
            while(!helper.isEmpty()) s.push(helper.pop());
        }
    }
}
