


```java

package selftuts;

import java.util.Stack;

public class Selftuts {

	public static void main(String[] args) {
		
		int[] arr = {18,24,32,14,5,99,67,88};
		
		int numberTofind = 167;
	
		int indexOfNumber = -1;

		for(int i=0;i<arr.length;i++) {
			int currentElement = arr[i];
			if(currentElement == numberTofind) {
				indexOfNumber = i;
				break;
			}
		}
		
		System.out.println(indexOfNumber);
		
	}
}




```
