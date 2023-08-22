package ztm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.*;


public class Main {
	public static final HashMap<Character, Character> PARANTHESIS_HASHMAP = new HashMap<>();
	static
	{
		PARANTHESIS_HASHMAP.put('}', '{');
		PARANTHESIS_HASHMAP.put(')', '(');
		PARANTHESIS_HASHMAP.put(']', '[');
	}
	
	public static void main(String[] args) {
		//removeDuplicateCharsString("java");
		//printDuplicateCharactersInString("java and javascript");
		//removeCharsFromFirstStringWhichArePresentInSecond("India is great", "in");
		//checkStringsAreRotationsOfEachOther("ABCD", "BCDA");
		//System.out.println(reverseRecursively("abc"));
		//printAllPermutationsOfAString("", "abcd");
		//firstNonRepeatingCharacterInString("java");
		//reverseWordsInAString("Java is best");
		//smallestSubstringContainingAllCharsOfOtherString("this is a test string", "tist");
		//checkWhetherStringsAreAnagram("Army", "Mary");
		//removeGivenCharacterFromString("Programming", 'm');
		//checkIfValidParanthesis("[()]{}{[()()]()}");
		//find2ElementsWhichAddsToASpecificValue(new Integer[] {2, 8, 7, 5, -1, 9, 3, 4}, 11);
		//Integer[] inputArray = {2, 8, 7, 5, -1, 9, 3, 4};Arrays.sort(inputArray);
		/*Integer[] inputArray = {1, 2, 3, 4};Arrays.sort(inputArray);
		findElementsWhichAddsToASpecificValue(new Stack<Integer>(),inputArray , 6);*/
		//findPalindromicSubstringsInAString("", "nitin");
		//checkIfNumberIsPalindrome(12321);
		//getAllPossibleSubStringOfPerticularLength("", "ab", 3);
		//subStringsWithSameFirstAndLastChar("abcab");
		//selectionSort(new int[] {64, 25, 12, 22, 11});
		//bubbleSort(new int[] {64, 25, 12, 22, 11});
		//bubbleSortRecursion(false, new int[] {64, 25, 12, 22, 11});
		//insertionSort(new int[] {64, 25, 12, 22, 11});
		
		
		String input = "2022-01-20";
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat outputFormat = new SimpleDateFormat("MM/dd/yy");
		Date date;
		try {
			date = inputFormat.parse(input);
			String output = outputFormat.format(date);
			System.out.println(output);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	public static void test(Object i) {
		System.out.println("object");
	}
	public static void test(int i) {
		System.out.println("int");
	}
	public static void test(char i) {
		System.out.println("char");
	}
	public static void test(Number i) {
		System.out.println("number");
	}
	public static void test(short i) {
		System.out.println("short");
	}
	public static void insertionSort(int[] inputArray) {
		for(int i = 1 ; i < inputArray.length ; i++) {
			//check if number is less than previous ones
			int desiredIndexForInsertion = i;
			for(int j = i-1 ; j >= 0 ; j--) {
				if(inputArray[i] < inputArray[j]) {
					desiredIndexForInsertion = j;
				}
				else {
					break;
				}
			}
			//checking whether is there a need to insert 
			if(desiredIndexForInsertion < i) {
				int elementToInsert = inputArray[i];
				for(int lastIndex = i-1; lastIndex >= desiredIndexForInsertion ; lastIndex--) {
					inputArray[lastIndex + 1] = inputArray[lastIndex];
				}
				inputArray[desiredIndexForInsertion] = elementToInsert;
				
			}
		}
		for(int i = 0 ; i < inputArray.length ; i++) {
			System.out.println(inputArray[i]);
		}
		
	}
	
	
	public static void bubbleSortRecursion(boolean sorted, int[] inputArray) {
		if(sorted == true) {
			for(int i = 0 ; i < inputArray.length ; i++) {
				System.out.println(inputArray[i]);
			}
			return;
		}
		sorted = true;
		for(int i = 0 ; i<inputArray.length - 1; i++) {
			if(inputArray[i+1] < inputArray[i]) {
				int temp = inputArray[i+1];
				inputArray[i+1] = inputArray[i];
				inputArray[i] = temp;
				sorted = false;
			}
		}
		bubbleSortRecursion(sorted, inputArray);
	}
	public static void bubbleSort(int[] inputArray) {
		while(true) {
			boolean sorted = true;
			for(int i = 0 ; i < inputArray.length - 1 ; i++) {
				if(inputArray[i+1] < inputArray[i]) {
					int temp = inputArray[i+1];
					inputArray[i+1] = inputArray[i];
					inputArray[i] = temp;
					sorted = false;
				}
			}
			if(sorted == true) {
				for(int i = 0 ; i < inputArray.length ; i++) {
					System.out.println(inputArray[i]);
				}
				break;
			}
		}
	}
	
	public static void selectionSort(int[] inputArray) {
		for(int i = 0 ; i < inputArray.length ; i++) {			
			int indexWithSmallestValue = i;
			for( int j = i+1 ; j < inputArray.length ; j++) {
				if(inputArray[j] < inputArray[indexWithSmallestValue]) {
					indexWithSmallestValue = j;
				}
			}
			int temp = inputArray[indexWithSmallestValue];
			inputArray[indexWithSmallestValue] = inputArray[i];
			inputArray[i] = temp;
			
		}
		for(int i = 0 ; i<inputArray.length ; i++) {
			System.out.println(inputArray[i]);
		}
	}
	//MINOR ERROR
	public static void subStringsWithSameFirstAndLastChar(String inputString) {
		for(int i = 0 ; i<inputString.length() ; i++) {
			subStringsWithSameFirstAndLastCharRecursive("", inputString.substring(i, inputString.length()));
		}
	}
	public static void subStringsWithSameFirstAndLastCharRecursive(String subString, String inputString) {
		if(inputString.length() == 0)
			return;
		if(!subString.equals("") && subString.substring(0, 1).equals(subString.substring(subString.length()-1, subString.length()))) {
			System.out.println(subString);
		}
		subStringsWithSameFirstAndLastCharRecursive(subString + inputString.substring(0, 1), inputString.substring(1, inputString.length()));

		
	}
	public static void getAllPossibleSubStringOfPerticularLength(String subString, String inputString, int sizeOfSubString) {
		if(subString.length() == sizeOfSubString) {
			System.out.println(subString);
		}
		else {
			for(int i = 0 ; i<inputString.length() ; i++) {
				String subStringArg = subString + inputString.substring(i, i+1);
				getAllPossibleSubStringOfPerticularLength(subStringArg, inputString, sizeOfSubString);
			}
		}

	}
	
	//NOT PROPERLY UNDERSTOOD
	public static void findPalindromicSubstringsInAString(String subString, String inputString) {
		StringBuilder subStringBuilder = new StringBuilder(subString);
		if(!subString.equals("") && subString.equals(subStringBuilder.reverse().toString())){
			System.out.println(subString);
		}
		if(!inputString.isEmpty()) {
			subString = subString + inputString.substring(0, 1);
			inputString = inputString.substring(1, inputString.length());
			findPalindromicSubstringsInAString(subString, inputString);
		}

		/*
		 * for(int i = 0 ; i<inputString.length() ; i++) { String subString1 =
		 * inputString.substring(0, i+1) + subString; String subString2 =
		 * inputString.substring(i+1, inputString.length());
		 * findPalindromicSubstringsInAString(subString1, subString2); }
		 */
	}
	//This code is not correct but the method is right. 
	public static void findElementsWhichAddsToASpecificValue(Stack<Integer> resultArray, Integer[] inputArray, int addValue) {
		if(inputArray[0] == addValue) {
			resultArray.add(inputArray[0]);
			System.out.print("Found sequence-");
			System.out.println(resultArray);
		}
		else {
			for(int i = 0 ; i<inputArray.length-1 ; i++) {
				if(inputArray[i+1] > addValue) {
					break;
				}
				resultArray.add(inputArray[i]);
				Integer[] subArray = Arrays.copyOfRange(inputArray, i+1, inputArray.length);
				findElementsWhichAddsToASpecificValue((Stack)resultArray.clone(), subArray, addValue - inputArray[i]);
				resultArray.pop();
			}
		}

	}

	
	public static void find2ElementsWhichAddsToASpecificValue(Integer[] inputArray, int addValue) {
		for(int i = 0; i<inputArray.length-1; i++) {
			int requiredAnotherNumber = addValue - inputArray[i];
			Integer[] subArray = Arrays.copyOfRange(inputArray, i+1, inputArray.length-1);
			List<Integer> subList = Arrays.asList(subArray);
			if(subList.contains(requiredAnotherNumber))
				System.out.println("Found pair- "+inputArray[i] + " and "+requiredAnotherNumber );
		}
	}
	
	
	//THIS IS DONE USING STACK
	public static void checkIfValidParanthesis(String inputString) {
		Stack< stack = new Stack<>();
		boolean isParanthesisValid = true;
		for(int i = 0 ; i<inputString.length() ; i++) {
			if(PARANTHESIS_HASHMAP.values().contains(inputString.charAt(i))){
				stack.add(inputString.charAt(i));
			}
			else {
				if(stack.peek().equals(PARANTHESIS_HASHMAP.get(inputString.charAt(i)))){
					stack.pop();
				}
				else {
					isParanthesisValid = false;
					break;
				}
			}
		}
		if (isParanthesisValid == true)
			System.out.println("Valid paranthesis");
		else
			System.out.println("Invalid paranthesis");				
	}
	
	public static void removeGivenCharacterFromString(String inputString, char givenChar) {
		//we can even use string's inbuild function of replace and replaceall
		StringBuilder resultString = new StringBuilder();
		for(int i = 0 ; i<inputString.length() ; i++) {
			if(inputString.charAt(i) != givenChar) {
				resultString.append(inputString.charAt(i));
			}
		}
		System.out.println(resultString);
	}
	public static void checkWhetherStringsAreAnagram(String s1, String s2) {
		List<Character> s1List = s1.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.toList());
		Collections.sort(s1List);
		List<Character> s2List = s2.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.toList());
		Collections.sort(s2List);
		if(s1List.equals(s2List))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");
		
	}
	
	public static void smallestSubstringContainingAllCharsOfOtherString(String mainInput, String searchString) {
		//this is a brute force method. There is also an efficient method on the internet
		//efficient on is minWindow() in this file
		List<Character> charList = searchString.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		int minimumSubStringLength = charList.size();
		for(int i = minimumSubStringLength ; i<=mainInput.length() ; i++) {
			for(int j = 0; j<=mainInput.length()-i ; j++) {
				List<Character> subStringToCompare = mainInput.substring(j, j+i).chars().mapToObj(c->(char)c).collect(Collectors.toList());
				if(subStringToCompare.containsAll(charList)) {
					System.out.println("Shortest string is "+ mainInput.substring(j, j+i));
					return;
				}
			}
		}
	}
	
	public static void reverseWordsInAString(String inputString) {
		List<String> listString = Arrays.asList(inputString.split(" "));
		Collections.reverse(listString);
		System.out.println(listString);
		
	}
	
	public static void firstNonRepeatingCharacterInString(String inputString) {
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.lastIndexOf(inputString.charAt(i)) == i
					&& (inputString.indexOf(inputString.charAt(i)) == i)) {
				System.out.println("First non repeating character is " + inputString.charAt(i));
				break;
			}
		}
	}
	
	public static void printAllPermutationsOfAString(String firstChar, String inputString) {
		if(inputString.length() == 1) {
			System.out.println(firstChar+inputString);
			return;
		}
		for(int i = 0; i<inputString.length(); i++) {
			printAllPermutationsOfAString(firstChar+inputString.charAt(i)+"", inputString.substring(0,i)+inputString.substring(i+1));
		}
	}
	
	public static void removeDuplicateCharsString(String inputString) {
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for(int i = 0; i<inputString.length(); i++) {
			linkedHashSet.add(inputString.substring(i, i+1));
		}
		String resultString = linkedHashSet.stream().reduce("", (a, b)->a.concat(b));
		System.out.println(resultString);
	}
	
	public static void printDuplicateCharactersInString(String inputString) {
		Set<Character> duplicateChars = new HashSet<>();
		inputString = inputString.toLowerCase();
		for(int i = 0; i<inputString.length(); i++) {
			if(inputString.lastIndexOf(inputString.charAt(i)) != i) {
				duplicateChars.add(inputString.charAt(i));
			}
		}
		System.out.println(duplicateChars);
	}
	
	public static void removeCharsFromFirstStringWhichArePresentInSecond(String firstString, String secondString) {
		StringBuilder resultString = new StringBuilder();
	    List<Character> secondStringList = secondString.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		for(int i = 0; i<firstString.length(); i++) {
			if(!secondStringList.contains(firstString.charAt(i))){
				resultString.append(firstString.charAt(i));
			}
		}
		System.out.println(resultString);
	}
	
	public static void checkStringsAreRotationsOfEachOther(String string1, String string2) {
		//fast solution from the internet
		//return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
		String stringToCompare = string2;
		boolean stringsAreToRotations = false;
		StringBuilder stringBuilder = new StringBuilder(string2);
		for(int i = 0; i<string2.length()-1; i++) {
			stringBuilder.insert(0, stringBuilder.charAt(stringBuilder.length()-1)).deleteCharAt(stringBuilder.length()-1);
			if(string1.equals(stringBuilder.toString())) {
				stringsAreToRotations = true;
				break;
			}
		}
		if(stringsAreToRotations == true)
			System.out.println("Yes. Strings are rotations of each other");
		else
			System.out.println("No. Strings are not rotions of each other");
	}
	
	public static String reverseRecursively(String str) {
        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
	
	//This method is called sliding window
	public String minWindow(String s, String t) {
	      if (s.length() == 0 || t.length() == 0) {
	          return "";
	      }

	      // Dictionary which keeps a count of all the unique characters in t.
	      Map<Character, Integer> dictT = new HashMap<Character, Integer>();
	      for (int i = 0; i < t.length(); i++) {
	          int count = dictT.getOrDefault(t.charAt(i), 0);
	          dictT.put(t.charAt(i), count + 1);
	      }

	      // Number of unique characters in t, which need to be present in the desired window.
	      int required = dictT.size();

	      // Left and Right pointer
	      int l = 0, r = 0;

	      // formed is used to keep track of how many unique characters in t
	      // are present in the current window in its desired frequency.
	      // e.g. if t is "AABC" then the window must have two A's, one B and one C.
	      // Thus formed would be = 3 when all these conditions are met.
	      int formed = 0;

	      // Dictionary which keeps a count of all the unique characters in the current window.
	      Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();

	      // ans list of the form (window length, left, right)
	      int[] ans = {-1, 0, 0};

	      while (r < s.length()) {
	          // Add one character from the right to the window
	          char c = s.charAt(r);
	          int count = windowCounts.getOrDefault(c, 0);
	          windowCounts.put(c, count + 1);

	          // If the frequency of the current character added equals to the
	          // desired count in t then increment the formed count by 1.
	          if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
	              formed++;
	          }

	          // Try and contract the window till the point where it ceases to be 'desirable'.
	          while (l <= r && formed == required) {
	              c = s.charAt(l);
	              // Save the smallest window until now.
	              if (ans[0] == -1 || r - l + 1 < ans[0]) {
	                  ans[0] = r - l + 1;
	                  ans[1] = l;
	                  ans[2] = r;
	              }

	              // The character at the position pointed by the
	              // `Left` pointer is no longer a part of the window.
	              windowCounts.put(c, windowCounts.get(c) - 1);
	              if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
	                  formed--;
	              }

	              // Move the left pointer ahead, this would help to look for a new window.
	              l++;
	          }

	          // Keep expanding the window once we are done contracting.
	          r++;   
	      }

	      return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	  }

}
