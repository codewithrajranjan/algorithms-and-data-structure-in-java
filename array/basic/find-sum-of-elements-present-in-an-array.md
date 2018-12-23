


```java

package selftuts;

public class Selftuts {
	
	public static void main(String[] args) {
		
		// we declare the integer array
		int[] arr = new int[8];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		
		
		// sum of these numbers
		int sum = 0;
		
		int lengthOfArray = arr.length;

		for(int i=0;i<lengthOfArray;i++) {

			sum = sum + arr[i];
		}
		// loop1  sum = 0 + 1
		// loop2  sum = 0 + 1 + 2
		// loop3  sum = 0 + 1 + 2 + 3
		
		System.out.println(sum);
		
	}

}






```
