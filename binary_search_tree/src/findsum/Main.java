package findsum;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int choice,key,sum;
		char ch;

		//initialize root node with null
		Node root=null;
		Node currentnode=null;

		CreateBST bst=new CreateBST();
		SearchPair searchpair=new SearchPair();
		//Menu
		do {
			System.out.print("Please enter the choice:\n1. Add node in BST\n2. Search for pair corresponding to the entered sum in BST\n3. Display Tree in Inorder\n\nYour input:");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("\nEnter the value to be inserted:");
				key=scanner.nextInt();
				if (root==null)
					root=bst.insertNode(root,key);
				else
					bst.insertNode(root, key);
				break;
			case 2:
				System.out.print("\nSum = ");
				sum=scanner.nextInt();
				currentnode=root;
				searchpair.nodesFound=false;
				searchpair.findNodes(currentnode,root,sum);
				if (searchpair.nodesFound==false) {
					System.out.println("Nodes are not found");
				}
				break;
			case 3:
				System.out.println("\nInorder of the Binary Search Tree is:");
				bst.inorderTraversal(root);
				break;
			default:
				System.out.println("Invalid selection! Please try again.");
				break;
			}
			System.out.println("\nDo you want to continue? (Press Y or N)");
			ch=scanner.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		scanner.close();
	}
}
