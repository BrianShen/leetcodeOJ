package code_1_10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * LongestSubstring_3 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class LongestSubstring_3Test {
    private LongestSubstring_3 longestSubstring_3;
    @Before
    public void before() throws Exception {
        longestSubstring_3 = new LongestSubstring_3();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: lengthOfLongestSubstring(String s)
     */
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        String s = "adcfcdsdwerrtrtrgggyuioplk";
        int max = longestSubstring_3.lengthOfLongestSubstring(s);
        Assert.assertTrue(max == 8);
    }


} 
