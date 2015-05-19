package code_1_10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * ZigZagConversion_6 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class ZigZagConversion_6Test {
    private ZigZagConversion_6 zigzag;

    @Before
    public void before() throws Exception {
        zigzag = new ZigZagConversion_6();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: convert(String s, int numRows)
     */
    @Test
    public void testConvert() throws Exception {
        String s = "abcdefghijklmnopqrstuvwxyz";
        String ret = zigzag.convert(s, 5);
        Assert.assertTrue(ret.equals("aiqybhjprxzcgkoswdflntvemu"));
    }


} 
