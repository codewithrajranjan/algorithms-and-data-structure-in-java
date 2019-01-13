

```java
package selftuts;

class Selftuts{

	public static void main(String[] args) {
		
		int[] arr = {1,1,1,1,0,0,0};
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i<j) {
			int currentLeftElement = arr[i];
			int currentRightElement = arr[j];
			if(currentLeftElement == 0) {
				i++;
			}
			if(currentRightElement == 1) {
				j--;
			}
			
			if(currentLeftElement == 1 && currentRightElement==0) {
				arr[i] = currentRightElement;
				arr[j] = currentLeftElement;
				i++;
				j--;
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		
		
	}
}


```
