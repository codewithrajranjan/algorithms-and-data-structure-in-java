
```java

package selftuts;

import java.util.HashMap;

class Selftuts{

	public static void main(String[] args) {
	
		String str = "aaggccdd";
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		int lengthOfString  = str.length();
		
		for(int i=0;i<lengthOfString;i++) {
			Character currentChar = str.charAt(i);
			
			if(hmap.containsKey(currentChar)==false) {
				hmap.put(currentChar, 1);
			}else {
				int currentFreq = hmap.get(currentChar);
				currentFreq++;
				hmap.put(currentChar,currentFreq);
			}
			
		}
	
		boolean nonRepeatingFound = false;
		for(int i=lengthOfString-1;i>=0;i--) {
			Character currentChar = str.charAt(i);
			int currentFreq = hmap.get(currentChar);
			if(currentFreq == 1) {
				System.out.println(currentChar);
				nonRepeatingFound = true;
				break;
			}
		}
		if(nonRepeatingFound == false) {
			System.out.println(-1);
		}
		
	}
}

```
