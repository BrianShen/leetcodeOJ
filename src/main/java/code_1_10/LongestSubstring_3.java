package code_1_10;

import java.util.HashMap;
import java.util.Map;

/**
 * author: brian.shen  brian.shen@dianping.com
 * date: 2015/5/14  9:35*
 * description:Given a string, find the length of the longest substring without repeating characters. 
 *  For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 *  For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstring_3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0,right = 0;
        char[] str = s.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        while (right < str.length) {
            if (map.containsKey(str[right])) {
                int temp = map.get(str[right]) + 1;
                for(int i = left;i < temp;i ++) {
                    map.remove(str[i]);
                }
                left = temp;
            }
            map.put(str[right], right);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}
