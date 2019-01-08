## This solution is based on finding the length of linked list and then finding middle node position from front based on the even or odd number of elements in Linked List.

```java

package selftuts;

class Node {
	int data;
	Node next = null;
}

public class Selftuts {
	
	public static void main(String[] args) {
		
		// Linked list creation
		Node node1 = new Node();
		node1.data = 1;
		
		Node node2 = new Node();
		node2.data = 2;
		node1.next = node2;
		
		Node node3 = new Node();
		node3.data = 3;
		node2.next = node3;
		
		Node node4 = new Node();
		node4.data = 4;
		node3.next = node4;

		Node node5 = new Node();
		node5.data = 5;
		node4.next = node5;		

		
		Node head = node1;
		
		int linkedListLength = findLength(head);
				
		int middleNode = linkedListLength/2;
		
		if(linkedListLength%2 !=0 ) {
			middleNode = middleNode + 1;
		}
		
		Node temp = head;
		
		for(int i=1;i<middleNode;i++) {
			temp = temp.next;
		}
		
		System.out.println(temp.data);
		
		
		
	}
	
	// method to find the lenght of Linked List
	public static int findLength(Node head) {
		Node temp = head;

		int count = 0;
		if(temp == null) {
			return count;
		}
		
		while(temp != null) {
			count ++;
			temp = temp.next;
		}
		
		return count;
	}
	
}
```
