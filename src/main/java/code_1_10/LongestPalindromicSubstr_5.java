package code_1_10;

/**
 * author: brian.shen  brian.shen@dianping.com
 * date: 2015/5/14  10:54
 * description:最长回文字符串:如果一个字符串从左向右写和从右向左写是一样的,这样的字符串就叫做palindromic string
 *  Given a string S, find the longest palindromic substring in S.
 *  You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstr_5 {
    public String longestPalindrome(String s) {
        if (s == null) return null;
        char[] str = s.toCharArray();
        int maxLen = 0;
        int [] max = new int[2];
        int pos = 0;
        while (pos < str.length - 1) {
            if (str[pos] == str[pos + 1]) {
                for(int i = 0;i <= Math.min(pos,str.length - pos);i ++) {
                    if ((pos + i + 1) > str.length - 1) break;
                    if (str[pos - i] == str[pos + i + 1]) {
                        if (2 * i + 2 >maxLen) {
                            max[0] = pos - i;
                            max[1] = pos + i + 1;
                            maxLen = 2 * i + 2;
                        }
                    } else break;
                }
            }
            for (int i = 0;i <= Math.min(pos,str.length - pos + 1);i ++) {
                if ((pos + i) > str.length - 1) break;
                if (str[pos - i] == str[pos + i]) {
                    if (2 * i + 1 >maxLen) {
                        max[0] = pos - i;
                        max[1] = pos + i;
                        maxLen = 2 * i + 1;
                    }
                } else break;
            }
            pos ++;
        }

        return s.substring(max[0],max[1] + 1);
    }
}
