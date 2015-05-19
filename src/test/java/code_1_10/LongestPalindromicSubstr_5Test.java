package code_1_10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * LongestPalindromicSubstr_5 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class LongestPalindromicSubstr_5Test {
    private LongestPalindromicSubstr_5 lps;

    @Before
    public void before() throws Exception {
        lps = new LongestPalindromicSubstr_5();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: longestPalindrome(String s)
     */
    @Test
    public void testLongestPalindrome() throws Exception {
        String s = "eeeeeeeeeeeeeee";
        String longest = lps.longestPalindrome(s);
        System.out.println(longest);
        Assert.assertTrue(longest.equals("eeeeeeeeeeeeeee"));
    }


} 
