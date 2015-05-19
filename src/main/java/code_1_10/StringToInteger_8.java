package code_1_10;

import java.util.Stack;

/**
 * author: brian.shen  brian.shen@dianping.com
 * date: 2015/5/19  11:24
 * description:Implement atoi to convert a string to an integer.
 * * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 */
public class StringToInteger_8 {
    public int myAtoi(String str) {
        if (firstNotBlank(str) == ' ' || str == "") return 0;
        if ((firstNotBlank(str) > '9'|| firstNotBlank(str) < '0') && firstNotBlank(str) != '-' && firstNotBlank(str) != '+') return 0;
        String sub = str.substring(str.indexOf(firstNotBlank(str)));
        int flag = 1;
        if (sub.charAt(0) == '-') {
            flag = -1;
            sub = sub.substring(1);
        }else if(sub.charAt(0) == '+'){
            sub = sub.substring(1);
        }
        long ret = 0;
        for (int i = 0;i < sub.length();i ++) {
            if (sub.charAt(i) >= '0' && sub.charAt(i) <= '9') {
                ret = ret * 10 + sub.charAt(i) - '0';
                if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE) {
                    if (flag == 1) return Integer.MAX_VALUE;
                    else return Integer.MIN_VALUE;
                }
            }
            else break;
        }
        ret *= flag;
        return (int) ret;
    }
    
    private Character firstNotBlank(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < arr.length;i ++) {
            if (arr[i] == ' ') {
                continue;
            }else {
                return arr[i];
            }
        }
        return ' ';
    }

}
