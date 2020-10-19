package GenericAndBinaryTree;

import java.util.ArrayList;

public class BinaryTreeClient {
    public static void main(String[] args) {
        //// 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false false
        BinaryTree tree= new BinaryTree();
        tree.display();
        System.out.print("Height of Binary tree is= "+tree.height());
        System.out.println();
        System.out.print("PreOrder Traversal= ");
        tree.PreOrder();
        System.out.println();
        System.out.print("PostOrder Traversal= ");
        tree.PostOrder();
        System.out.println();
        System.out.print("InOrder Traversal= ");
        tree.InOrder();
        System.out.println();
        System.out.print("LevelOrder Traversal= ");
        tree.levelOrder();
        System.out.println();
        System.out.print("Is this BST= "+tree.isBST());
        System.out.println();
        System.out.print("InOrder Iterative Traversal= ");
        ArrayList<Integer> a= new ArrayList<>();
        a=tree.InOrderI();
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+", ");
        }
        System.out.println();
        System.out.print("Diameter of BT "+tree.diameter());
        System.out.println();
        System.out.print("sum of all leaf of BT using Iteration= "+tree.sumI());
        System.out.println();
        System.out.print("sum of all leaf of BT using Recursion= "+tree.sum());
    }
}
