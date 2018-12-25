

```java

package selftuts;

import java.util.Stack;

public class Selftuts {

	public static void main(String[] args) {
		
		String str1 = "selftuts is a good channel";
		String str2 = "selftuts is a good channel";
		
		int lengthOfStringOne = str1.length();
		int lengthOfStingTwo = str2.length();

		boolean isEqual = true;

		if(lengthOfStringOne != lengthOfStingTwo) {
			System.out.println(false);
		}else {
			
			for(int i=0;i<lengthOfStringOne;i++) {
				if(str1.charAt(i) != str2.charAt(i)) {
					isEqual = false;
					break;
				}

			}
			
			System.out.println(isEqual);
			
		}
		
		
		
	}
}



```
