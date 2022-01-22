package practice.datastructure.graphtrees;

//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/
public class HeightOfBinaryTree {

    public static void main(String[] args) {

    }

    public int height(Node node){
    if(node == null)
        return 0;

    int left = height(node.left);
    int right = height(node.right);
    return 1+ Math.max(left, right);
    }
}

class Node{
    int data;
    Node left;
    Node right;

    Node(int item){
        data = item;
        left = right = null;
    }
}
