package neetcode.ArraysHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	//Input: strs = ["eat","tea","tan","ate","nat","bat"]
	//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inputString = new String[] {"eat","tea","tan","ate","nat","bat"};
		HashMap<HashMap<Character, Integer>, List<String>> groupString = new HashMap<>();
		for(String singleStr : inputString) {
			HashMap<Character, Integer> singleString = new HashMap<>();
			for(int i = 0 ; i<singleStr.length() ; i++) {
				if(singleString.get(singleStr.charAt(i)) != null) {
					singleString.put(singleStr.charAt(i), singleString.get(singleStr.charAt(i)) + 1);
				}
				else {
					singleString.put(singleStr.charAt(i), 1);
				}
				
			}
			if(groupString.containsKey(singleString)) {
				groupString.get(singleString).add(singleStr);
			}
			else {
				groupString.put(singleString, new ArrayList<>(Arrays.asList(singleStr)));
			}
		}
		System.out.println(groupString);

	}

}
