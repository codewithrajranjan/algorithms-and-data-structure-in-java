- we will find the binary representation of the number and then we will maintian a count variable and increase the vale of count variable whenever we will find a set bit.

```java
package selftuts;

class Selftuts{

	public static void main(String[] args) {
		
		int number = 15;
		int countSetBits = 0;
		
		while(number!=0) {
			int remainder = number % 2;
			if(remainder == 1) {
				countSetBits++;
			}
			number = number / 2;
		}
		
		System.out.println(countSetBits);

	}
}

```
