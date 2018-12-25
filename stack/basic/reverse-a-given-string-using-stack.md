

```java

package selftuts;

import java.util.Stack;

public class Selftuts {

	public static void main(String[] args) {
		
		String str = "abcd";
		Stack<Character> st = new  Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			st.push(str.charAt(i));
		}
			
		while(st.isEmpty()==false) {
			Character ch = st.pop();
			System.out.print(ch);
		}
	}
}



```
