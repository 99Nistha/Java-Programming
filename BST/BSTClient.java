package BST;

import java.util.*;

public class BSTClient {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        BST tree= new BST(arr);
        tree.display();
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a value you want to search= ");
        int item= scn.nextInt();
        System.out.print("is "+item+" present in our tree: "+tree.find(item));
        System.out.println("Enter a value you want to Add= ");
        int val= scn.nextInt();
        System.out.println("Add "+val+" in the tree");
        tree.add(val);
        tree.display();
        System.out.println("Max value in our tree: "+tree.max());
        System.out.println("Enter a value you want to remove= ");
        int r= scn.nextInt();
        System.out.println("Remove "+r+" in the tree");
        tree.remove(r);
        tree.display();
    }
}
