package GenericAndBinaryTree;

import sun.java2d.loops.ScaledBlit;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;
        //const
        Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    Node root=null;
    int size=0;
    //constructor
    BinaryTree(){
        Scanner scn= new Scanner(System.in);
        this.root= takeInput(scn,null,false);
    }
    private Node takeInput(Scanner scn, Node parent, boolean isLeftOrRight){
        if(parent==null) System.out.println("Enter the value of root");
        else{
            if(isLeftOrRight) System.out.println("Enter the left Node value of "+parent.data);
            else System.out.println("Enter the right Node value of "+parent.data);
        }
        int nodeData= scn.nextInt();
        Node node= new Node(nodeData, null, null);
        this.size++;
        boolean check=false;
        System.out.println("Do you have left child of "+node.data);
        check=scn.nextBoolean();
        if(check){
            node.left=takeInput(scn, node, true);
        }
        check=false;
        System.out.println("Do you have right child of "+node.data);
        check=scn.nextBoolean();
        if(check){
            node.right=takeInput(scn, node, false);
        }
        return node;
    }

    public void display(){
        this.display(this.root);
    }
    private void display(Node root){
        String str="";
        if(root.left!=null) str+=root.left.data+"=>";
        else str+="END=>";
        str+=root.data;
        if(root.right!=null) str+="<="+root.right.data;
        else str+="<=END";
        System.out.println(str);
        if(root.left!=null) this.display(root.left);
        if(root.right!=null) this.display(root.right);
    }

    public int height(){
        return this.height(this.root);
    }
    private int height(Node node){
        if(node==null) return -1;
        int lHeight= this.height(node.left);
        int rHeight= this.height(node.right);
        int h= Math.max(lHeight, rHeight)+1;
        return h;
    }

    public void PostOrder(){
        this.PostOrder(this.root);
        System.out.print("END");
    }
    private void PostOrder(Node node){
        if(node==null) return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.data+", ");
    }

    public void PreOrder(){
        this.PreOrder(this.root);
        System.out.print("END");
    }
    private void PreOrder(Node node){
        if(node==null) return;
        System.out.print(node.data+", ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void InOrder(){
        this.InOrder(this.root);
        System.out.print("END");
    }
    private void InOrder(Node node){
        if(node==null) return;
        InOrder(node.left);
        System.out.print(node.data+", ");
        InOrder(node.right);
    }

    public void levelOrder(){
        LinkedList<Node> q= new LinkedList<>();
        q.add(this.root);
        while(!q.isEmpty()){
            Node rv= q.removeFirst();
            System.out.print(rv.data+", ");
            if(rv.left!=null) q.addLast(rv.left);
            if(rv.right!=null) q.addLast(rv.right);
        }
        System.out.print("END");
    }
    public boolean isBST(){
        return this.isBST(this.root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
    private boolean isBST(Node node, int max, int min){
        if(node==null) return true;
        if(node.data>max || node.data<min) return false;
        else if(!isBST(node.left, node.data, min)) return false;
        else if(!isBST(node.right, max, node.data)) return false;
        return true;
    }

    public ArrayList InOrderI(){
        Stack<Node> s= new Stack<>();
        ArrayList<Integer> a= new ArrayList<>();
        Node node= this.root;
        if(node==null){
            return a;
        }
        while(true){
            if(node!=null){
                s.push(node);
                node=node.left;
            }else{
                if(s.isEmpty()) break;
                else{
                    node= s.pop();
                    a.add(node.data);
                    node=node.right;
                }
            }
        }
        return a;
    }

    public int diameter(){
        return this.diameter(this.root);
    }
    private int diameter(Node node){
        if(node==null) return 0;
        int m1= this.height(node.left)+this.height(node.right)+2;
        int m2= this.diameter(node.left);
        int m3= this.diameter(node.right);
        return Math.max(m1, Math.max(m2, m3));
    }

    public int sum(){
        return this.sum(this.root);
    }
    private int sum(Node node){
        if(node==null) return 0;
        if(node.left==null && node.right==null) return node.data;
        int ls= sum(node.left);
        int rs= sum(node.right);
        return ls+rs;
    }

    public int sumI(){
        Stack<Node> s= new Stack<>();
        Node node= this.root;
        int sum=0;
        while(true){
            if(node==null){
                if(s.isEmpty()) break;
                else{
                    node=s.pop();
                    node=node.right;
                }
            } else if(node.left!=null){
                s.push(node);
                node=node.left;
            } else{
                if(s.isEmpty()) break;
                else{
                    sum = sum + node.data;
                    node= s.pop();
                    node=node.right;
                }
            }
        }
        return sum;
    }
}
