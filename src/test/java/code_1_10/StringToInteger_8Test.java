package code_1_10;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * StringToInteger_8 Tester.
 *
 * @author brian.shen
 * @version 1.0
 * @since ${DATE}  ${TIME}
 */
public class StringToInteger_8Test {
    private StringToInteger_8 stringToInteger_8;

    @Before
    public void before() throws Exception {
        stringToInteger_8 = new StringToInteger_8();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: myAtoi(String str)
     */
    @Test
    public void testMyAtoi() throws Exception {
        int ret = stringToInteger_8.myAtoi("-18446744073709551617");
        System.out.println(ret);
    }


    /**
     * Method: firstNotBlank(String s)
     */
    @Test
    public void testFirstNotBlank() throws Exception {

    }

} 
