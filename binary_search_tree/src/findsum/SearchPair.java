package findsum;

public class SearchPair {
	boolean nodesFound;
	boolean result;

	//The below method is used to find & print the node pair. If condition is only run till required node is found, so only first matching pair via inorder is printed.
	public void findNodes(Node currentnode, Node root, int sum) {
		//Exit condition
		if (currentnode==null) {
			return;
		}
		else {
			findNodes(currentnode.left, root, sum);
			int requiredData = sum - currentnode.data;
			if(requiredData != currentnode.data && !nodesFound) {
				result=search(root,requiredData);
				if (result==true) {
					System.out.println("Pair is ("+requiredData+","+currentnode.data+")");
					nodesFound = true;
				}
			}
			findNodes(currentnode.right, root, sum);	
		}
	}

	//This method calls the recursive search function and returns true/false based on whether the required value is found in any node
	public boolean search(Node root, int key) {
		root=searchRecursive(root,key);
		if (root!=null)
			return true;
		else
			return false;
	}

	//This method searches the left and right tree for the required value
	public Node searchRecursive (Node root, int key) {
		if (root==null || key==root.data)
			return root;
		else if (key<root.data){
			return searchRecursive(root.left,key);
		}
		return searchRecursive(root.right,key);
	}
}
