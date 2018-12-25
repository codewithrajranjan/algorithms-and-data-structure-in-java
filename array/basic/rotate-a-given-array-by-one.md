

```java

package selftuts;

public class Selftuts {

	public static void main(String[] args) {
		
		int[] arr = {5,10,3,4};
		
		int temp = arr[0];
		
		for(int i=1;i<=arr.length-1;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = temp;
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}



```
