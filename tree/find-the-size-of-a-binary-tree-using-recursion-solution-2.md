


```java

package selftuts;

class TreeNode {
	int data;
	TreeNode leftNode = null;
	TreeNode rightNode = null;
	public TreeNode(int data) {
		this.data = data;
	}
}

class Selftuts{

	public static void main(String[] args) {

		/*  we will be creating this tree
		 * 					1
		 * 				 /     \
		 *			    2 	    3
		 *			  /   \     
		 *			 4     5  
		 * 						
		 */
		
		// Tree creation code starts 
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		one.leftNode = two;
		one.rightNode = three;
		two.leftNode = four;
		two.rightNode = five;
		// Tree creation code ends
		
		int totalSize = size(one);
		System.out.println(totalSize);
		
		
	}
	
	public static int size(TreeNode root) {
		if(root == null) {
			return 0;
		}
		//int sizeOfLeftSubtree = size(root.leftNode);
		//int sizeOfRightSubtree = size(root.rightNode);

		//return 1 + sizeOfLeftSubtree + sizeOfRightSubtree;
		return 1 + size(root.leftNode) + size(root.rightNode);
	}
}









```
