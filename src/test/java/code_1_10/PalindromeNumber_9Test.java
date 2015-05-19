package code_1_10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * PalindromeNumber_9 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class PalindromeNumber_9Test {
    private PalindromeNumber_9 palindromeNumber;

    @Before
    public void before() throws Exception {
        palindromeNumber = new PalindromeNumber_9();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isPalindrome(int x)
     */
    @Test
    public void testIsPalindrome() throws Exception {
        boolean ret1 = palindromeNumber.isPalindrome(23432);
        boolean ret2 = palindromeNumber.isPalindrome(23434534);
        boolean ret3 = palindromeNumber.isPalindrome(-1876556781);
        Assert.assertTrue(ret1);
        Assert.assertTrue(!ret2);
        Assert.assertTrue(!ret3);
    }


} 
