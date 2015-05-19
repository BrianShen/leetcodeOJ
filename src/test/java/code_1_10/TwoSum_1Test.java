package code_1_10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * TwoSum_1 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 13, 2015</pre>
 */
public class TwoSum_1Test {
    private TwoSum_1 twoSum_1;

    @Before
    public void before() throws Exception {
        twoSum_1 = new TwoSum_1();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: twoSum(int[] numbers, int target)
     */
    @Test
    public void testTwoSum() throws Exception {
        int[] arr = new int[]{2, 3, 6, 4, 11, 8, 9, 5, 34, 23};
        int target = 19;
        int[] ret = twoSum_1.twoSum(arr, target);
        Assert.assertTrue(ret.length == 2);
        Assert.assertTrue(ret[0] == 5);
        Assert.assertTrue(ret[1] == 6);
    }


} 
