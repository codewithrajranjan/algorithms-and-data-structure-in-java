
# First File : Selftuts.java

==================================================

```java

package selftuts;


class Selftuts{

	public static void main(String[] args) throws Exception {
		
		StackLL st = new StackLL();
		st.display();
		st.push(1);
		st.push(2);

		int data = st.peek();
		System.out.println(data);

		int removedElement = st.pop();
		System.out.println(removedElement);

		int size = st.size();
		System.out.println(size);
		
	}
}

```




# Second File : StackLL.java

==================================================


```java
package selftuts;


class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
public class StackLL {
	
	private Node head;
	
	public StackLL() {
		this.head  = null;
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}
	
	public void display() {
		if(this.head == null){
			System.out.println("Stack is empty");
		}
		Node temp = this.head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public int peek() throws Exception {
		if(this.head == null) {
			System.out.println("Stack is empty");
			throw new Exception("Stack is empty");
		}
		return this.head.data;
	}
	public int pop() throws Exception {
		if(this.head == null) {
			System.out.println("Stack is empty");
			throw new Exception("Stack is emtpty");
		}
		Node temp = head;
		this.head = this.head.next;
		return temp.data;
	}
	public int size() {
		if(this.head == null) {
			return 0;
		}
		Node temp = this.head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

}


















```
