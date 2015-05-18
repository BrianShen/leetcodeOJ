package code_1_10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * ReverseInteger_7 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class ReverseInteger_7Test {
    private ReverseInteger_7 reverse;

    @Before
    public void before() throws Exception {
        reverse = new ReverseInteger_7();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: reverse(int x)
     */
    @Test
    public void testReverse() throws Exception {
        int ret = reverse.reverse(214748);
        System.out.println(ret);
//        Assert.assertTrue(ret == 0);
    }


} 
