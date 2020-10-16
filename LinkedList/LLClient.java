package LinkedList;

public class LLClient {
    public static void main(String[] args) throws Exception{
        LinkedList ll= new LinkedList();
        //System.out.println("First value is: "+ll.getFirst());
        //System.out.println("Last value is: "+ll.getLast());
        //System.out.println("value at index 2: "+ll.getAt(2));
        ll.addFirst(100);
        for(int i=1;i<=5;i++) ll.addLast(i*10);
        ll.addFirst(55);
        System.out.println("First value is: "+ll.getFirst());
        System.out.println("Last value is: "+ll.getLast());
        System.out.println("value at index 2: "+ll.getAt(2));
        ll.display();
        System.out.println("add value at index 3: ");
        ll.addAt(3,7);
        ll.display();
        System.out.println("Remove first node: "+ll.removeFirst());
        ll.display();
        System.out.println("Remove last node: " +ll.removeLast());
        ll.display();
        System.out.println("Remove At index 2: " +ll.removeAt(2));
        ll.display();
        System.out.println("Reversing the ll: ");
        ll.reverseData();
        ll.display();
        System.out.println("Reversing the ll: ");
        ll.reversePointer();
        ll.display();
        ll.addFirst(300);
        ll.display();
        System.out.println("mid value: " +ll.mid());
        ll.display();
        System.out.println("2nd value from last: " +ll.KthNode(2));
    }
}
