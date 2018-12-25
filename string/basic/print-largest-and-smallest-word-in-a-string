

```java

package selftuts;

public class Selftuts {
	public static void main(String[] args) {
		
		String sentence = "selftuts is a good place to learn";
		int characterCountInLargestWord = -1;
		int characterCountInSmallestWord = sentence.length()+1;
		int currentWordCount = 0;
		int startIndexOfLargestWord = -1;
		int startIndexOfSmallestWord = -1;
		
		int lenthOfSting = sentence.length();
		
		for(int i=0;i<lenthOfSting;i++) {
			if(sentence.charAt(i)==' ') {
				if(currentWordCount > characterCountInLargestWord) {
					characterCountInLargestWord = currentWordCount;
					startIndexOfLargestWord = i - currentWordCount;
				}
				if(currentWordCount < characterCountInSmallestWord) {
					characterCountInSmallestWord = currentWordCount;
					startIndexOfSmallestWord = i - currentWordCount;
				}
				currentWordCount = 0;
			}else {
				currentWordCount++;
			}
				
		}
		if(currentWordCount > characterCountInLargestWord) {
			characterCountInLargestWord = currentWordCount;
			startIndexOfLargestWord = lenthOfSting - currentWordCount;
		}
		if(currentWordCount < characterCountInSmallestWord) {
				characterCountInSmallestWord = currentWordCount;
				startIndexOfSmallestWord = lenthOfSting - currentWordCount;
		}
		
		System.out.println("Index of largest word : "+ startIndexOfLargestWord);
		System.out.println("Index of smallest word : "+ startIndexOfSmallestWord);
		
	}
}


```
