package Queue;

import java.util.*;

public class FirstNoneRepeatingChar {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        char ch=scn.next().charAt(0);
        HashMap<Character,Integer> map= new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        while(ch!='.'){
            q.add(ch);
            if(map.containsKey(ch)){
                int ov=map.get(ch);
                ov++;
                map.put(ch,ov);
            }else{
                map.put(ch,1);
            }
            while(!q.isEmpty()){
                if(map.get(q.peek())==1){
                    System.out.println(q.peek());
                    break;
                }else q.poll();
            }
            if(q.isEmpty()) System.out.println("-1");
            ch=scn.next().charAt(0);
        }
    }
}
