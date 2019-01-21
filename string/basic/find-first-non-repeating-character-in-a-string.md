
```java
package selftuts;

import java.util.HashMap;

class Selftuts{

	public static void main(String[] args) {
		
			String str = "aagcdefccb";
			HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
			
			int lengthOfString = str.length();
			
			for(int i=0;i<lengthOfString;i++) {
				Character currentCharacter = str.charAt(i);
				if(hmap.containsKey(currentCharacter)==false) {
					hmap.put(currentCharacter,1);
				}else {
					int currentFreq = hmap.get(currentCharacter);
					currentFreq++;
					hmap.put(currentCharacter, currentFreq);
				}
			}
			
			boolean noRepeatingFound = false;
			for(int i=0;i<lengthOfString;i++) {
				
				Character currentCharacter = str.charAt(i);
				int currenFreq = hmap.get(currentCharacter);
				if(currenFreq == 1) {
					System.out.println(currentCharacter);
					noRepeatingFound = true;
					break;
				}
			}
			
			if(noRepeatingFound == false) {
				
					System.out.println(-1);
			}
	}
}








```
