import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountOccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strng = "Character of a String";
		Map<Character,Integer> nhm = new HashMap<Character,Integer>();
		
		for(int i =0 ; i< strng.length();i++) {
			char c = Character.toLowerCase(strng.charAt(i));
			if (!nhm.containsKey(c)) {
				if(c != ' ') {          // removing space from Hash Map
					nhm.put(c,1);		//putting first time character in the hash map
				}
			}
			else {
				nhm.put(c, nhm.get(c)+1);		//incrementing the value of character in hash map
			}
			
			
		}		
		System.out.println(nhm);
		
		Map<Character,Integer> tnhm = new TreeMap<Character,Integer>(nhm); 		//using Tree map for sorting the keys in hash Map
		
		System.out.println(tnhm);
		
	}

}
