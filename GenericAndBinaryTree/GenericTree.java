package GenericAndBinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    private class Node{
        int data;
        ArrayList<Node> children;
        Node(int data){
            this.data=data;
            this.children= new ArrayList<>();
        }
    }
    private Node root;
    private int size;

    GenericTree(){
        Scanner s= new Scanner(System.in);
        this.root= takeInput(s, null,0);
    }

    private Node takeInput(Scanner s, Node parent, int ithchild){
        if(parent==null) System.out.println("Enter the data for root node");
        else System.out.println("enter the date for the "+ithchild+"th child of "+parent.data);
        int nodeData=s.nextInt();
        Node node= new Node(nodeData);
        this.size++;

        System.out.println("Enter the number of children for "+node.data);
        int children= s.nextInt();
        for(int i=0;i<children;i++){
            Node child= this.takeInput(s,node,i);
            node.children.add(child);
        }
        return node;
    }

    public void display(){
        this.display(this.root);
    }
    private void display(Node node) {
        String str = node.data + "=>";
        for (int i = 0; i < node.children.size(); i++) str = str + node.children.get(i).data + ", ";
        str = str + "END";
        System.out.println(str);
        for (int i = 0; i < node.children.size(); i++) this.display(node.children.get(i));
    }
}
