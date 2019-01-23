

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
