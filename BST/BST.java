package BST;

public class BST {
    private class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public BST(int[] arr){
        this.root= constrct(arr, 0, arr.length-1);
    }
    private Node constrct(int[] arr, int lo, int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        Node nn= new Node();
        nn.data=arr[mid];
        nn.left= constrct(arr, lo,mid-1);
        nn.right= constrct(arr, mid+1, hi);
        return  nn;
    }

    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        if(node==null) return;
        String str="";
        if(node.left==null) str+=". ";
        else str= str+node.left.data;
        str= str+ "=>" +node.data;
        if(node.right==null) str+=" <= . ";
        else str= str+ "<=" +node.right.data;
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    public boolean find(int item){
        return this.find(this.root, item);
    }
    private boolean find(Node node, int item){
        if(node==null) return false;
        if(item>node.data) return find(node.right, item);
        else if(item<node.data) return find(node.left, item);
        else return true;
    }

    public void add(int item){
        this.add(this.root, item);
    }
    private void add(Node node, int item){
        if(node.data<item){
            if(node.right==null){
                Node nn= new Node();
                nn.data=item;
                node.right=nn;
            }else{
                add(node.right, item);
            }
        }else{
            if(node.left==null){
                Node nn= new Node();
                nn.data=item;
                node.left=nn;
            }else{
                add(node.left, item);
            }
        }
    }

    public int max(){
        return this.max(this.root);
    }
    private int max(Node node){
        if(node.right!=null){
            node=node.right;
            return max(node);
        }else return node.data;
    }

    public void remove(int item){
        this.remove(this.root, null, false,item);
    }
    private void remove(Node node, Node parent, boolean ilc, int item){
        if(node==null) return;
        if(node.data>item){
            remove(node.left, node, true, item);
        }else if(node.data<item){
            remove(node.right, node, false, item);
        }else{
            //if node's left and right child is both null
            if(node.left==null && node.right==null){
                if(ilc) parent.left=null;
                else parent.right= null;
            }
            else if(node.left==null && node.right!=null){
                if(ilc){
                    parent.left=node.right;
                }else{
                    parent.right=node.right;
                }
            }
            else if(node.left!=null && node.right==null){
                if(ilc){
                    parent.left= node.left;
                }else{
                    parent.right= node.left;
                }
            }

            else if(node.left!=null && node.right!=null){
                int max=this.max(node.left);
                node.data=max;
                remove(node.left, node, true, max);
            }

        }
    }
}
