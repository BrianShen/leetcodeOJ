package code_1_10;

/**
 * author: brian.shen  brian.shen@dianping.com
 * date: 2015/5/19  18:36
 * description:Determine whether an integer is a palindrome. Do this without extra space.
 * Some hints:
 * * Could negative integers be palindromes? (ie, -1)
 * * If you are thinking of converting the integer to string, note the restriction of using extra space.
 * * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. 
 * * How would you handle such case?
 * * There is a more generic way of solving this problem.*
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        int temp = x;
        long reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return x == reverse;
    }
}
