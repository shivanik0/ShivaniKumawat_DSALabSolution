package findsum;

class Node{
	int data;
	Node left;
	Node right;
}

public class CreateBST {

	public Node newNode(int nodeData) {
		Node temp = new Node();
		temp.data=nodeData;
		temp.left=null;
		temp.right=null;
		return temp;
	}

	//Insert new node in binary search tree
	public Node insertNode(Node root,int key) {
		Node newnode = newNode(key);
		Node x=root;
		Node y=null;//pointer to x

		while (x!=null) {
			y=x;
			if (key<x.data) {
				x=x.left;
			}
			else if (key>x.data) {
				x=x.right;
			}
			else {
				System.out.print("Duplicate element not allowed");
				return newnode;
			}
		}
		if (y==null) {
			y=newnode;
		}
		else if (key<y.data) {
			y.left=newnode;
		}
		else {
			y.right=newnode;
		}
		return y;	
	}

	//Display values in inorder traversal
	public void inorderTraversal(Node root) {
		if (root==null) {
			return;
		}
		else {
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);	
		}
	}

}
