package BinaryTreeLink;

public class FullBinaryTree {
    public void insert(node root, String newData) {
        if (newData.compareTo(root.data) < 0) {
            if (root.left != null){
                insert(root.left, newData);
            }
            else {
                root.left = new node();
                root.left.input(newData);
                System.out.println(newData + " di kiri  " + root.data);
            }
        } else if (newData.compareTo(root.data) >= 0) {
            if (root.right != null){
                insert(root.right, newData);
            }
            else {
                root.right = new node();
                root.right.input(newData);
                System.out.println(newData + " di kanan " + root.data);
            }
        }
    }

    public void inOrder(node node){
        if (node != null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    public void preOrder(node node){
        if (node != null){
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(node node){
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

}