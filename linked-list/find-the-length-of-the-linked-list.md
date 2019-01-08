
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
		
		node4.next = null;
		
		Node head = node1;
		
		int lengthOfLinkedList = findLength(head);
		
		System.out.println(lengthOfLinkedList);
	}
	
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
