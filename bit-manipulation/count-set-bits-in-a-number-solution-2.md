Masking and right shift operation on bit


```java
package selftuts;

class Selftuts{

	public static void main(String[] args) {
		
		int number = 15;
		
		int countBitsNumber = 0;
		
		while(number!=0) {
			int maskingNumber = 1;
			int valueOfLastBit = number & maskingNumber;
			if(valueOfLastBit == 1) {
				countBitsNumber++;
			}
			
			number = number >> 1;
		}
		System.out.println(countBitsNumber);
		
		
	}
}


```
