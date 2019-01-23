


```java

package selftuts;

import javax.swing.plaf.basic.BasicTreeUI.TreeTraverseAction;

class TreeNode {
	int data;
	TreeNode leftNode = null;
	TreeNode rightNode = null;
	public TreeNode(int data) {
		this.data = data;
	}
}
class Counter {
	int count = 0;
	public void increase() {
		this.count++;
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
		
		Counter c = new Counter();
		
		traverse(one,c);
		
		int size = c.count;
		System.out.println(size);

		
		
	}
	public static void traverse(TreeNode root,Counter counter) {
		if(root == null) {
			return;
		}
		counter.increase();
		traverse(root.leftNode, counter);
		traverse(root.rightNode, counter);
	}
}








```
