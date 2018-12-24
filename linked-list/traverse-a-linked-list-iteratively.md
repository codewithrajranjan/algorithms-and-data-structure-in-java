

```java

package selftuts;

class Node {
	int data;
	Node next = null;
}

public class Selftuts {
	
	public static void main(String[] args) {
		
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
		traverseLinkedList(head);
		
	}
	
	public static void traverseLinkedList(Node head) {
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
}


```
