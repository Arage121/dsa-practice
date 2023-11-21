import java.util.Scanner;

public class CustomBinaryTree {
    private class Node{
        private Node left;
        private Node right;
        private int data;
        Node(int val){
            this.data = val;
        }
    }
    private Node root;

    public void CustomBinaryTree(){

    }

    public void populate(Scanner sc){
        System.out.println("Enter the root node:");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter the left of "+ node.data);
        boolean isLeft = sc.nextBoolean();
        if(isLeft){
            System.out.println("Enter the val: ");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter the right of "+ node.data);
        boolean isRight = sc.nextBoolean();
        if(isRight){
            System.out.println("Enter the val: ");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){
        if(node == null) return;
        System.out.println(indent + node.data);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null) return;
        prettyDisplay(node.right, level+1); // first printing right of the node

        if(level != 0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("---->"+node.data); // printing the right and left according to their levels
        }else{
            System.out.println(node.data); // root node at level=0
        }

        prettyDisplay(node.left, level+1);
    }
}
