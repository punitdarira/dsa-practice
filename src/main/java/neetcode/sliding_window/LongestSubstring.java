package neetcode.sliding_window;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSubstring {

	public static void main(String[] args) {
		String inputString = "bbbb";
		System.out.println("Output- " + getLongestSubString(inputString));
	}

	private static String getLongestSubString(String inputString) {
		Set<Character> subString = new LinkedHashSet<>();
		String longestSubString = "";
		for(int i = 0 ;i<inputString.length() ; i++) {
			if(subString.contains(inputString.charAt(i))) {
				longestSubString = subString.size() > longestSubString.length()? getStringRepresentation(subString):longestSubString;
				subString.clear();
			}
			subString.add(inputString.charAt(i));
		}
		
		return longestSubString;
	}
	
	private static String getStringRepresentation(Set<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
	
	

}
