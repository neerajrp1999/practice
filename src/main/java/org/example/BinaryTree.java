package org.example;

import java.util.Stack;

public class BinaryTree {
    BinaryTree Left;
    BinaryTree Right;

    int data;
    public BinaryTree getLeft() {
        return Left;
    }

    public void setLeft(BinaryTree left) {
        Left = left;
    }

    public BinaryTree getRight() {
        return Right;
    }

    public void setRight(BinaryTree right) {
        Right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}

class Node{
    int data;
    Node Left;
    Node Right;
    Node(int data){
        this.data=data;
        Left=Right=null;
    }
}
class BinaryTree1{
    Node head;
    public void add(int data){
        if(head==null){
            head=new Node(data);
        }
    }
    public void add(Node temphead,int data){
        if(temphead.data<data) {
            if(temphead.Right==null){
                temphead.Right=new Node(data);
            }else add(temphead.Right, data);
        }
        else {
            if(temphead.Left==null){
                temphead.Left=new Node(data);
            }else add(temphead.Left, data);
        }

    }
    public static boolean preorderIterative(Node root) {
        if (root == null) {
            return true;
        }
        Stack<Node> stack = new Stack<>();
        int pre= root.data;
        stack.push(root);

        while (!stack.empty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");
            //System.out.print(pre + " ");
            //if(pre> curr.data)
              //  return false;
            pre= curr.data;
            if (curr.Left != null) {
                stack.push(curr.Left);
            }
            if (curr.Right != null) {
                stack.push(curr.Right);
            }

        }
        return true;
    }

    public static boolean inOrderTraversal(Node root) {
        if (root == null) {
            return true;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;
        int p=Integer.MIN_VALUE;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.Left;
            }
            current = stack.pop();
            System.out.print(current.data + " ");
            if(p>current.data)
                return false;
            p=current.data;
            current = current.Right;
        }
        return true;
    }
    public static void preorderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.data + " ");

            if (node.Right != null) {
                stack.push(node.Right);
            }

            if (node.Left != null) {
                stack.push(node.Left);
            }
        }
    }
    public int print(Node temp){
        if(temp!=null) {
            int a=print(temp.Left);
            int b=print(temp.Right);
            System.out.println(temp.data>a);
            System.out.println(temp.data);
            System.out.println(a);
            System.out.println(temp.data<b);
            System.out.println(temp.data);
            System.out.println(temp.data);
            return temp.data;
        }else return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        BinaryTree1 b=new BinaryTree1();
        Node hed=new Node(65);
        b.add(hed,67);
        b.add(hed,61);
        b.add(hed,67);
        b.add(hed,68);
        b.add(hed,57);
        b.add(hed,67);
        b.add(hed,87);
        b.add(hed,17);
        b.add(hed,60);
        b.add(hed,65);
        b.add(hed,167);
        b.add(hed,7);

        System.out.println(b.inOrderTraversal(hed));
    }
}


