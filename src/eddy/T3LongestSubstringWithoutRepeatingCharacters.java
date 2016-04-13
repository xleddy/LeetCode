package eddy;

import java.util.LinkedHashSet;
import java.util.Set;

public class T3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
    	Set set = new LinkedHashSet();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
